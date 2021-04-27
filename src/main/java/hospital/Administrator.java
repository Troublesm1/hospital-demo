package hospital;

import hospital.HospitalEmployee;

public abstract class Administrator extends HospitalEmployee {

    private String department;

    public Administrator(String employeeNumber, String name) {
        super(employeeNumber, name);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public abstract int calculatePay();


}
