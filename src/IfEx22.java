public class IfEx22 {
    public static void main(String[] args) {
        int score=88;
        char grade;

        if(score >= 90){
            grade ='A';
            System.out.println(grade+"학점입니다.");
        }
        else if(score >= 80) {
            grade='B';
            System.out.println(grade+"학점입니다.");
        }
        else if(score >= 70){
            grade='C';
            System.out.println(grade+"학점입니다.");
        }
        else if(score >= 60){
            grade='D';
            System.out.println(grade+"학점입니다.");
        }
        else {
            grade='F';
            System.out.println(grade+"학점입니다.");
        }
    }
}
