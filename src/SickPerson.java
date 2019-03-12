/**
 * Class representing a SickPerson who will be admitted to a Hospital.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class SickPerson extends Person {
	
	//Tracks the severity of a SickPerson's illness
	private int severity;

	/**
	 * Stores information about the SickPerson.
	 *
	 * @param name - The SickPerson's name.
	 * @param age - The SickPerson's age, in years
	 * @param severity - The severity of the illness in the SickPerson. The higher the value, the 
	 * more severe the illness.
	 */
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * Get the severity of the SickPerson's illness
	 * 
	 * @return severity
	 */
	private int getSeverity()
	{
		return severity;
	}
	
	/**
	 * Implementation method for Person's compareTo method(). Does the actual legwork of 
	 * comparison to compare a SickPerson (self) vs. another Person (o).
	 * 
	 * @param o - The other Person to compare self to.
	 * 
	 * @return If o is not of type SickPerson, return 0. 
	 * Else, return (ignoring case): 
	 * (1) self's severity is greater than o's severity: negative number 
	 * (2) self's severity is less than o's severity: positive number 
	 * (3) severity are equivalent: 0 
	 * Orders by decreasing severity.
	 */
	protected int compareToImpl(Person o)
	{
		if (o instanceof SickPerson)
		{
			return 0;
		}
		else
		{			
			if (this.getSeverity() > ((SickPerson) o).getSeverity())
			{
				return -1;
			}
			else if (this.getSeverity() < ((SickPerson) o).getSeverity())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	
	/**
	 * Gives some information about the SickPerson.
	 * 
	 * @return The String "%s Severity level %d" with replacements of the super's toString 
	 * and the SickPerson severity.
	 */
	@Override
	public String toString()
	{
		String output = String.format("%s Severity level %d", super.toString(), severity);
		return output;
	}
}