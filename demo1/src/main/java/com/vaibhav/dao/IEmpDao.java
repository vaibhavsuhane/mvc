package com.vaibhav.dao;

import java.util.List;

import com.vaibhav.model.Employee;

public interface IEmpDao {
	public void empSave(Employee emp);
	public Employee getEmpById(int empId);
	public List<Employee> getAllEmp();
	public void updateEmp(Employee emp);
	public void deleteEmp(int empId);

}
