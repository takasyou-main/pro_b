public class Student {
    String name;
    int[] score;
    public Student(String name, int x, int y, int z) {
	this.name=name;
	score= new int[3];
	score[0]=x;
	score[1]=y;
	score[2]=z;
    }
    public String toString() {
        String s = "[" + name;
        for (int i = 0;i<score.length; i++) {
            s +=","+score[i];
        }
        s += "]";

        return s;
    }
    public int total() {
        int sum = 0;
        for (int i = 0;i<score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
}
