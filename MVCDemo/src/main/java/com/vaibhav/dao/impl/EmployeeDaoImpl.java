package com.vaibhav.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vaibhav.dao.IEmployeeDao;
import com.vaibhav.model.Employee;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private HibernateTemplate ht;
	public void empSave(Employee emp) {
		ht.save(emp);

	}

	public void empUpdate(Employee emp) {
	  
       ht.update(emp);
	}

	public void empDelete(int empId) {
		Employee emp=ht.get(Employee.class,empId);

	}

	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return ht.get(Employee.class,empId);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return ht.loadAll(Employee.class);
	}

}
