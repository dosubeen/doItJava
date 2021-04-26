package classpart;

public class Student {
    int studentID;  //학번
    String studentName; //학생이름
    int grade;  //학년
    String address; // 사는 곳   ,  모두 멤버 변수

    public void showStudentInfo() {
        System.out.println(studentName + " , " + address);  //이름 ,주소 출력  (메서드 추가)
    }
    public String getStudentName() {
        return studentName;   //학생의 이름을 반환하는 메서드
    }

    public static void main(String[] args) {
        Student studentAhn = new Student(); //student 클래스 생성
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
    public void setStudentName(String name) {
        studentName = name;
    }//학생이름을 매개변수로 전달
}
