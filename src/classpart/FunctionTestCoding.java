package classpart;

public class FunctionTestCoding {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result = add(num1,num2);
        System.out.println(num1+"+"+num2+"="+result+"입니다.");
        result=minus(num1,num2);
        System.out.println(num1+"-"+num2+"="+result+"입니다.");
        result = times(num1,num2);
        System.out.println(num1+ "X"+num2+"="+result+ "입니다.");
        double value = divide(num1,num2);
        System.out.println(num1+"/"+num2+"="+result+"입니다.");

    }
    public static int add(int n1,int n2){
        int result = n1+ n2;
        return result;  //결과값 반환  add함수
    }
    public static int minus(int n1, int n2){
        int result = n1 - n2;
        return  result;
    }
    public static int times(int n1, int n2){
        int result = n1 * n2;
        return result;
    }
    public static double divide(int n1, int n2) {
        int result = n1/n2;
        return result;
    }
}
