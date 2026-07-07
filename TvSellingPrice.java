public class TvSellingPrice {
    public static void main(String[] args){
        int costPrice = 32500;
        int profitPercentage = 27;
        float profitPrice = ((costPrice/100)*27);
        float gst = ((costPrice+profitPrice)/100)*5;
        float sellingPrice = costPrice+profitPrice+gst;
        System.out.println("Profit : "+profitPrice);
        System.out.println("GST : "+gst);
        System.out.println("Total Selling Price : "+sellingPrice);
    }
}