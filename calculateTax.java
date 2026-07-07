public class calculateTax {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        System.out.println("Payable Tax is for " +a+ " is : "+((a/100)*4.9));

    }
}
