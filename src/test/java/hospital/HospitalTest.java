package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1","doctor name","speciality");
    Nurse nurse = new Nurse("2","nurse name",5);
    Janitor janitor = new Janitor("3","janitor name","maternity wing",true);

    @Test
    public void shouldBeAbleToHireADoctor(){
        underTest.hire(doctor);
        Doctor foundDoctor = underTest.findEmployee("1");
        assertEquals("doctor name", foundDoctor.getName());
    }
}
