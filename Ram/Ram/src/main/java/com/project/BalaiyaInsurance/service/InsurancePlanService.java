package com.project.BalaiyaInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BalaiyaInsurance.entity.InsurancePlan;
import com.project.BalaiyaInsurance.repository.InsurancePlanRepository;

@Service
public class InsurancePlanService {
	
	@Autowired
    private InsurancePlanRepository repository;

    public List<InsurancePlan> getAllPlans() {
        return repository.findAll();
    }

    public InsurancePlan addPlan(InsurancePlan plan) {
    	
        return repository.save(plan);
    }
    
    public void deletePlan(Long id) {
        repository.deleteById(id);
    }

}
