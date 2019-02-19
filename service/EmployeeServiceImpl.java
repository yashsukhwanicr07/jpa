package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoImpl;

import co.cg.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{
	EmployeeDao empDao=null;
	public EmployeeServiceImpl()
	{
		empDao=new EmployeeDaoImpl();
	}

	@Override
	public Employee addEmp(Employee emp) 
	{
		// TODO Auto-generated method stub
		return empDao.addEmp(emp);
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return empDao.fetchAllEmp();
	}

	@Override
	public Employee deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return empDao.deleteEmp(empId);
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(empId);
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(empId, newName, newSal);
	}

}
