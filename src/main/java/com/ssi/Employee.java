package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int ecode;
	private String ename;
	private int sal;
	
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();
	
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Employee(int ecode, String ename, int sal) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	

	
	
}
