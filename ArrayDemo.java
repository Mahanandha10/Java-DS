public class ArrayDemo {
    public void demo(){
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] =30;
        myArray[3] = 40;
        myArray[4] = 50;
        printArray(myArray);
    }
    public void printArray(int[] arr ){
        int n =arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.demo();
    }
}
