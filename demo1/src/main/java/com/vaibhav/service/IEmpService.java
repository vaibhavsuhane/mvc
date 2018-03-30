package com.vaibhav.service;

import java.util.List;

import com.vaibhav.model.Employee;

public interface IEmpService {
	public void empSave(Employee emp);
	public Employee getEmpById(int empId);
	public List<Employee> getAllEmp();
	public void updateEmp(Employee emp);
	public void deleteEmp(int empId);
}
