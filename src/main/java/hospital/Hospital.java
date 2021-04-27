package hospital;

import java.util.HashMap;
import java.util.Map;

public class Hospital {

    Map<String, HospitalEmployee> employeeList = new HashMap<>();

    public void hire(Doctor doctor) {
        employeeList.put(doctor.getEmployeeNumber(), doctor);
    }

    public Doctor findEmployee(String employeeNumber) {
        return (Doctor) employeeList.get(employeeNumber);
    }
}
