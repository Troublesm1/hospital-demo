package hospital;

public class Receptionist extends Administrator {

    private boolean isOnPhone;

    public Receptionist(java.lang.String employeeNumber, java.lang.String name) {
        super(employeeNumber, name);
        this.isOnPhone = isOnPhone;
    }


    @Override
    public int calculatePay() {
        return 50000;
    }
}
