import java.util.Arrays;

public class SierpinskiCarpet {

   public static void main(String[] args) {
        drawSierpinskiCarpet(3, 27);
    }

    public static void drawSierpinskiCarpet(int order, int size) {
        //TODO: Implement this
        char[][] carpet = new char[size][size];

        initCarpet(carpet);
        drawCarpet(carpet,size, order, 0, 0);
        printCarpet(carpet);
    }

    private static void initCarpet(char[][] carpet){
        for (char[] chars : carpet) {
            Arrays.fill(chars, ' ');
        }
    }

    private static void drawCarpet(char[][] carpet, int size, int order, int x, int y){
        if(size == 1){
            carpet[x][y] = '*';
        } else {
            int newSize = size / order;
            for (int i = 0; i < order; i++){
                for (int j = 0; j < order; j++){
                    if (!(i == 1 && j == 1)){
                        drawCarpet(carpet, newSize, order,x + i*newSize, y+j*newSize);
                    }
                }
            }
        }
    }

    private static void printCarpet(char[][] carpet){
        for (char[] chars : carpet) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }


}
