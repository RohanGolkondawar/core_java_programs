public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Before Swapping : "+a+ "and" +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping : "+a+ "and" +b);


    }
}
