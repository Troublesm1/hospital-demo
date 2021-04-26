import hospital.Doctor;
import hospital.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse("1", "name",5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To15WhenProvidedCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }
    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15,patientBloodLevel);
    }
    @Test
    public void shouldExpectASalaryOf80k(){
        int salary = underTest.calculatePay();
        assertEquals(80000, salary);
    }
}
