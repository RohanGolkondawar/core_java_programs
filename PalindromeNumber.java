public class PalindromeNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int temp = number;
        int rev = 0,r;
        while(temp!=0){
            r = temp%10;
            rev = rev*10+r;
            temp/=10 ;
        }

        if(number==rev){
            System.out.println("It is Palindrome Number");
        } else
        {
            System.out.println("It is not a Palindrome Number");
        }
    }
}
