package com.cg.ems.ui;

import java.util.ArrayList;

import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

import co.cg.ems.dto.Employee;

public class TestEMpJpaDemo {

	public static void main(String[] args) 
	{
		EmployeeService empSer=new EmployeeServiceImpl();
//		Employee e1= new Employee();
//		e1.setEmpname("gajendra");
//		e1.setEmpSal(12000);
//		//Employee ee1=empSer.addEmp(e1);
		Employee ee=empSer.getEmpById(555);
//		ArrayList<Employee> list=empSer.fetchAllEmp();
//		for(Employee tempE:list)
//		{
//			System.out.println(tempE.getEmpId()+"\t" + tempE.getEmpname()+"\t"+tempE.getEmpSal());
//		}
		Employee delete=empSer.deleteEmp(555);
		System.out.println(ee+"deleted");
		
		
		//System.out.println(ee);
	}

}
