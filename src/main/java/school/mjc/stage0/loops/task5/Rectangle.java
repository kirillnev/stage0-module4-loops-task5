package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        char ch = '8';
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
