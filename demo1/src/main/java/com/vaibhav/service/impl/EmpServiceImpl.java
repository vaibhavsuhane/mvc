package com.vaibhav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaibhav.dao.IEmpDao;
import com.vaibhav.model.Employee;
import com.vaibhav.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService {
    
	@Autowired
	private IEmpDao dao;
	@Transactional
	public void empSave(Employee emp) {
		// TODO Auto-generated method stub
		dao.empSave(emp);
	}

	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmpById(empId);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
	}
    @Transactional
	public void updateEmp(Employee emp) {
		dao.updateEmp(emp);

	}
    @Transactional
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);

	}

}
