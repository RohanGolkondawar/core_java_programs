public class TotalGrossSalary {
    public static void main(String[] args) {
        int basicSalary = Integer.parseInt(args[0]);
        int hra = (basicSalary/100)*15;
        int conveyanceAllowance = (basicSalary/100)*15;
        int entertainmentAllowance = (basicSalary/100)*10;
        int totalGross = basicSalary + hra + conveyanceAllowance + entertainmentAllowance;
        System.out.println("Basic Salary : "+basicSalary);
        System.out.println("HRA : "+hra);
        System.out.println("Conveyance allowance : "+conveyanceAllowance);
        System.out.println("Entertainment allowance: "+entertainmentAllowance);
        System.out.println("Total Gross Salary : "+totalGross);
    }
}
