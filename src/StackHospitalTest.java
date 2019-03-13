import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for StackHospital.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class StackHospitalTest {
	
	/**
	 * Tests the StackHospital constructor
	 */
	@Test
	public void StackHospitalTest()
	{
		StackHospital s = new StackHospital<SickPerson>();
		
		Assert.assertEquals("StackHospital constructor incorrect", 0, s.numPatients());
	}
	
	/**
	 * Tests addPatient()
	 */
	@Test
	public void addPatientTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		SickPerson per1 = new SickPerson("John", 20, 7);
		
		s.addPatient(per1);
		
		Assert.assertEquals("addPatient incorrect", 1, s.numPatients());
		
	}
	
	/**
	 * Tests nextPatient()
	 */
	@Test
	public void nextPatientTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		SickPerson per1 = new SickPerson("John", 20, 7);
		
		s.addPatient(per1);
		
		Assert.assertEquals("nextPatient incorrect", per1, s.nextPatient());
	}
	
	/**
	 * Tests treatNextPatient
	 */
	@Test
	public void treatNextPatientTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		SickPerson per1 = new SickPerson("John", 20, 7);
		SickPerson per2 = new SickPerson("Nick", 21, 8);
		
		s.addPatient(per1);
		s.addPatient(per2);
				
		Assert.assertEquals("treatNextPatient numPatients incorrect", 2, s.numPatients());
		Assert.assertEquals("treatNextPatient incorrect", per2, s.treatNextPatient());
	}
	
	/**
	 * Tests hospitalType
	 */
	@Test
	public void hospitalTypeTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		String expected = "StackHospital";
		String actual = s.hospitalType();
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests allPatientInfoTest()
	 */
	@Test
	public void allPatientInfoTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		SickPerson per1 = new SickPerson("John", 20, 7);
		SickPerson per2 = new SickPerson("Nick", 21, 8);
		
		s.addPatient(per1);
		s.addPatient(per2);
		
		String expected = "Nick, a 21-year old. Severity level 8John, a 20-year old. Severity "
				+ "level 7";
		String actual = s.allPatientInfo();
		
		Assert.assertEquals("StackHospital allPatientInfo incorrect", expected, actual);

	}
	
	/**
	 * Tests the toString()
	 */
	@Test
	public void toStringTest()
	{
		StackHospital<SickPerson> s = new StackHospital<SickPerson>();
		SickPerson per1 = new SickPerson("John", 20, 7);
		SickPerson per2 = new SickPerson("Nick", 21, 8);
		
		s.addPatient(per1);
		s.addPatient(per2);
		
		String expected = "A StackHospital-type hospital with 2 patients";
		String actual = s.toString();
	}

}
