public class FactorialOfNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int f=1;
        while (a!=0){
            f = f*a;
            a--;
        }
        System.out.println("Factorial of "+args[0]+" is : "+f);
    }
}
