// CircleWithStaticMembers.java
public class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;
    
    CircleWithStaticMembers() {
	numberOfObjects++;
	radius=1;
    }
    
    CircleWithStaticMembers(double newRadius) {
	numberOfObjects++;
	radius=newRadius;
    }

    static int getNumberOfObjects() {
	return numberOfObjects;
    }

    double getArea() {
	return radius * radius * Math.PI;
    }
}
