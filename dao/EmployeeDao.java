package com.cg.ems.dao;

import java.util.ArrayList;

import co.cg.ems.dto.Employee;

public interface EmployeeDao 
{
	public Employee addEmp(Employee emp);
	public ArrayList<Employee> fetchAllEmp();
	public Employee deleteEmp(int empId);
	public Employee getEmpById(int empId);
	public Employee updateEmp(int empId, String newName,float newSal);

}
