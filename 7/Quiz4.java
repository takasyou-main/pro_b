class Car {
    private static int sumCar=0;
    private int num;
    private double gas;
    public Car(){
	sumCar++;
    }
    public static void showSumCar()
    {
	System.out.println("SumCar: " + sumCar);
    }
}

class Quiz4 {
    public static void main(String[] args) {
	int max = 100;
	Car[] cars = new Car[max];
	for (int i = 0; i < max; i++) {
	    cars[i] = new Car();
	}
	Car.showSumCar();
    }
}
