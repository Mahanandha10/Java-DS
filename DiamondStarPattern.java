public class DiamondStarPattern {
    public static void main(String[] args) {
        
                int size = 5;
                int totalLines = 2 * size - 1;
                
                for (int line = 1; line <= totalLines; line++) {
                    int distanceFromMiddle = Math.abs(line - size);
                    int stars = 2 * (size - distanceFromMiddle) - 1;
                    int spaces = (totalLines - stars) / 2;
                    
                    System.out.println(" ".repeat(spaces) + "*".repeat(stars));
                }
            }
        

        // for (int i = -size + 1; i < size; i++) {
        //     for (int j = 0; j < Math.abs(i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 0; k < 2 * (size - Math.abs(i)) - 1; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

