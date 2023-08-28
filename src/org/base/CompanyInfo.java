package org.base;

public class CompanyInfo {
	
	public static void main(String[] args) {
		
		EmployeeInfo e = new EmployeeInfo();
		e.setEmpId(8765476);
		int empId = e.getEmpId();
		System.out.println(empId);
		
		e.setUsername("Jack67");
		String username = e.getUsername();
		System.out.println(username);
	}
}