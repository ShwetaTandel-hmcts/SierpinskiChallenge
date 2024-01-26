import java.util.ArrayList;

/**
 * Troy Tingle, Aleksejs Voloviks, Fergal O'shea, Shweta Tandel
 */
public class SierpinskiTriangle {

    public static void main(String[] args) {
        drawTriangle(4);
        drawSierpinskiTriangle(8);
        drawSierpinskiTriangle1(5);
        printSierpinski(16);
    }

    static void printSierpinski(int n)
    {
        for (int y = n - 1; y >= 0; y--) {

            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }
            for (int x = 0; x + y < n; x++) {
                if ((x & y) != 0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }

            System.out.print("\n");
        }
    }

    static void drawSierpinskiTriangle(int n)
    {
        for (int y = n - 1; y >= 0; y--) {

            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }
            for (int x = 0; x + y < n; x++) {
                if ((x & y) != 0)
                    System.out.print("  "
                    );
                else
                    System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawSierpinskiTriangle1(int order) {
        if (order == 1) {
            drawTriangle(4);
        } else {
            drawSierpinskiTriangle(order-1);
            System.out.println();
            drawSierpinskiTriangle(order-1);
            drawSierpinskiTriangle(order-1);
        }
    }

    public static void drawTriangle(int height){
        for (int i = 1; i <= height; i++) {
            //Print spaces in decreasing order. A is at 29th position.
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            //Print Triangle.
            for (int k = 0; k < i; k++) {
                if (k < 1)  {
                    System.out.print("* ");
                } else {
                    if (k > i - 2) {
                        System.out.print("* ");
                    } else {
                        if (i == height) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }

            System.out.println();
        }
    }

}

