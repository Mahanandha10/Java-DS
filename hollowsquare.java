public class hollowsquare {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((i == 0 || i == size - 1 || j == 0 || j == size - 1) ? "*" : " ");
            }
            System.out.println();
        }
    }
}