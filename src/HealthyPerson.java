/**
 * Class representing a HealthyPerson who will be admitted to a Hospital.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class HealthyPerson extends Person {
	
	//Tracks the reason for the HealthyPerson's admittance to the hospital
	private String reason;
	
	/**
	 * Stores information about the HealthyPerson.
	 * 
	 * @param name - The HealthyPerson's name.
	 * @param age - The HealthyPerson's age, in years.
	 * @param reason - The HealthyPerson's reason for visiting the Hospital (e.g. a yearly checkup).
	 */
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	/**
	 * Gets the reason for the HealthyPerson's hospital visit
	 * 
	 * @return reason
	 */
	private String getReason()
	{
		return reason;
	}
	
	/**
	 * Implementation method for Person's compareTo method(). Does the actual legwork of 
	 * comparison to compare a HealthyPerson (self) vs. another Person (o).
	 * 
	 * @param o - The other Person to compare self to.
	 * 
	 * @return If o is not of type HealthyPerson, return 0. 
	 * Else, return (ignoring case): (1) self's name comes "before" o's name: negative number 
	 * (2) self's name comes "after" p's name: positive number 
	 * (3) names are equivalent: 0 i.e. the natural ordering of the name strings, ignoring case
	 * Orders alphabetically.
	 */
	protected int compareToImpl(Person o)
	{
		if (!(o instanceof HealthyPerson))
		{
			return 0;
		}
		else
		{	
			return this.compareTo(o);
		}
	}
	
	/**
	 * Gives some information about the HealthyPerson.
	 * 
	 * @return The String "%s In for %s" with replacements of the super's toString and 
	 * the HealthyPerson's reason.
	 */
	@Override
	public String toString()
	{
		String output = String.format("%s In for %s", super.toString(), getReason());
		return output;
	}

}