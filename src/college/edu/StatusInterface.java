package college.edu;

/**
 * The StatusInteface provides general functionality for classes that can have a status applied to it. 
 * A status message and a description of the status are required by this interface
 * @author Sirn William
 *
 */
public interface StatusInterface {

	/**
	 * get status
	 * @return the status
	 */
	public String getStatus();
	
	/**
	 * set the status
	 * @param status the status
	 */
	public void setStatus(String status);
	
	/**
	 * get description of the status
	 * @return the description of the status
	 */
	public String getDescription();
	
	/**
	 * set the description
	 * @param description the description of the status
	 */
	public void setDescription(String description);
		
}
