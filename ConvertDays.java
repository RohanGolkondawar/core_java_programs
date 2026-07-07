public class ConvertDays {
    public static void main(String[] args){
        int days = Integer.parseInt(args[0]);
        int years = days/365;
        int months = (days - 365)/30;
        int remainingDays = days - 365 - 30;
        System.out.println("Years : "+years);
        System.out.println("Months : "+months);
        System.out.println("Days : "+remainingDays);

    }
}