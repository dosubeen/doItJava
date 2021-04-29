package thisex;

class  Birthday{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;   //태어난 연도를 지정하는 메소드, bDay.year = year;와 같음
    }

    public void printThis(){
        System.out.println(this);   //this 출력 메서드, System.out.println(b.Day)와 같음
    }
}
public class ThisEx {
    public static void main(String[] args) {
        Birthday bDay = new Birthday();
        bDay.setYear(2000);  //태어난 연도를 2000으로 지정
        System.out.println(bDay);  //참조변수 출력
        bDay.printThis();  //this 출력 메서드 호출
    }
}
