package college.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainApplicationTest {

	/**
	 * creating CollegeApplicant object and passing arguments using Parameterized constructor
	 * creating AdmissionStaff object and passing arguments using Parameterized constructor
	 * using AdmissionStaff object to call reviewApplicant method and passing CollegeApplicant object to the method
	 * checking the status of the CollegeApplicant if it is instant accept or not
	 * 
	 */
	@Test
	public void testInstantAccept() {
		CollegeApplicant ca = new CollegeApplicant("Sirn", "William", "CA", 0, 18, 3.6, 4.0, 1930, 30);
		AdmissionStaff staff = new AdmissionStaff("Jane", "Doe", "CA", 34);
		staff.reviewApplicant(ca);
		assertEquals(ca.getStatus(), "instant accept");
	}
	
	@Test
	public void testInstantReject() {
		CollegeApplicant ca = new CollegeApplicant("Sirn", "William", "CA", 3, 18, 2.7, 4.0, 1930, 30);
		AdmissionStaff staff = new AdmissionStaff("Jane", "Doe", "CA", 34);
		staff.reviewApplicant(ca);
		assertEquals(ca.getStatus(), "instant reject");
	}
	
	@Test
	public void testFurtherReview() {
		CollegeApplicant ca = new CollegeApplicant("Sirn", "William", "CA", 0, 18, 2.9, 4.0, 1930, 30);
		AdmissionStaff staff = new AdmissionStaff("Jane", "Doe", "CA", 34);
		staff.reviewApplicant(ca);
		assertEquals(ca.getStatus(), "further review");
	}

}
