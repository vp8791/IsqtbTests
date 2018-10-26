package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Insurance {
	
	public boolean isInsureperson() {
		return insureperson;
	}

	public void setInsureperson(boolean insureperson) {
		this.insureperson = insureperson;
	}

	@NotNull
	private String name;
	
	@NotNull
    private boolean existingMedicalCondition;
    
	@NotNull
    private boolean smoker;
	
	@NotNull
    private boolean skiing;
    
    
    private boolean insureperson;
    
    private String offerDiscount;
    
    public Insurance() {
        super();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExistingMedicalCondition() {
		return existingMedicalCondition;
	}

	public void setExistingMedicalCondition(boolean existingMedicalCondition) {
		this.existingMedicalCondition = existingMedicalCondition;
	}

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	public boolean isSkiing() {
		return skiing;
	}

	public void setSkiing(boolean skiing) {
		this.skiing = skiing;
	}


	public String getOfferDiscount() {
		return offerDiscount;
	}

	public void setOfferDiscount(String offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

    
}
