package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName() = "이상원";  //오류발생

        System.out.println(studentLee.getStudentName());
    }

}
