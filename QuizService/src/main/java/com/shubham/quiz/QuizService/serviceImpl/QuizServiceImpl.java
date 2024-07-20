package com.shubham.quiz.QuizService.serviceImpl;

import com.shubham.quiz.QuizService.model.Quiz;
import com.shubham.quiz.QuizService.repository.QuizRepository;
import com.shubham.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(int id) {
        return quizRepository.findById(id)
                .orElse(null);
    }
}
