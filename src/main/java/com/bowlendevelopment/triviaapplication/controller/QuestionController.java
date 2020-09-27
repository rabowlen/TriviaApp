package com.bowlendevelopment.triviaapplication.controller;

import com.bowlendevelopment.triviaapplication.dal.QuestionDAL;
import com.bowlendevelopment.triviaapplication.domain.Question;
import com.bowlendevelopment.triviaapplication.repository.QuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final QuestionRepository questionRepository;

    private final QuestionDAL questionDAL;

    public QuestionController(QuestionRepository questionRepository, QuestionDAL questionDAL){
        this.questionRepository = questionRepository;
        this.questionDAL = questionDAL;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Question> getAllQuestions() {
        log.info("Getting all users.");
        return questionRepository.findAll();
    }


    @RequestMapping(value = "/{questionId}", method = RequestMethod.GET)
    public Question getQuestion(@PathVariable String questionId) {
        log.info("Getting user with ID: {}.", questionId);
        Optional<Question> user = questionRepository.findById(questionId);
        return user.orElse(null);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Question addNewQuestion(@RequestBody Question question) {
        log.info("Saving user.");
        return questionRepository.save(question);
    }
}
