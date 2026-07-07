public class ElectricityBill {
    public static void main(String[] args){
        int units = Integer.parseInt(args[0]);
        double bill = 160;
        if(units<=100){
            System.out.println("Bill is : Rs "+bill);
        }else if(units>100 && units<=250){
            units = 160 + (units-100)*1;
            System.out.println("Bill is : Rs "+bill);
        } else {
            units = 160 + (units-100)*1;
            System.out.println("Bill is : Rs "+bill);
        }
    }
}