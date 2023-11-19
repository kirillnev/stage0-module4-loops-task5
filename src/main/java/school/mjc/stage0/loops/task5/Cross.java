package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        char ch = '8';
        if (sideLength == 1) {
            System.out.print(ch);
        } else if (sideLength > 1) {
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    char prCh;
                    if (i == (sideLength - 1)/ 2 || j == (sideLength - 1) / 2) {
                        prCh = ch;
                    } else {
                        prCh = ' ';
                    }
                    System.out.print(prCh);
                }
                System.out.println();
            }
        }
    }
}
