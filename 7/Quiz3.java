class Car {
    private int id;
    private double gas;
    Car(){
	id=0;
	gas=0;
    }
    Car(int id){
	this.id=id;
    }
    Car(double gas){
	this.gas=gas;
    }
    Car(int id,double gas){
	this.id=id;
	this.gas=gas;
    }
    void show() {
	System.out.println("id: " + id);
	System.out.println("gas: " + gas);
    }
}

class Quiz3 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.show();
	Car car2 = new Car(1, 10.0);
	car2.show();
    }
}
