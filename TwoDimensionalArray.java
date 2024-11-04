public class TwoDimensionalArray {
    public static void main(String args[]) {
                // int nums[] = new int[4];
                // nums[0]=3;
                // nums[1]=5;
                // nums[2]=6;
                // nums[3]=7;
                // for(int i=0;i<4;i++){
                //     System.out.print(nums[i]+" ");
                // }
                //int nums[][]=new int[3][4];
                // for(int i=0;i<3;i++){
                //     for(int j=0;j<4;j++){
                //         nums[i][j]=(int)(Math.random()*100);
                //         System.out.print(nums[i][j]+" ");
                //     }
                //     System.out.println();
                // }
                //for enchanced for loop
                // for(int n[]:nums){
                //     for(int m:n){
                //         System.out.print(m+" ");
                //     }
                //     System.out.println();
                // }

                //Jagged Array
               /* int nums[][]=new int[3][];//Jagged Array
                nums[0]=new int[3];
                nums[1]=new int[4];
                nums[2]=new int[2];
                for(int i=0;i<nums.length;i++){
                    for(int j=0;j<nums[i].length;j++){
                        nums[i][j]=(int)(Math.random()*10);
                    }
                }
                for(int n[]:nums){
                    for(int m:n){
                        System.out.print(m+" ");
                    }
                    System.out.println();
                }*/

                //Three Dimensional Array
                int nums[][][]=new int[2][3][4];
                for(int i=0;i<nums.length;i++){
                    for(int j=0;j<nums[i].length;j++){
                        nums[i][j]=(int)(Math.random()*10);
                    }
                }
                for(int n[]:nums){
                    for(int m:n){
                        System.out.print(m+" ");
                    }
                    System.out.println();
                }
    }
}
