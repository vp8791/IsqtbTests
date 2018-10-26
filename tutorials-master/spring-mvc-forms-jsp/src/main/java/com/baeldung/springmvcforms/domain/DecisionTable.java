package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//QandA3 : QQuestion 10
public class DecisionTable {
	
	private String name;

   // private long id;

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@NotNull
   // @Size(min = 5)
    private boolean indianResident;
    
    private boolean married;
    
    @NotNull
    private int age;
    
    private String issueMemberShip;
    
    private String offer10PercentDiscount;
    
    public DecisionTable() {
        super();
    }

	

	public boolean isIndianResident() {
		return indianResident;
	}



	public void setIndianResident(boolean indianResident) {
		this.indianResident = indianResident;
	}



	public boolean isMarried() {
		return married;
	}



	public void setMarried(boolean married) {
		this.married = married;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIssueMemberShip() {
		return issueMemberShip;
	}

	public void setIssueMemberShip(String issueMemberShip) {
		this.issueMemberShip = issueMemberShip;
	}

	public String getOffer10PercentDiscount() {
		return offer10PercentDiscount;
	}

	public void setOffer10PercentDiscount(String offer10PercentDiscount) {
		this.offer10PercentDiscount = offer10PercentDiscount;
	}

	
   
}
