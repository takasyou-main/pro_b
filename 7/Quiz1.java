class Car {
    private int id;
    private double gas;
    Car(int number,double flue){
	id=number;
	gas=flue;
    }
    void show() {
	System.out.println("id: " + id);
	System.out.println("gas: " + gas);
    }
    
}

class Quiz1 {
    public static void main(String[] args) {
	Car car1 = new Car(1,10.0);
	car1.show();
    }
}
