package com.baeldung.springmvcforms.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//QandA3 : QQuestion 26
public class Exam {

   // private long id;

    @NotNull
   // @Size(min = 5)
    private String name;

   // @NotNull
   // @Size(min = 7)
   // private String contactNumber;
    
    @NotNull
    private int examMarks;
    
    private String result;

    public Exam() {
        super();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExamMarks() {
		return examMarks;
	}

	public void setExamMarks(int examMarks) {
		this.examMarks = examMarks;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

   
}
