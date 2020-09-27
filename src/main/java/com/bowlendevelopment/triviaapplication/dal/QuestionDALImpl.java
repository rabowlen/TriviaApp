package com.bowlendevelopment.triviaapplication.dal;

import com.bowlendevelopment.triviaapplication.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Repository
public class QuestionDALImpl implements QuestionDAL {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Question> getAllQuestions() {
        return mongoTemplate.findAll(Question.class);
    }

    @Override
    public Question getQuestionById(String questionId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("questionId").is(questionId));
        return mongoTemplate.findOne(query, Question.class);
    }

    @Override
    public Question addNewQuestion(Question question) {
        mongoTemplate.save(question);
        // Now, question object will contain the ID as well
        return question;
    }
}
