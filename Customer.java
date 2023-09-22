package apna_college;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCustomers = 100;
        int[] customerId = new int[maxCustomers];
        String[] flatNo = new String[maxCustomers];
        String[] ownerName = new String[maxCustomers];
        int[] monthlyConsumption = new int[maxCustomers];
        int numCustomers = 0;

        int choice;
        while (true) {
            System.out.println("1. Add Customer Details");
            System.out.println("2. Get Customer Details by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addCustomerDetails(customerId, flatNo, ownerName, monthlyConsumption, numCustomers, sc);
                    numCustomers++;
                    break;
                case 2:
                    getCustomerDetailsByID(customerId, flatNo, ownerName, monthlyConsumption, numCustomers, sc);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addCustomerDetails(int[] customerId, String[] flatNo, String[] ownerName, int[] monthlyConsumption, int numCustomers, Scanner sc) {
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();

        int index = findCustomerIndex(customerId, numCustomers, id);
        if (index != -1) {
            System.out.println("Customer ID already exists. Please try again with a unique ID.");
            return;
        }

        customerId[numCustomers] = id;

        System.out.println("Enter Flat Number: ");
        sc.nextLine(); // Consume the newline character left by sc.nextInt()
        flatNo[numCustomers] = sc.nextLine();

        System.out.println("Enter Owner Name: ");
        ownerName[numCustomers] = sc.nextLine();

        System.out.println("Enter Monthly Consumption (Electricity in units): ");
        monthlyConsumption[numCustomers] = sc.nextInt();

        System.out.println("Customer details added successfully.");
    }

    public static void getCustomerDetailsByID(int[] customerId, String[] flatNo, String[] ownerName, int[] monthlyConsumption, int numCustomers, Scanner sc) {
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();

        int index = findCustomerIndex(customerId, numCustomers, id);
        if (index != -1) {
            System.out.println("Customer ID: " + customerId[index]);
            System.out.println("Flat Number: " + flatNo[index]);
            System.out.println("Owner Name: " + ownerName[index]);
            System.out.println("Monthly Consumption (Electricity in units): " + monthlyConsumption[index]);
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }

    public static int findCustomerIndex(int[] customerId, int numCustomers, int id) {
        for (int i = 0; i < numCustomers; i++) {
            if (customerId[i] == id) {
                return i;
            }
        }
        return -1;
    }
}


