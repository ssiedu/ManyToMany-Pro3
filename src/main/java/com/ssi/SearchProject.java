package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchProject {

	public static void main(String[] args) {

			Session session=DataUtility.getSF().openSession();
			Project project=session.get(Project.class, "p115");
			System.out.println(project.getPcode());
			System.out.println(project.getPtitle());
			System.out.println(project.getCost());
			
			List<Employee> employees=project.getEmployees();
			for(Employee emp:employees){
				System.out.println(emp.getEcode()+","+emp.getEname());
			}
			
			
			session.close();
	}

}
