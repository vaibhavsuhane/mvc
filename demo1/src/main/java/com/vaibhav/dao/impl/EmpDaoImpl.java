package com.vaibhav.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vaibhav.dao.IEmpDao;
import com.vaibhav.model.Employee;
@Repository
public class EmpDaoImpl implements IEmpDao {
   
	@Autowired
	private HibernateTemplate ht;
	
	public void empSave(Employee emp) {
		// TODO Auto-generated method stub
		   ht.save(emp);
	}

	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return ht.get(Employee.class,empId);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return ht.loadAll(Employee.class);
	}

	public void updateEmp(Employee emp) {
		ht.update(emp);

	}

	public void deleteEmp(int empId) {
		Employee emp=ht.get(Employee.class,empId);
		ht.delete(emp);

	}

}
