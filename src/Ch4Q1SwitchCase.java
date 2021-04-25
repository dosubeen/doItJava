public class Ch4Q1SwitchCase {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        char operator = '*';
        int result=0;

        switch (operator) {
            case 1: operator= '+';
            result = num1 + num2;
            break;

            case 2: operator= '-';
            result = num1 - num2;
            break;

            case 3: operator= '*';
            result = num1 * num2;
            break;

            case 4: operator= '/';
            result = num1/num2;
            break;

            default:
                System.out.println("잘못된 연산 부호입니다.");
        }
        System.out.println("위 연산의 결과는 "+result + "입니다." );
    }
}
