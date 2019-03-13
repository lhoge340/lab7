import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class representing a Hospital that orders its patients in the following way: Patients are 
 * ordered via a PriorityQueue. That is, the first patient admitted is the first to be treated. 
 * However, if patients have some natural ordering, then this is used to give a priority to 
 * patients. For example, the SickPerson has a severity level and implements the comparable 
 * interface to allow SickPersons to naturally order themselves. In a sorted list, the Person 
 * with the highest severity level would be the first element. Similarly, the Person with the
 * highest severity level would be the first one treated at the Hospital. Patients are treated 
 * in sorted order by their natural ordering. If a natural ordering is not defined, patients are 
 * treated in FIFO order.

 * @author Lyndee
 * @version 2019-3-12
 * @param <PatientType>
 */
public class PriorityQueueHospital<PatientType> extends Hospital<PatientType> {

	private Queue<PatientType> priorityHospital;
	
	private int numPatients;
	
	/**
	 * Initializes the Patient PriorityQueue.
	 */
	public PriorityQueueHospital()
	{
		numPatients = 0;
		priorityHospital = new PriorityQueue<PatientType>(200);
	}
	
	/**
	 * Add a patient to the Hospital.
	 * 
	 * @param patient - The patient to be added.
	 */
	public void addPatient(PatientType patient)
	{
		priorityHospital.add(patient);
		numPatients = numPatients + 1;
		
	}
	
	/**
	 * Find and return the patient who will next be treated. Does not treat the patient (i.e. it 
	 * is not removed from the collection of patients that the hospital still must treat).
	 * 
	 * @return The patient who would be next treated.
	 */
	public PatientType nextPatient()
	{
		return priorityHospital.peek();
	}
	
	/**
	 * Treats the next patient and removes them from the Hospital. Once someone is healed 
	 * they no longer need to stay in the Hospital.
	 * 
	 * @return The patient receiving treatment.
	 */
	public PatientType treatNextPatient()
	{
		numPatients = numPatients - 1;
		return priorityHospital.poll();
	}
	
	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 * 
	 * @return The number of patients in the Hospital.
	 */
	public int numPatients()
	{
		return numPatients;
	}
	
	/**
	 * Gives a String for the hospital type.
	 * 
	 * @return A string exactly matching the class name.
	 */
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	/**
	 * Prints all patient information.
	 * 
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	public String allPatientInfo()
	{
		Queue<PatientType> priorityHospitalPrint = new PriorityQueue<PatientType>(200);
		priorityHospitalPrint = priorityHospital;
		
		String output = "";
		
		while (!(priorityHospitalPrint.isEmpty()))
		{
			output = output + priorityHospitalPrint.poll().toString();
		}
		
		return output;
	}
	
}