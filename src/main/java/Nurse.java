import hospital.Patient;

public class Nurse {

    private String employeeNumber;
    private String name;
    private int numOfPatients;

    public Nurse(String employeeNumber, String name, int numOfPatients) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.numOfPatients = numOfPatients;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 80000;
    }
}
