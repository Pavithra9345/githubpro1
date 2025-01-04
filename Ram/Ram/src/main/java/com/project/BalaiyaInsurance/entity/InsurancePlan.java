package com.project.BalaiyaInsurance.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsurancePlan {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    
    private String companyName="Aditya Health";

    private String coverageType;

    private Double premiumAmount;

    private Double coverageLimit;

    @Column(length = 1000)
    private List<String> inclusions;

    @Column(length = 1000)
    private List<String> exclusions;

    private Double deductible;

    private Double coPaymentPercentage;

    @Column(length = 1000)
    private List<String> networkHospitals;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public Double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Double getCoverageLimit() {
		return coverageLimit;
	}

	public void setCoverageLimit(Double coverageLimit) {
		this.coverageLimit = coverageLimit;
	}

	public List<String> getInclusions() {
		return inclusions;
	}

	public void setInclusions(List<String> inclusions) {
		this.inclusions = inclusions;
	}

	public List<String> getExclusions() {
		return exclusions;
	}

	public void setExclusions(List<String> exclusions) {
		this.exclusions = exclusions;
	}

	public Double getDeductible() {
		return deductible;
	}

	public void setDeductible(Double deductible) {
		this.deductible = deductible;
	}

	public Double getCoPaymentPercentage() {
		return coPaymentPercentage;
	}

	public void setCoPaymentPercentage(Double coPaymentPercentage) {
		this.coPaymentPercentage = coPaymentPercentage;
	}

	public List<String> getNetworkHospitals() {
		return networkHospitals;
	}

	public void setNetworkHospitals(List<String> networkHospitals) {
		this.networkHospitals = networkHospitals;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "InsurancePlan [id=" + id + ", planName=" + planName + ", companyName=" + companyName + ", coverageType="
				+ coverageType + ", premiumAmount=" + premiumAmount + ", coverageLimit=" + coverageLimit
				+ ", inclusions=" + inclusions + ", exclusions=" + exclusions + ", deductible=" + deductible
				+ ", coPaymentPercentage=" + coPaymentPercentage + ", networkHospitals=" + networkHospitals + "]";
	}
	
	
}
