package chapter5.test;

import chapter5.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
       // studentLee.studentName() = "이상원";  //오류발생
        studentLee.setStudentName("이상원");  //setStudentName()메서드를 활용해 private 변수에 접근 가능

        System.out.println(studentLee.getStudentName());
    }

}


/*
접근제어자
public 외부 클래스 어디에서나 접근 할수 있습니다.
protected 같은 패키지 내부와 상속관계의 클래스에서만 접근 할 수 있고 그외 클래스에서는 접근 할 수 없습니다.
아무것도 없는 경우 default 이며 같은 패키지 내부에서만 접근 할 수 있습니다.
private 같은 클래스 내부에서만 접근 할 수 있습니다.
 */