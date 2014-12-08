public class Rectangle {
    int width;
    int height;

    Rectangle() {
	setSize(10, 20);
    }

    void setSize(int w, int h) {
	width = w;
	height = h;
    }

    int getArea() {
	return width * height;
    }

    boolean areSame(Rectangle a) {
	if (a == null || this == null) {
	    return false;
	}
	else if (a.width == this.width && a.height == this.height) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	System.out.println(r1.areSame(r2));
    }
}
