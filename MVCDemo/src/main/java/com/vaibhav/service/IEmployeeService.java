package com.vaibhav.service;

import java.util.List;

import com.vaibhav.model.Employee;

public interface IEmployeeService {
	public void empSave(Employee emp);
	public void empUpdate(Employee emp);
	public void empDelete(int empId);
	public Employee getEmpById(int empId);
	public List<Employee> getAllEmp();

}
