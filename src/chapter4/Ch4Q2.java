package chapter4;

public class Ch4Q2 {
    public static void main(String[] args) {

        int i;
        int j;

        for(i=2;i<=9;i++){
            if(i%2!=0)
                continue;
            for(j=1;j<=9;j++){
             System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
