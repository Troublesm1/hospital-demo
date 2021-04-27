package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

    Map<String, HospitalEmployee> employeeList = new HashMap<>();

    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }

    public HospitalEmployee findEmployee(String employeeNumber) {
        return (HospitalEmployee) employeeList.get(employeeNumber);
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee: employeeList.values()) {
            if (employee instanceof MedicalDuties){
                medicalEmployees.add(employee);
            }
        }
     return medicalEmployees;
    }
}
