package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//UKTB CFTL Practice Examination Version 1.2 December 2015 from Udemy
public class WhiteBox {

    @NotNull
    private int x;
    
    @NotNull
    private int y;
    
    @NotNull
    private int z;
    
    private String output;

    public WhiteBox() {
        super();
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
       

}
