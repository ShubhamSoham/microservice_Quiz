package com.shubham.quiz.QuizService.serviceImpl;

import com.shubham.quiz.QuizService.model.Quiz;
import com.shubham.quiz.QuizService.repository.QuizRepository;
import com.shubham.quiz.QuizService.services.QuestionClient;
import com.shubham.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.saveAndFlush(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {

        List<Quiz> quizList = quizRepository.findAll();
        List<Quiz> newQuizList = quizList.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getQuizId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quiz getQuizById(int id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getQuizId()));
        return quiz;
    }
}
