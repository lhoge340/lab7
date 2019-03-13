import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for SickPerson.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class SickPersonTest {
	
	/**
	 * Tests the constructor
	 */
	@Test
	public void SickPersonTest()
	{
		SickPerson per1 = new SickPerson("John", 20, 5);
		Assert.assertEquals("per1 name incorrect", "John", per1.getName());
		Assert.assertEquals("per1 age incorrect", 20, per1.getAge());
	}
	
	/**
	 * Tests the compareToImpl of SickPerson class
	 */
	@Test
	public void compareToImplTest()
	{
		SickPerson per1 = new SickPerson("John", 20, 5);
		HealthyPerson per2 = new HealthyPerson("Lyndee", 20, "Daily Checkup");
		SickPerson per3 = new SickPerson("Nick", 21, 7);
		
		Assert.assertEquals("per1 and per2 compareTo incorrect", 0, per1.compareTo(per2));
		Assert.assertEquals("per1 and per3 compareTo incorrect", -1, per3.compareTo(per1));
		Assert.assertEquals("per2 and per1 compareTo incorrect", 1, per1.compareTo(per3));
		Assert.assertEquals("per1 and per1 compareTo incorrect", 0, per1.compareTo(per1));
	}
	
	/**
	 * Tests the toString() of SickPerson class
	 */
	@Test
	public void toStringTest()
	{
		SickPerson per1 = new SickPerson("John", 20, 5);
		String expected = "John, a 20-year old. Severity level 5";
		String actual = per1.toString();

		Assert.assertEquals(expected, actual);
		
	}

}
