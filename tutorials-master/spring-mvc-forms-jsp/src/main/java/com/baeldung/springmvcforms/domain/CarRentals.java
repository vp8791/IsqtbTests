package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CarRentals {
	
	@NotNull
	private String name;
	
	@NotNull
    private boolean cleandrivingrecord;
    
	@NotNull
    private boolean onbusiness;
    
    @NotNull
    private int age;
    
    private boolean supplyrentalcar;
    
    private boolean premiumcharge;
    
    public CarRentals() {
        super();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCleandrivingrecord() {
		return cleandrivingrecord;
	}

	public void setCleandrivingrecord(boolean cleandrivingrecord) {
		this.cleandrivingrecord = cleandrivingrecord;
	}

	public boolean isOnbusiness() {
		return onbusiness;
	}

	public void setOnbusiness(boolean onbusiness) {
		this.onbusiness = onbusiness;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSupplyrentalcar() {
		return supplyrentalcar;
	}

	public void setSupplyrentalcar(boolean supplyrentalcar) {
		this.supplyrentalcar = supplyrentalcar;
	}

	public boolean isPremiumcharge() {
		return premiumcharge;
	}

	public void setPremiumcharge(boolean premiumcharge) {
		this.premiumcharge = premiumcharge;
	}

	

	
   
}
