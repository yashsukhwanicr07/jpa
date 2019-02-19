package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.util.JpaUtil;

import co.cg.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	EntityManager em=null;
	EntityTransaction entitytran=null;
	public EmployeeDaoImpl()
	{
		em=JpaUtil.getEntityManager();
		entitytran=em.getTransaction();
	}

	@Override
	public Employee addEmp(Employee emp) 
	{
		entitytran.begin();
		em.persist(emp);
		entitytran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() 
	{
		String setAllQry=" SELECT emps from Employee emps";
		TypedQuery<Employee> tq=em.createQuery(setAllQry,Employee.class);
		ArrayList<Employee> empList=(ArrayList) tq.getResultList();
		return empList;
	}

	@Override
	public Employee deleteEmp(int empId) 
	{
		Employee e1=em.find(Employee.class,empId);
		em.remove(e1);
		return e1;
	}

	@Override
	public Employee getEmpById(int empId) 
	{
		Employee ee=em.find(Employee.class, empId);
		return ee;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return null;
	}

}
