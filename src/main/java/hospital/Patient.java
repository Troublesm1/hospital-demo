package hospital;
public class Patient {

    private int healthLevel;

    public int getHealthLevel() {
        return healthLevel;
    }
    //default constructor for a patient object
        public Patient(){
            healthLevel = 10; //default health level for a patient
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }
}
