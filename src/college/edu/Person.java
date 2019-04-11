package college.edu;

/**
 * 
 * @author Sirn William
 *
 */

public class Person {

	private String firstName;
	private String lastName;
	private String state;
	private int age;
	//private String address; //TODO: implement later, as needed
	
	/**
	 * Default constructor
	 * Initialize firstName, lastName, state, and age
	 */
	public Person() {
		this ("", "", "", 0);//Use of "this("", "", "", 0)" to call one constructor from another.
		
	}
	
	
	/**
	 * 
	 * Parameterized constructor 
	 * @param firstName first name of person
	 * @param lastName last name of person
	 * @param state state of person
	 * @param age age of person
	 */
	public Person(String firstName, String lastName, String state, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
		this.age = age;
	}




	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
