package com.gl.department;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment(){
		System.out.println("Welcome to Admin Department");
	}

	public String departmentName() {
		valDepartmentName="Admin Department";
		return valDepartmentName;
	}
	public String getTodaysWork() {
		valGetTodaysWork = "Complete your documents Submission";
		return valGetTodaysWork;
	}
	public String getWorkDeadline() {
		valGetWorkDeadline="Complete by EOD";
		return valGetWorkDeadline;
	}
}
