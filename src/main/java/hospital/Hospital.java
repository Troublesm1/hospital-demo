package hospital;

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
}
