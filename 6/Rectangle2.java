public class Rectangle2 {
    int width;
    int height;

    Rectangle2() {
	setSize(10, 20);
    }

    @Override
    public String toString() {
	return "[ width = " + width + ", height = " + height + " ]";
    }

    void setSize(int w, int h) {
	if(w<0) width=0;
	else width=w;
	if(h<0) height=0;
	else height=h;
    }

    public static void main(String[] args) {
	Rectangle2 r = new Rectangle2();
	r.setSize(1, 2);
	System.out.println(r);
	r.setSize(-1, -2);
	System.out.println(r);
    }
}
