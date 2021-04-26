public class Ch4Q4 {
    public static void main(String[] args) {
        int linecount = 4;
        int spacecount = linecount / 2 + 1;
        int starcount = 1;

        for (int i = 0; i < linecount; i++) {
            for (int j = 0; j < spacecount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starcount; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spacecount; j++) {
                System.out.print(' ');
            }
            spacecount -= 1;
            starcount += 2;
            System.out.println();

        }
    }
}


      /*  int lineCount = 4;
        int spaceCount = lineCount / 2 + 1;
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            spaceCount -= 1;
            starCount += 2;
            System.out.println();
        }
    }
}*/
