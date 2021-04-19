

public class OperationEx1 {

    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 80;  //국어점수 추

        int totalScore = mathScore + engScore + korScore;  // 총점 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 3 ; // 평균구하기
        System.out.println(avgScore);

        int gameScore = 150;  //게임에서 획득한 점수는 150점

        int lastScore1 = gameScore++;  // gameScore에서 1만큼 더한 값을 lastScore1에 대입
        System.out.println(lastScore1); //151

        int lastScore2 = gameScore--;  //gameScore에서 1만큼 뺀 값을 lastScore2에 대입
        System.out.println(lastScore2);  //150


        int num1 = 10;
        int i = 2;

        boolean value= ((num1 = num1+10) <10) && ((i=i+2)<10);  // 논리곱에서 앞 항이 거짓이면 뒷항이 실행되지 않아 i값은 그대로!
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1=num1+10) >10) || ((i=i+2)<10);  // 논리합에서 앞항이 참이면 뒷항은 실행되지 않아 i값은 그대로!
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        int num = 5;
        int i1 = 10;

        boolean value1 = ((num = num * 10) >45) || ((i1 = i1 -5) <10);
        System.out.println(value1);  //true
        System.out.println(num);  //50
        System.out.println(i1);  //10


    }

}
