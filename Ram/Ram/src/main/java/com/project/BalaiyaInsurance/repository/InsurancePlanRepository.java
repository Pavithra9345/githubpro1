package com.project.BalaiyaInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.BalaiyaInsurance.entity.InsurancePlan;

@Repository
public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Long>{

}
