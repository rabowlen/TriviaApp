package com.bowlendevelopment.triviaapplication.dal;

import com.bowlendevelopment.triviaapplication.domain.Question;

import java.util.List;

public interface QuestionDAL {

    List<Question> getAllQuestions();

    Question getQuestionById(String questionId);

    Question addNewQuestion(Question question);
}
