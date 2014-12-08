public class StudentExam {
    public static void main(String[] args) {
        Student[] data = {
            new Student("Alice" , 70, 80, 90),
            new Student("Bob"   , 60, 50, 70),
            new Student("Taro"  , 80, 60, 90),
            new Student("Hanako", 90, 40, 80),
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " -> " + data[i].total());
        }
    }
}
