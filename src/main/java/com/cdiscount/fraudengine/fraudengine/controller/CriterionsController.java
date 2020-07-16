package com.cdiscount.fraudengine.fraudengine.controller;


import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.service.ICriterionsService;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/fraud-criterions")
public class CriterionsController {

    @Autowired
    private ICriterionsService criterionsService;

    @PostMapping(path="/create")
    public ResponseEntity<CreateCriterionResponse> createCriterion(@RequestBody CreateCriterionRequest request) {
        return  new ResponseEntity(criterionsService.createCriterion(request), HttpStatus.CREATED);
    }


    @GetMapping("/findAllCriterions")
    public ResponseEntity<List<CreateCriterionRequest>> getAllCriterions(){
        return  new ResponseEntity(criterionsService.getAllCriterions(), HttpStatus.OK);
    }

    @GetMapping("/findByIdCriterions/{id}")
    public ResponseEntity<Optional<CreateCriterionRequest>> getCriterionsById(@PathVariable String id){
        return  new ResponseEntity(criterionsService.getCriterionsById(id), HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    public String deleteCriterion(@PathVariable long id){
//        criterionsRepository.deleteById(id);
//        return "delete";
//    }
}

