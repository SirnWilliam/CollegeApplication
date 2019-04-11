package college.edu;

/**
 * The College Applicant class is a subclass of Person and represents a college applicant
 * @author Sirn William
 *
 */
public class CollegeApplicant extends Person implements StatusInterface {
	
	private double highSchoolGPA;
	private double highSchoolGPAScale;
	private int satScore;
	private int actScore;
	private String status;
	private String description;
	private int numFelonies; //felonies in past 5 years;
	

	/**
	 * Default constructor
	 */
	public CollegeApplicant() {
		super();
		highSchoolGPA = 0;
		highSchoolGPAScale = 0;
		satScore = 0;
		status = "";
		description = "";
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor and overloaded
	 * @param firstName first name of college applicant
	 * @param lastName last name of college applicant
	 * @param state state of college applicant
	 * @param numFelonies number of felonies of college applicant
	 * @param age age of college applicant
	 * @param highSchoolGPA high school GPA of college applicant
	 * @param highSchoolGPAScale high school GPA scale of college applicant
	 * @param satScore SAT score of college applicant
	 * @param actScore ACT score of college applicant
	 */
	public CollegeApplicant(String firstName, String lastName, String state, int numFelonies, int age, double highSchoolGPA, double highSchoolGPAScale, int satScore, int actScore) {
		this(firstName, lastName, state, numFelonies, age, highSchoolGPA, highSchoolGPAScale, satScore, actScore, "", "");//to call one constructor from another.
	}
	
	/**
	 * 
	 * @param status status of college applicant
	 * @param description  description for college applicant when the applicant is rejected
	 */
	public CollegeApplicant(String firstName, String lastName, String state, int numFelonies, int age, double highSchoolGPA, double highSchoolGPAScale, int satScore, int actScore, String status,
			String description) {
		super(firstName, lastName, state, age);// passing the parameters to the parent class(Person)
		this.highSchoolGPA = highSchoolGPA;
		this.highSchoolGPAScale = highSchoolGPAScale;
		this.satScore = satScore;
		this.actScore = actScore;
		this.numFelonies = numFelonies;
		this.status = status;
		this.description = description;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		
		if (description.endsWith("; ")) {
			return description.substring(0, description.length()-2);
		}
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the highSchoolGPAScale
	 */
	public double getHighSchoolGPAScale() {
		return highSchoolGPAScale;
	}

	/**
	 * @param highSchoolGPAScale the highSchoolGPAScale to set
	 */
	public void setHighSchoolGPAScale(double highSchoolGPAScale) {
		this.highSchoolGPAScale = highSchoolGPAScale;
	}

	/**
	 * @return the satScore
	 */
	public int getSatScore() {
		return satScore;
	}

	/**
	 * @param satScore the satScore to set
	 */
	public void setSatScore(int satScore) {
		this.satScore = satScore;
	}

	/**
	 * @return the actScore
	 */
	public int getActScore() {
		return actScore;
	}

	/**
	 * @param actScore the actScore to set
	 */
	public void setActScore(int actScore) {
		this.actScore = actScore;
	}

	/**
	 * @return the highSchoolGPA
	 */
	public double getHighSchoolGPA() {
		return highSchoolGPA;
	}

	/**
	 * @param highSchoolGPA the highSchoolGPA to set
	 */
	public void setHighSchoolGPA(double highSchoolGPA) {
		this.highSchoolGPA = highSchoolGPA;
	}

	/**
	 * @return the numFelonies
	 */
	public int getNumFelonies() {
		return numFelonies;
	}

	/**
	 * @param numFelonies the numFelonies to set
	 */
	public void setNumFelonies(int numFelonies) {
		this.numFelonies = numFelonies;
	}

	

	
}

