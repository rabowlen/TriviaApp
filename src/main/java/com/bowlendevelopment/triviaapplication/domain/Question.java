package com.bowlendevelopment.triviaapplication.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Document
public class Question {

    @Id
    private String questionId;
    private String text;
    private Date creationDate = new Date();
    private List<AnswerChoice> answerChoiceList;

    public Question(String questionId, String text, Date creationDate, List<AnswerChoice> answerChoiceList) {
        this.questionId = questionId;
        this.text = text;
        this.creationDate = creationDate;
        this.answerChoiceList = answerChoiceList;
    }

    public Question() {
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<AnswerChoice> getAnswerChoiceList() {
        return answerChoiceList;
    }

    public void setAnswerChoiceList(List<AnswerChoice> answerChoiceList) {
        this.answerChoiceList = answerChoiceList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", text='" + text + '\'' +
                ", creationDate=" + creationDate +
                ", answerChoiceList=" + answerChoiceList +
                '}';
    }
}


