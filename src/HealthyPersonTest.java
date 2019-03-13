import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for HealthyPerson.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class HealthyPersonTest {
	
	/**
	 * Tests the Healthy Person constructor
	 */
	@Test
	public void HealthyPersonTest()
	{
		HealthyPerson per1 = new HealthyPerson("John", 20, "Daily Checkup");
		Assert.assertEquals("per1 name incorrect", "John", per1.getName());
		Assert.assertEquals("per1 age incorrect", 20, per1.getAge());
	}
	
	/**
	 * Tests the compareToImpl for HealthyPerson class
	 */
	@Test
	public void compareToImplTest()
	{
		SickPerson per1 = new SickPerson("John", 20, 5);
		HealthyPerson per2 = new HealthyPerson("Lyndee", 18, "Soccer physical");
		HealthyPerson per3 = new HealthyPerson("Matt", 22, "Daily checkup");
		
		Assert.assertEquals("per1 and per2 compareTo incorrect", 0, per2.compareTo(per1));
		Assert.assertEquals("per2 and per3 compareTo incorrect", -1, per2.compareTo(per3));
		Assert.assertEquals("per3 and per2 compareTo incorrect", 1, per3.compareTo(per2));
		Assert.assertEquals("per2 and per2 compareTo incorrect", 0, per1.compareTo(per1));
	}
	
	/**
	 * Tests the toString() of the HealthyPerson class
	 */
	@Test
	public void toStringTest()
	{
		HealthyPerson per1 = new HealthyPerson("Matt", 22, "Daily checkup");
		
		String expected = "Matt, a 22-year old. In for Daily checkup";
		String actual = per1.toString();
		
		Assert.assertEquals(expected, actual);

	}

}
