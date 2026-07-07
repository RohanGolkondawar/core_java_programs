public class CycleSellingPrice {
    public static void main(String[] args){
        int purchasePrice = Integer.parseInt(args[0]);
        int repairPrice = Integer.parseInt(args[1]);
        int coloringCost = Integer.parseInt(args[2]);
        int newAccessories = Integer.parseInt(args[3]);
        int profitExpected = Integer.parseInt(args[4]);
        int sellingPrice = (purchasePrice+repairPrice+coloringCost+newAccessories+profitExpected);
        System.out.println("Selling Price of the Cycle is : "+sellingPrice);

    }
}