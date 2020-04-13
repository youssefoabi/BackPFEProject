package com.cdiscount.fraudengine.fraudengine.service.impl;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;
import com.cdiscount.fraudengine.fraudengine.repository.ICriterionsRepository;
import com.cdiscount.fraudengine.fraudengine.service.ICriterionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class CriterionsService implements ICriterionsService {


    @Autowired
    private ICriterionsRepository criterionsRepository;




    @Override
    public CreateCriterionResponse createCriterion(CreateCriterionRequest request) {
        return new CreateCriterionResponse(criterionsRepository.save(request));
    }



    @Override
    public List<CreateCriterionRequest> getAllCriterions() {
        return criterionsRepository.findAll();
    }

    @Override
    public Optional<CreateCriterionRequest> getCriterionsById(String id){
        return  criterionsRepository.findById(id);
    }
}
