package com.cdiscount.fraudengine.fraudengine.service.impl;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.repository.ICriteriaRepository;
import com.cdiscount.fraudengine.fraudengine.service.ICriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class CriteriaService implements ICriteriaService {


    @Autowired
    private ICriteriaRepository criteriaRepository;

    @Override
    public CreateCriterionResponse createCriterion(CreateCriterionRequest request) {
        return new CreateCriterionResponse(criteriaRepository.save(request));
    }

    @Override
    public List<CreateCriterionRequest> getAllCriteria() {
        return criteriaRepository.findAll();
    }

    @Override
    public Optional<CreateCriterionRequest> getCriterionById(String id){
        return  criteriaRepository.findById(id);
    }

    @Override
    public String deleteCriterionById(String id) {
        criteriaRepository.deleteById(id);
        return "Success";
    }

    @Override
    public CreateCriterionResponse updateCriterion(CreateCriterionRequest request) {

        CreateCriterionRequest criterionInDB = criteriaRepository.findById(request.getId()).get();

        criterionInDB.setCode(request.getCode());
        criterionInDB.setExplanation(request.getExplanation());
        criterionInDB.setEligibleOperators(request.getEligibleOperators());
        criterionInDB.setCreatedAt(request.getCreatedAt());
        criterionInDB.setModifiedAt(request.getModifiedAt());

        return new CreateCriterionResponse(criteriaRepository.save(criterionInDB));
    }
}
