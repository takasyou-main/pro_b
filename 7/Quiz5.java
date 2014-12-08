class Car 
{
    private int id;
    private double gas;

    public void set(int id, double gas) 
    {
	this.id = id;
	this.gas = gas;
    }

    public void show()
    {
	System.out.println("id: " + id);
	System.out.println("gas: " + gas);
    }
}

class F1 extends Car
{
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed)
    {
	this.maxSpeed = maxSpeed;
    }
}

class Taxi extends Car
{
    private static int sales;

    public void sales(int sales)
    {
	this.sales = sales;
    }
}

class Quiz5
{
    public static void main(String[] args)
    {
	F1 f1 = new F1();
	Taxi taxi = new Taxi();
	f1.set(1,10.0);
	taxi.set(2,20.0);
	f1.show();
	taxi.show();
    }
}
