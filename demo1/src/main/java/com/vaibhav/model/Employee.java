package com.vaibhav.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newEmp")
public class Employee {
    @Id
	private int empId;
	private String empName;
	private double empSalry;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalry() {
		return empSalry;
	}
	public void setEmpSalry(double empSalry) {
		this.empSalry = empSalry;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalry=" + empSalry + "]";
	}
	

}
