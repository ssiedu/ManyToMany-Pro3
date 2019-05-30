package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {

	public static void main(String[] args) {

		Project p1=new Project("p111","AcSw",5000000);
		Project p2=new Project("p112","ERP",6000000);
		Project p3=new Project("p113","BnkSw",9000000);
		Project p4=new Project("p114","SecApp",450000);
		Project p5=new Project("p115","ECommerce",345000);
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(p1); session.save(p2);
		session.save(p3); session.save(p4);
		session.save(p5); 
		tr.commit();
		session.close();
		System.out.println("PROJECT STORED");

	}

}
