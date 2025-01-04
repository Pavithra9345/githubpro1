package com.project.BalaiyaInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.BalaiyaInsurance.entity.InsurancePlan;
import com.project.BalaiyaInsurance.service.InsurancePlanService;

@RestController
@RequestMapping("/api/plans")
public class InsurancePlanController {
	
	@Autowired
    private InsurancePlanService service;

    @GetMapping("/getplans")
    public List<InsurancePlan> getAllPlans() {
        return service.getAllPlans();
    }

    @PostMapping("/addplans")
    public InsurancePlan addPlan(@RequestBody InsurancePlan plan) {
        return service.addPlan(plan);
    }
    
    @DeleteMapping("/getplanbyid/{id}")
    public String deletePlan(@PathVariable Long id) {
        service.deletePlan(id);
        return "Delete Successfully";
    }

}
