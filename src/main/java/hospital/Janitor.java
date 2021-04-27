package hospital;

public class Janitor extends Administrator {

    private boolean isCleaning;

    public Janitor(String employeeNumber, String name) {
        super(employeeNumber, name);
        this.isCleaning = isCleaning;
    }

    @Override
    public int calculatePay() {
        return 50000;
    }
}
