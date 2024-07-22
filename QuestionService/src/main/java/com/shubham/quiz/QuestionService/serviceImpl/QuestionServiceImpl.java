package com.shubham.quiz.QuestionService.serviceImpl;

import com.shubham.quiz.QuestionService.model.Question;
import com.shubham.quiz.QuestionService.repository.QuestionRepository;
import com.shubham.quiz.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.saveAndFlush(question);
    }

    @Override
    public Question getQuestionById(int id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getQuestionsByQuiz(int quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
