package com.shubham.quiz.QuestionService.service;

import com.shubham.quiz.QuestionService.model.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(Question question); //add question

    Question getQuestionById(int id); //get question by id

    List<Question> getAllQuestions(); //get all questions

    List<Question> getQuestionsByQuiz(int quizId); //get question by quiz id
}
