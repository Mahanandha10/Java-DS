public class RemoveEvenIntegers {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static int[] removeEven(int[] arr){
        int oddcount =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddcount++;
            }
        }
        int[] result = new int[oddcount];
           int idx=0;
           for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
           }
           return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);

    }
}