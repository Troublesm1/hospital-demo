import hospital.HospitalEmployee;
import hospital.MedicalDuties;
import hospital.Patient;

public class Nurse extends HospitalEmployee implements MedicalDuties {

    private int numOfPatients;

    public Nurse(String employeeNumber, String name, int numOfPatients) {
        super(employeeNumber, name);
        this.numOfPatients = numOfPatients;
    }
    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }
    @Override
    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }
    @Override
    public int calculatePay() {
        return 80000;
    }
}
