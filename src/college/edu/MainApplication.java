package college.edu;

/**
 * 
 * @author Sirn William
 *
 */

public class MainApplication {

	/*
	 * creating CollegeApplicant object and passing arguments using Parameterized constructor
	 * creating AdmissionStaff object and passing arguments using Parameterized constructor
	 * using AdmissionStaff object to call reviewApplicant method and passing CollegeApplicant object to the method
	 * printing the status of the CollegeApplicant
	 * printing the description if the college applicant is rejected
	 */
	public static void main (String [] args) {	
		
		CollegeApplicant ca = new CollegeApplicant("John", "Doe", "AZ", 0, 81, 3.8, 4.0, 1980, 28);
		AdmissionStaff staff = new AdmissionStaff("Jane", "Doe", "CA", 34);
		staff.reviewApplicant(ca);
		System.out.println("Status: " + ca.getStatus());
		System.out.println("Description: " + ca.getDescription());
	}
}
