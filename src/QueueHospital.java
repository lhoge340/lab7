import java.util.Queue;
import java.util.LinkedList;

/**
 * Class representing a Hospital that orders its patients in the following way: Patients are 
 * ordered via a Queue. That is, the first patient admitted is the first to be treated. 
 * If more patients are added before the first patient is treated, they must wait for their 
 * turn. This is known as FIFO, or first-in-first-out ordering and is the standard model for 
 * lines at businesses (or any organized line of people).
 * 
 * @author Lyndee
 * @version 2019-3-12
 * @param <PatientType>
 */
public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	private int numPatients;
	
	private Queue<PatientType> queueHospital;
	
	/**
	 * Initializes the Patient Queue
	 */
	public QueueHospital()
	{
		numPatients = 0;
		queueHospital = new LinkedList<PatientType>();
	}
	
	/**
	 * Add a patient to the Hospital.
	 * 
	 * @param patient - The patient to be added.
	 */
	public void addPatient(PatientType patient)
	{
		queueHospital.add(patient);
		numPatients = numPatients + 1;
	}
	
	/**
	 * Find and return the patient who will next be treated. Does not treat the patient 
	 * (i.e. it is not removed from the collection of patients that the hospital still must treat).
	 * 
	 * @return The patient who would be next treated.
	 */
	public PatientType nextPatient()
	{
		return queueHospital.peek();
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
		return queueHospital.remove();
	}
	
	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 * 
	 * @return numPatients - The number of patients in the Hospital.
	 */
	public int numPatients()
	{
		return numPatients;
	}
	
	/**
	 * Gives a String for the hospital type.
	 * 
	 * @return type - A string exactly matching the class name.
	 */
	public String hospitalType()
	{
		String type = String.format("%s", queueHospital.getClass());
		return type;
	}
	
	/**
	 * Prints all patient information.
	 * 
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	public String allPatientInfo()
	{
		Queue<PatientType> queueHospitalPrint = new LinkedList<PatientType>();
		queueHospitalPrint = queueHospital;
		
		String output = null;
		
		while (!(queueHospitalPrint.isEmpty()))
		{
			output = output + queueHospital.remove().toString();
		}
		
		return output;
	}
}
