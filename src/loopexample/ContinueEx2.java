package loopexample;

public class ContinueEx2 {
    public static void main(String[] args) {
        int num;

        for(num=1;num<=100;num++) {  //100까지 반복
            if (num % 3 != 0)          // num 값이 3의배 인 경우
                continue;
            System.out.println(num);
        }
    }
}
