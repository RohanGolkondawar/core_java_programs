package com.rohan.arraylist_scenario;

public class CabCustomerServiceTester {

    private static final CustomerService service = new CustomerService();

    public static void main(String[] args) {

        while (true) {

            int id = Integer.parseInt(IO.readln("Enter Id: "));
            String name = IO.readln("Enter Name: ");
            String pickupLocation = IO.readln("Enter pickupLocation: ");
            String dropLocation = IO.readln("Enter dropLocation : ");
            int distance = Integer.parseInt(IO.readln("Enter Distance : "));
            String phone = IO.readln("Enter Phone : ");

            Customer cust;

            try {
                cust = new Customer(id, name, pickupLocation, dropLocation, distance, phone);
            } catch (Exception e) {
                IO.println(e.getMessage());
                IO.println("Please re-enter details.\n");
                continue;
            }

            // store customer first
            service.addCustomer(cust);

            double bill = service.calculateBill(cust);
            service.printBill(cust);

            IO.println();
        }
    }
}
