package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeEntry {

	public static void main(String[] args) {

		Employee e1=new Employee(111,"AAA",100000);
		e1.getProjects().add(new Project("p111"));
		e1.getProjects().add(new Project("p112"));
		e1.getProjects().add(new Project("p113"));
		
		Employee e2=new Employee(112,"BBB",150000);
		e2.getProjects().add(new Project("p113"));
		e2.getProjects().add(new Project("p114"));
		e2.getProjects().add(new Project("p115"));
		
		
		Employee e3=new Employee(113,"CCC",200000);
		e3.getProjects().add(new Project("p111"));
		e3.getProjects().add(new Project("p114"));
		e3.getProjects().add(new Project("p115"));
		
		Employee e4=new Employee(114,"DDD",250000);
		e4.getProjects().add(new Project("p114"));
		e4.getProjects().add(new Project("p115"));
		
		
		Employee e5=new Employee(115,"EEE",300000);
		e5.getProjects().add(new Project("p111"));
		e5.getProjects().add(new Project("p112"));
		e5.getProjects().add(new Project("p113"));
		e5.getProjects().add(new Project("p114"));
		
		Employee e6=new Employee(116,"FFF",350000);
		e6.getProjects().add(new Project("p115"));
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		session.save(e5); session.save(e6);
		tr.commit();
		session.close();
		
		System.out.println("EMPLOYEES DATA STORED");
	}

}
