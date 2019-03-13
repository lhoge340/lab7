import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for QueueHospital.
 *
 * @author Lynden
 * @version 2019-03-12
 */
public class QueueHospitalTest {
	
	/**
	 * Test for QueueHospital constructor
	 */
	@Test
	public void QueueHospitalTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		
		Assert.assertEquals("QueueHospital constructor incorrect", 0, q.numPatients());
		
	}
	
	/**
	 * Test for addPatient()
	 */
	@Test
	public void addPatientTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		HealthyPerson per1 = new HealthyPerson("Anna", 18, "Daily checkup");
		
		q.addPatient(per1);
		
		Assert.assertEquals("addPatient incorrect", 1, q.numPatients());
	}
	
	/**
	 * Test for nextPatient()
	 */
	@Test
	public void nextPatientTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		HealthyPerson per1 = new HealthyPerson("Anna", 18, "Daily checkup");
		
		q.addPatient(per1);
		
		Assert.assertEquals("nextPatient incorrect", per1, q.nextPatient());
	}
	
	/**
	 * Test for treatNextPatient()
	 */
	@Test
	public void treatNextPatientTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		HealthyPerson per1 = new HealthyPerson("Anna", 18, "Daily checkup");
		HealthyPerson per2 = new HealthyPerson("Dezi", 20, "Volleyball phsyical");
		
		q.addPatient(per1);
		q.addPatient(per2);
		
		Assert.assertEquals("treatNextPatientTest", per1, q.treatNextPatient());
	}
	
	/**
	 * Test for hospitalType
	 */
	@Test
	public void hospitalTypeTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		Assert.assertEquals("QueueHospital", q.hospitalType());
	}
	
	/**
	 * Test for allPatientInfo()
	 */
	@Test
	public void allPatientInfoTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		HealthyPerson per1 = new HealthyPerson("Anna", 18, "Daily checkup");
		HealthyPerson per2 = new HealthyPerson("Dezi", 20, "Volleyball physical");
		
		q.addPatient(per1);
		q.addPatient(per2);
		
		String expected = "Anna, a 18-year old. In for Daily checkupDezi, a 20-year old."
				+ " In for Volleyball physical";
		String actual = q.allPatientInfo();
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test for toString()
	 */
	@Test
	public void toStringTest()
	{
		QueueHospital<HealthyPerson> q = new QueueHospital<HealthyPerson>();
		HealthyPerson per1 = new HealthyPerson("Anna", 18, "Daily checkup");
		HealthyPerson per2 = new HealthyPerson("Dezi", 20, "Volleyball physical");
		
		q.addPatient(per1);
		q.addPatient(per2);
		
		String expected = "A QueueHospital-type hospital with 2 patients";
		String actual = q.toString();

	}

}
