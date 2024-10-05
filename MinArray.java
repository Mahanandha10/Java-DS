public class MinArray {
    public int findmin(int[] arr){
        if(arr== null || arr.length ==0){
            throw new IllegalArgumentException("Invalid");
        }
        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
            min = arr[i];
           }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={2,2,4,6,1};
        MinArray obj = new MinArray();
        System.out.println(obj.findmin(arr));
    }
}
