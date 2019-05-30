package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmployee {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Employee emp=session.get(Employee.class, 112);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		List<Project> projects=emp.getProjects();
		
		for(Project project:projects){
			System.out.println(project.getPcode()+","+project.getPtitle());
		}
		session.close();

	}

}
