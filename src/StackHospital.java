import java.util.Stack;

/**
 * Class representing a Hospital that orders its patients in the following way: Patients are 
 * ordered via a Stack. That is, the most recent patient admitted is the first to be treated. 
 * If more patients are added before the first patient is treated, the first patient will 
 * have to wait. This is known as LIFO, or last-in-first-out ordering. Most businesses would 
 * not operate in this way - always prioritizing the most recent customer over those who have 
 * already waited for a long time.
 *
 * @author Lynden
 * @version 2019-03-12
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class StackHospital<PatientType> extends Hospital<PatientType> {

	private Stack<PatientType> stackHosp;
	
	private int numPatients;
	
	/**
	 * Initializes the Patient Stack.
	 */
	public StackHospital()
	{
		stackHosp = new Stack<PatientType>();
		numPatients = 0;
	}
	
	/**
	 * Add a patient to the Hospital.
	 * 
	 * @param patient - The patient to be added.
	 */
	@Override
	public void addPatient(PatientType patient)
	{
		stackHosp.push(patient);
		numPatients = numPatients + 1;
	}
	
	/**
	 * Find and return the patient who will next be treated. Does not treat the patient 
	 * (i.e. it is not removed from the collection of patients that the hospital still 
	 * must treat).
	 * 
	 * @return The patient who would be next treated.
	 */
	@Override
	public PatientType nextPatient()
	{
		return stackHosp.peek();
	}
	
	/**
	 * Treats the next patient and removes them from the Hospital. Once someone is healed 
	 * they no longer need to stay in the Hospital.
	 * 
	 * @return The patient receiving treatment.
	 */
	@Override
	public PatientType treatNextPatient()
	{
		numPatients = numPatients - 1;
		return stackHosp.pop();
	}
	
	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 * 
	 * @return numPatients - The number of patients in the Hospital.
	 */
	@Override
	public int numPatients()
	{
		return numPatients;
	}
	
	/**
	 * Gives a String for the hospital type.
	 * 
	 * @return type - A string exactly matching the class name.
	 */
	@Override
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	/**
	 * Prints all patient information.
	 * 
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	@Override
	public String allPatientInfo()
	{
		Stack<PatientType> stackHospitalPrint = new Stack<PatientType>();
		stackHospitalPrint = stackHosp;
		
		String output = "";
		
		while (numPatients != 0)
		{
			output = output + stackHospitalPrint.pop().toString();
			numPatients = numPatients - 1;
		}
		
		return output;
	}
}