import java.util.Scanner;

public class Ex4_02 {
    public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    Scanner scanner = new Scanner(System.in);
    System.out.println(">> ");
    rect.width = scanner.nextInt();
    rect.height = scanner.nextInt();
    System.out.println("사각형의 목적은 " + rect.getArea());
    scanner.close();
    }
}

class Rectangle {
    int width;
    int height;
        public int getArea() {
            return width*height;
        }
}