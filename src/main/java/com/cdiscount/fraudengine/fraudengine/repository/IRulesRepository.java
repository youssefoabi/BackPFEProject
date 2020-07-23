package com.cdiscount.fraudengine.fraudengine.repository;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;


public interface IRulesRepository extends MongoRepository<CreateRuleRequest, String> {

}
