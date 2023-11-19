package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        char ch = '8';
        if (sideLength == 1) {
            System.out.print(ch);
        } else if (sideLength > 1){
            for (int i = 0; i < sideLength; i++) {
                System.out.print(ch);
            }
            System.out.println();
            for (int i = 1; i < sideLength - 1; i++) {
                System.out.print(ch);
                for (int j = 1; j < sideLength - 1; j++) {
                    System.out.print(' ');
                }
                System.out.print(ch);
                System.out.println();
            }
            for (int i = 0; i < sideLength; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
