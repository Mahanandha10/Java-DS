//object creation and method 
class Calculator{
    int a=10;
    public int add(int num1,int num2){
       int r=num1+num2;
        return r;
    }
}
public class Demo {
    public static void main(String a[]) {
        //System.out.println("Result = "+( num1 + num2));
        Calculator calc = new Calculator();
        int result =calc.add(4,5);
        System.out.println(result);
    }
}
