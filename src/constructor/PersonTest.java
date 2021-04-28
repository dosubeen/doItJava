package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personkim = new Person();  //생성자
        personkim.name ="김유신";
        personkim.height = 180.0F;
        personkim.weight = 85.5F;

        Person personLee = new Person("이순신",175,75);  // 인스턴스 변수 초기화와 동시에 클래스 생성
    }  //디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화


}
