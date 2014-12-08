public class TestCourse {
    public static void main(String[] args) {
	Course course1 = new Course("Programming A");
	Course course2 = new Course("Programming B");
	String[] students;

	course1.addStudent("Taro");
	course1.addStudent("Hanako");
	course1.addStudent("Jiro");

	course2.addStudent("Ichiro");
	course2.addStudent("Jiro");

	System.out.println("Number of students in course1: "
			   + course1.getNumberOfStudents());

	students = course1.getStudents();
	
	for (int i = 0; i < course1.getNumberOfStudents(); i++) {
	    System.out.print(students[i] + ", ");
	} System.out.println();

	System.out.println("Number of students in course2: "
			   + course2.getNumberOfStudents());
	students = course2.getStudents();
	for (int i = 0; i < course2.getNumberOfStudents(); i++) {
	    System.out.print(students[i] + ", ");
	} System.out.println();
    }
}
