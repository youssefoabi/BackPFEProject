package com.cdiscount.fraudengine.fraudengine.controller;


import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/rules")
public class RulesController {

    @Autowired
    private IRulesService rulesService;

    @PostMapping(path="")
    public ResponseEntity<CreateRuleResponse> createRule(@RequestBody CreateRuleRequest request) {
        return  new ResponseEntity(rulesService.createRule(request), HttpStatus.CREATED);
    }

    @PutMapping(path="")
    public ResponseEntity<CreateRuleResponse> updateRule(@RequestBody CreateRuleRequest request) {
        return  new ResponseEntity(rulesService.updateRule(request), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<CreateRuleRequest>> getAllRules(){
        return  new ResponseEntity(rulesService.getAllRules(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CreateRuleRequest>> getRuleById(@PathVariable String id){
        return  new ResponseEntity(rulesService.getRuleById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRule(@PathVariable String id){
        return  new ResponseEntity(rulesService.deleteRuleById(id), HttpStatus.OK);
    }
}

