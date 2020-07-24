package com.cdiscount.fraudengine.fraudengine.controller;


import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.service.ICriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/criteria")
public class CriteriaController {

    @Autowired
    private ICriteriaService criteriaService;

    @PostMapping(path="")
    public ResponseEntity<CreateCriterionResponse> createCriterion(@RequestBody CreateCriterionRequest request) {
        return  new ResponseEntity(criteriaService.createCriterion(request), HttpStatus.CREATED);
    }

    @PutMapping(path="")
    public ResponseEntity<CreateCriterionResponse> updateCriterion(@RequestBody CreateCriterionRequest request) {
        return  new ResponseEntity(criteriaService.updateCriterion(request), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<CreateCriterionRequest>> getAllCriteria(){
        return  new ResponseEntity(criteriaService.getAllCriteria(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CreateCriterionRequest>> getCriterionById(@PathVariable String id){
        return  new ResponseEntity(criteriaService.getCriterionById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCriterion(@PathVariable String id){
        return  new ResponseEntity(criteriaService.deleteCriterionById(id), HttpStatus.OK);
    }
}

