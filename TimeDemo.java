public class TimeDemo{
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeDemo demo = new TimeDemo();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken: "+(System.currentTimeMillis() - now));
    }
    public int findSum(int n){
        return n*(n+1)/2;
    }
  /* public int findSum(int n){
        int sum=0;
        for(int i=0; i<=n;i++){
            sum +=i;
        }
        return sum;
    } */ 
}