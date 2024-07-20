package com.shubham.quiz.QuizService.services;

import com.shubham.quiz.QuizService.model.Quiz;

import java.util.List;

public interface QuizService {

    Quiz addQuiz(Quiz quiz) ;

    List<Quiz> getAllQuiz();

    Quiz getQuizById(int id);

//    Quiz updateQuiz(Quiz quiz);

}
