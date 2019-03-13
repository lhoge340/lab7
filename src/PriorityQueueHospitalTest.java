import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for PriorityQueueHospital.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class PriorityQueueHospitalTest {
	
	/**
	 * Test for PriorityQueueHospital
	 */
	@Test
	public void PriorityQueueHospitalTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		
		Assert.assertEquals("PriorityQueueHospital constructor incorrect", 0, p.numPatients());
	}
	
	/**
	 * Test for addPatient
	 */
	@Test
	public void addPatientTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Animal dog = new Animal("collie", 5);
		
		p.addPatient(dog);
		
		Assert.assertEquals("PriorityQueueHospital addPatient incorrect", 1, p.numPatients());
	}
	
	/**
	 * Test for nextPatient
	 */
	@Test
	public void nextPatientTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Animal dog = new Animal("collie", 6);
		Animal cat = new Animal("cat", 5);
		
		p.addPatient(dog);
		p.addPatient(cat);
		
		Assert.assertEquals("nextPatient incorrect", dog, p.nextPatient());
		
	}
	
	/**
	 * Test for treatNextPatient()
	 */
	@Test
	public void treatNextPatientTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Animal dog = new Animal("collie", 6);
		Animal cat = new Animal("cat", 5);
		Animal bird = new Animal("bird", 8);
		
		p.addPatient(dog);
		p.addPatient(cat);
		p.addPatient(bird);
		
		Assert.assertEquals("treatNextPatient incorrect", bird, p.treatNextPatient());
	}
	
	/**
	 * Test for hospitalType
	 */
	@Test
	public void hospitalTypeTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Assert.assertEquals("PriorityQueueHospital", p.hospitalType());
	}
	
	/**
	 * Test for allPatientInformation
	 */
	@Test
	public void allPatientInformationTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Animal dog = new Animal("collie", 6);
		Animal cat = new Animal("cat", 5);
		
		p.addPatient(dog);
		p.addPatient(cat);
		
		String expected = "A 6-year old collie.A 5-year old cat.";
		String actual = p.allPatientInfo();
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test for toString()
	 */
	@Test
	public void toStringTest()
	{
		PriorityQueueHospital<Animal> p = new PriorityQueueHospital<Animal>();
		Animal dog = new Animal("collie", 6);
		Animal cat = new Animal("cat", 5);
		
		p.addPatient(dog);
		p.addPatient(cat);
		
		String expected = "A PriorityQueueHospital-type hospital with 2 patients";
		String actual = p.toString();
	}

}
