package com.cdiscount.fraudengine.fraudengine.controller;


import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/fraud-rules")
public class RulesController {

    @Autowired
    private IRulesService rulesService;

    @PostMapping(path="/create")
    public ResponseEntity<CreateRuleResponse> createRule(@RequestBody CreateRuleRequest request) {
        return  new ResponseEntity(rulesService.createRule(request), HttpStatus.CREATED);
    }


    @GetMapping("/findAllRules")
    public ResponseEntity<List<CreateRuleRequest>> getAllRules(){
        return  new ResponseEntity(rulesService.getAllRules(), HttpStatus.OK);
    }

    @GetMapping("/findByIdRules/{id}")
    public ResponseEntity<Optional<CreateRuleRequest>> getRulesById(@PathVariable String id){
        return  new ResponseEntity(rulesService.getRulesById(id), HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    public String deleteRule(@PathVariable long id){
//        rulesRepository.deleteById(id);
//        return "delete";
//    }
}
