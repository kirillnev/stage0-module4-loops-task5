package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        char ch = '8';
        if (height == 1) {
            System.out.print(ch);
        } else if (height > 1) {
            for (int i = 0; i < (height + 1) / 2; i++) {
                for (int j = 0; j < height; j++) {
                    if (j >= i && j <= height - 1 - i) {
                        System.out.print(ch);
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < (height + 1) / 2; i++) {
                if (height % 2 != 0 && i == 0) {
                    continue;
                }
                for (int j = 0; j < height; j++) {
                    if ((j >= (height - 1) / 2 - i) && (j <= height / 2 + i)) {
                        System.out.print(ch);
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }

}
