package org.richard.java.model;

public class Departments {
	String dept_no;
	String dept_name;
	
	Departments(){};
	
	Departments(String dept_no, String dept_name){
		this.dept_no = dept_no;
		this.dept_name = dept_no;
	}

	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
}
