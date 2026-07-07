public class DiscountNetBill {
    public static void main(String[] args){
        int netBill = Integer.parseInt(args[0]);
        if(netBill<5000){
            int discount = 5;
            double discAmount = (netBill/100)*discount;
            System.out.println("Discount  % : "+discount);
            System.out.println("Discount Amount : "+discAmount);
            System.out.println("Amount Payable : "+(netBill-discAmount));
        } else if (netBill>=5000 && netBill<=9999){
            int discount = 10;
            double discAmount = (netBill/100)*discount;
            System.out.println("Discount  % : "+discount);
            System.out.println("Discount Amount : "+discAmount);
            System.out.println("Amount Payable : "+(netBill-discAmount));
        } else if(netBill>=10000){
            int discount = 15;
            double discAmount = (netBill/100)*discount;
            System.out.println("Discount  % : "+discount);
            System.out.println("Discount Amount : "+discAmount);
            System.out.println("Amount Payable : "+(netBill-discAmount));
        }
    }
}