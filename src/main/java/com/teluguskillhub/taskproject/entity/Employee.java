package com.teluguskillhub.taskproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter 
@NoArgsConstructor
public class Employee {
	public int getSequencNumber() {
		return sequencNumber;
	}

	public void setSequencNumber(int sequencNumber) {
		this.sequencNumber = sequencNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sequencNumber;
	
	private String employeeName;
	//hello
	//hi
        //I am fine
}
