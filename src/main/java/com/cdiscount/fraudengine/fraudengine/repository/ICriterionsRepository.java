package com.cdiscount.fraudengine.fraudengine.repository;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface ICriterionsRepository extends MongoRepository<CreateCriterionRequest,String> {

}