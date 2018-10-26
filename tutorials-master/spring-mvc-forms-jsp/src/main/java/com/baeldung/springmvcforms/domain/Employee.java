package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

   // private long id;

    @NotNull
   // @Size(min = 5)
    private String name;

   // @NotNull
   // @Size(min = 7)
   // private String contactNumber;
    
    @NotNull
    private int salary;
    
    private double tax;

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

  /*  public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    } */

  /*  public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(final String contactNumber) {
        this.contactNumber = contactNumber;
    } */

}
