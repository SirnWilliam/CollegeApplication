package college.edu;

/**
 * 
 * @author Sirn William
 *
 */

public class Validator {

	/**
	 * validate a college applicant felone
	 * @param ca the college applicant
	 * @return true if the person has 1 or more felonies in the past 5 years
	 */
	public static boolean isFelon(CollegeApplicant ca) {
		
		if (ca.getNumFelonies() > 0 ) {
			String description = ca.getDescription() + "felon; ";
			ca.setDescription(description);
			return true;
		}
		return false;
	}
	
	/**
	 * validate the format of a person's name by ensuring that the name start with an upper case letter, and the
	 * remaining letters are lower case
	 * @param name person's name (first or last)
	 * @return true if name is in correct format or false otherwise. Example: Sirn is correct format, while sirn is not
	 */
	public static boolean validateName(String name) {
		
		if (Character.isLowerCase(name.charAt(0))) {
			return false;
		}
		
		for (int i=1; i<name.length(); i++) {
			if (Character.isUpperCase(name.charAt(i))) {
			}
		}
		return true;
	}
	
	/**
	 * validate the format of a College applicant's first and last name
	 * @param ca the college applicant
	 * @return true if both first name and last name are valid formats. Example: Sirn Hirmeza is correct format
	 */
	public static boolean validateName(CollegeApplicant ca) {
		
		if (validateName(ca.getFirstName()) && validateName(ca.getLastName()))	{
			return true;
		} 
		else {
			String description = ca.getDescription() + "name not in the required format; ";
			ca.setDescription(description);
			return false;
		}
	}
	
	/**
	 * validate a College applicant candidate's age
	 * @param ca the college applicant
	 * @return true if the age is valid and false otherwise 
	 */
	public static boolean validateAge(CollegeApplicant ca) {
		
		if (ca.getAge() > 80 || (ca.getState().equalsIgnoreCase("CA") && ca.getAge() >= 17
				&& ca.getAge() < 26) ) {
			return true;
		}
		String description = ca.getDescription() + "age does not meet requirements; ";
		ca.setDescription(description);
		return false;
	}
	/**
	 * getting a College applicant candidate's GPA percent
	 * @param ca the college applicant
	 * @return the GPA percent 
	 */
	public static double getGPAPercent(CollegeApplicant ca) {
		return ca.getHighSchoolGPA()/ca.getHighSchoolGPAScale() * 100;
	}
	
	/**
	 * validate a College applicant candidate's high school GPA
	 * @param ca the college applicant 
	 * @param threshold is the percent set by the staff(70 or 90)
	 * @return true if the high school GPA is valid or false otherwise
	 */
	public static boolean validateHighSchoolGPA(CollegeApplicant ca, int threshold) {
		
		if (getGPAPercent(ca) >= threshold) {
			return true;
		}
		String description = ca.getDescription() + "does not meet high school GPA requirements; ";
		ca.setDescription(description);
		return false;
	}
	/**
	 * validate a College applicant candidate's SAT score
	 * @param ca the college applicant
	 * @return true if SAT score is valid or false otherwise
	 */
	public static boolean validateSATScore(CollegeApplicant ca) {
		if (ca.getSatScore() > 1920) {
			return true;
		}
		return false;
	}
	
	/**
	 * validate a College applicant candidate's ACT score
	 * @param ca the college applicant
	 * @return true if the ACT score is valid or false otherwise
	 */
	public static boolean validateACTScore(CollegeApplicant ca) {
		if (ca.getActScore() > 27) {
			return true;
		}
		return false;
	}
	
	/**
	 * checking SAT and ACT, and adding description when the result is false.
	 * @param ca the college applicant
	 * @return true if SAT or ACT is valid or false by adding the description
	 */
	public static boolean validateExamScores(CollegeApplicant ca) {
		String description = "";
		boolean passed = false;
		
		if (validateSATScore(ca)) {
			passed = true;
		} else {
			description += "failed SAT; ";
		}
		
		
		if (validateACTScore(ca)) {
			passed = true;
		} else {
			description += "failed ACT; ";
		}
		
		
		if (passed) {
			return true;
		} 
		else {
			
			description = ca.getDescription() + description;
			ca.setDescription(description);
			return false;
		}
	}
	
}

