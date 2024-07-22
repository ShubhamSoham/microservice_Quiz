package com.shubham.quiz.QuizService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private int questionId;
    private String question;
    private int quizId;
}

