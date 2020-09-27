package com.bowlendevelopment.triviaapplication.repository;

import com.bowlendevelopment.triviaapplication.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
}
