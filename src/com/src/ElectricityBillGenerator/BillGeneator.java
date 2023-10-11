package com.src.ElectricityBillGenerator;


	
	import java.util.Scanner;

	public class BillGeneator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Electricity Bill Generation System");
	        System.out.print("Enter Customer Name: ");
	        String customerName = scanner.nextLine();
	        System.out.print("Enter Customer ID: ");
	        String customerId = scanner.nextLine();
	        System.out.print("Enter Units Consumed: ");
	        double unitsConsumed = scanner.nextDouble();

	        
	        double totalBillAmount = calculateBill(unitsConsumed);

	        
	        System.out.println("\nElectricity Bill for " + customerName + " (ID: " + customerId + ")");
	        System.out.println("Units Consumed: " + unitsConsumed + " units");
	        System.out.println("Total Bill Amount: "+ totalBillAmount);

	        
	        scanner.close();
	    }

	    
	    public static double calculateBill(double unitsConsumed) {
	        double billAmount = 0.0;
	        
	        if (unitsConsumed <= 100) {
	            billAmount = unitsConsumed * 5.0; 
	            
	        } else if (unitsConsumed <= 200) {
	            billAmount = 100 + (unitsConsumed - 100) * 7.0; 
	        } else if (unitsConsumed <= 300) {
	            billAmount = 100 + 100 * 7.0 + (unitsConsumed - 200) * 10.0; 
	        } else {
	            billAmount = 100 + 100 * 7.0 + 100 * 10.0 + (unitsConsumed - 300) * 12.0; 
	        }
	        return billAmount;
	    }
	}



