public class Arrayn {
    public void printArray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Arrayn obj = new Arrayn();
        obj.printArray(new int[] {4,3,3,3,3});
    }
}
