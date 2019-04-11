package college.edu;

/**
 * 
 * @author Sirn William
 *
 */

public class AdmissionStaff extends Person {
	
	/**
	 * Parameterized constructor and overloaded
	 * @param firstName first name of staff
	 * @param lastName last name of staff
	 * @param state state of staff
	 * @param age age of staff
	 */
	
	public AdmissionStaff(String firstName, String lastName, String state, int age) {
		super(firstName, lastName, state, age);
	}
	
	
	/**
	 * Reviews and accepts college applicants
	 * @param ca the college applicant
	 */
	public void reviewApplicant(CollegeApplicant ca) {
	
		if (Validator.isFelon(ca) || 
				!Validator.validateHighSchoolGPA(ca, 70) ||
				ca.getAge() < 0 ||
				!Validator.validateName(ca)) {
			ca.setStatus("instant reject");

		}
		else if (Validator.validateAge(ca) &&
				Validator.validateHighSchoolGPA(ca, 90) &&
				Validator.validateExamScores(ca))  {
			ca.setStatus("instant accept");
		} else {
			ca.setStatus("further review");
		}
		
	}
	
		
	
}
