class Car 
{
    private int id;
    private static int sumCar=0;
    public Car(){
	sumCar++;
    }
    public static void showSumCar()
    {
	System.out.println("sumCar: " + sumCar);
    }
}

class F1 extends Car
{
    private static int sumF1=0;
    public F1(){
	sumF1++;
    }
    public static void showSumF1()
    {
	System.out.println("sumF1: " + sumF1);
    }
}

class Taxi extends Car
{
    private static int sumTaxi=0;
    public Taxi(){
	sumTaxi++;
    }
    public static void showSumTaxi()
    {
	System.out.println("sumTaxi: " + sumTaxi);
    }
}

class Quiz6
{
    public static void main(String[] args)
    {
	int ntaxi = 1;
	int nf1 = 3;
	Car[] cars = new Car[ntaxi+nf1];

	for (int i = 0; i < nf1; i++) {
	    cars[i] = new F1();
	}
	F1.showSumF1();
	for (int i = 0; i < ntaxi; i++) {
	    cars[i] = new Taxi();
	}
	Taxi.showSumTaxi();

	Car.showSumCar();
    }
}
