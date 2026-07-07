public class ArmstrongNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int temp = a;
        int r,sum=0;
        while(temp!=0){
            r = temp%10;
            sum+=r*r*r;
            temp/=10;
        }
        if(a==sum){
            System.out.println("It is An Artmstrong Number");
        } else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}
