package cooperation;

import chapter6.cooperation.Taxi;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James",5000);
        Student studentTomas = new Student("Tomas",10000);  //학생 두명 생성

        Bus bus100 = new Bus(100);  //노선번호가 100번인 버스 생성
        studentJames.takeBus(bus100);  // 제임스가 100번 버스를 탐.
        studentJames.showInfo(); //제임스 정보 출력
        bus100.showInfo(); //버스정보 출력

        Subway subwayGreen = new Subway("2호선"); //노선번호가 2호선인 지하철을 생성
        studentTomas.takeSubway(subwayGreen); //토마스가 2호선을 탐.
        studentTomas.showInfo();//토마스 정보 출력
        subwayGreen.showInfo();//지하철 정보 출력

        Student studentEdward = new Student("Edward", 15000);
        Taxi taxi = new Taxi("Hi");
        studentEdward.takeTaxi(taxi);
        studentEdward.showInfo();
        taxi.showInfo();
    }
}
