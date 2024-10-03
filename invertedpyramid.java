public class invertedpyramid {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 5; i > n; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
