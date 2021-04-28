package loopexample;

public class BreakEx2 {
    public static void main(String[] args) {
        
        int sum = 0;
        int num = 0;

        for(num=0; ; num++) {  //합한 값이 100보다 크면 종료
            sum+=num;
            if(sum>=100)  //sum이 100보다 크거나 같을때(종료조건)
                break;    // 반복문 중단
        }
        System.out.println("num :" + num);
        System.out.println("sum :" + sum);
    }
}
