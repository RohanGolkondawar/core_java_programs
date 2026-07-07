public class primeOrNot {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int count =0;
        int i;
        for (i=1;i<=a;i++){
            if((a % i) == 0){
                count++;
            }
        }

        if(count==2){
            System.out.println("It is prime Number");
        } else {
            System.out.println("It is not");
        }
    }
}
