public class Ch4Q1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        int result = 0;

        if(operator == '+') {
            result = num1+num2;
        }
        else if(operator == '-') {
            result = num1-num2;
        }
        else if(operator == '*') {
            result = num1 * num2;
        }
        else if(operator == '/'){
            result = num1 / num2;
        }
        else {
            System.out.println("잘못된 연산 부호입니다.");
        }
        System.out.println("위 연산의 결과는" + result + "입니다.");
    }
}
