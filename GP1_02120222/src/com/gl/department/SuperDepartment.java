package com.gl.department;

public class SuperDepartment {
	String valDepartmentName;
	String valGetTodaysWork;
	String valGetWorkDeadline;
	String valIsTodayAHoliday;
	
	public String departmentName() {
		valDepartmentName="Super Department";
		return valDepartmentName;
	}
	public String getTodaysWork() {
		valGetTodaysWork = "No Work as of now";
		return valGetTodaysWork;
	}
	public String getWorkDeadline() {
		valGetWorkDeadline="Nil";
		return valGetWorkDeadline;
	}
	public String isTodayAHoliday() {
		valIsTodayAHoliday= "Today is not a holiday";
		return valIsTodayAHoliday;
	}

}
