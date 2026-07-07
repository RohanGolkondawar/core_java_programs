public class ItemBill {
    public static void main(String[] args) {
        int chickenRolls = Integer.parseInt(args[0]);
        int vegetablePuffs = Integer.parseInt(args[1]);
        int chickenRollPrice = 60;
        int vegetablePuffsPrice = 25;
        int discount = 50;
        int finalBill = ((chickenRolls*chickenRollPrice) + (vegetablePuffs*vegetablePuffsPrice)) - discount;
        System.out.println("************Item Bill*************");
        System.out.println("Chicken Rolls : "+chickenRolls+" Price :"+(chickenRolls*chickenRollPrice));
        System.out.println("Vegetable Puffs : "+vegetablePuffs+" Price : "+(vegetablePuffs*vegetablePuffsPrice));
        System.out.println("Final Bill with Discount is : = Rs "+finalBill);


    }
}
