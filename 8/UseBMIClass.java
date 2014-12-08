// UseBMIClass.java
public class UseBMIClass {
    public static void main(String[] args) {
	BMI bmi1 = new BMI("Hanako Abe", 18, 50, 165);
	System.out.println("The BMI for " + bmi1.getName() + " is "
			   + bmi1.getBMI() + " " + bmi1.getStatus());
	BMI bmi2 = new BMI("Taro Ito", 70.0, 175);
	System.out.println("The BMI for " + bmi2.getName() + " is "
			   + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}

