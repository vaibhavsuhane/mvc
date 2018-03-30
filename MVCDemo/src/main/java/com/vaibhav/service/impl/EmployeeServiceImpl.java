package com.vaibhav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaibhav.dao.IEmployeeDao;
import com.vaibhav.model.Employee;
import com.vaibhav.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    
	@Autowired
	private IEmployeeDao dao;
	@Transactional
	public void empSave(Employee emp) {
		dao.empSave(emp);

	}
    @Transactional
	public void empUpdate(Employee emp) {
		dao.empUpdate(emp);

	}
    @Transactional
	public void empDelete(int empId) {
		dao.empDelete(empId);

	}

	public Employee getEmpById(int empId) {
		return dao.getEmpById(empId);
		
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
	}

}
