package com.bill;

import java.util.Scanner;

public class ComputerElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long units;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of unites");
		
		  units = sc.nextLong();
		  
		  double billpay=0;
		  
		  int unites = 0;
		if(unites<=100)
			  billpay=0;
		else if (unites>=100)
			billpay=100*3.5;
		
		System.out.println("Bill to pay : " + billpay);
		
			

	}

}
