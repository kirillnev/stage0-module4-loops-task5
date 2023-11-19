package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        char ch = '8';
        if (cathetusLength == 1) {
            System.out.print(ch);
        } else if (cathetusLength > 1) {
            for (int i = 0; i < cathetusLength; i++) {
                for (int j = 0; j < cathetusLength; j++) {
                    if (i <= j - 1) {
                        System.out.print(' ');
                    } else {
                        System.out.print(ch);
                    }
                }
                System.out.println();
            }
        }
    }
}
