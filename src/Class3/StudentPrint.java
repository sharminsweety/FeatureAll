package Class3;

public class StudentPrint {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Sweety";
        student.id=26;
        student.height=5;
        student.studentName();
        student.studentInfo();

        Student student1 = new Student();
        student1.name = "Jasmin";
        student1.id =27;
        student1.height=5.3f;

        student1.studentName();
        student1.studentInfo();

        Student student2 = new Student("kobir", 28, 5.4f );
        student2.studentName();
        student2.studentInfo();


    }
}
