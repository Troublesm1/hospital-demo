package hospital;
public class Patient {

    private int healthLevel;
    private int bloodLevel;


    public int getBloodLevel(){
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }


    //default constructor for a patient object
    public Patient(){
            bloodLevel = 20; //default blood level for a patient
            healthLevel = 10; //default blood level for a patient

    }
    //overloaded constructor
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
