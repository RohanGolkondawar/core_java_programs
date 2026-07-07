public class SimpleInterestCalculate {
    public static void main(String[] args){
        int principal = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int time = Integer.parseInt(args[2]);
        int simpleInterest = (principal*rate*time)/100;
        System.out.println("Simple Interest is : "+simpleInterest);
        System.out.println("Amount : "+(simpleInterest+principal));
    }
}