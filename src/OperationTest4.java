public class OperationTest4 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean result;

        result = ((num1 > 10) && (num2 > 10));  // F 둘다 참이여야 참
        System.out.println(result);
        result = ((num1 > 10) || (num2 >10));   // T 둘 중하나가 참이면 참
        System.out.println(result);
        System.out.println(!result); //F

    }
}
