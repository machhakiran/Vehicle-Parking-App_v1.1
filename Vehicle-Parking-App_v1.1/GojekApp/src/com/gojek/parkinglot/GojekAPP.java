package com.gojek.parkinglot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author L4932170
 *  Created by Machha Kiran 05/11/2018.

 * Vehicle Parking Management Solution Application . 
 */

// Class that drives everything.
public class GojekAPP {
	public static void main(String[] args) {

		System.out.println("|-----------------System Help--------------------------------|");
		System.out.println("| 							                                 |");
		System.out.println("|1 .Creation Parking Lot :									 |");
		System.out.println("|Sample Command: create_parking_lot 6						 |");
		System.out.println("|															 |");
		System.out.println("|2. TO Park new Vehical :									 |");
		System.out.println("|Sample Command: park KA­01­HH­1234 White				 |");
		System.out.println("|															 |");
		System.out.println("|3.Freeing of Slot while Vehical Exit:						 |");
		System.out.println("|Sample Command: leave 4									 |");
		System.out.println("|															 |");
		System.out.println("|4.Parking Lot Status detials 							     |");
		System.out.println("|Sample Command: status										 |");
		System.out.println("|															 |");
		System.out.println("|5. Vehicle Reg No based on Colore:						     |");
		System.out.println("|Sample: registration_numbers_for_cars_with_colour White     |");
		System.out.println("|															 |");
		System.out.println("|6. Slot Number of the Vehical with White Colores:			 |");
		System.out.println("|Sample Command: slot_numbers_for_cars_with_colour White	 |");
		System.out.println("|															 |");
		System.out.println("|7.Slot number of Vehical based on enter  Registration Number|");
		System.out.println("|Sample:slot_number_for_registration_number KA­01­HH­3141 |");
		System.out.println("| 							                                 |");
		System.out.println("|8. Please enter 'exit' to quit                              |");
		System.out.println("|------------------------------------------------------------|");
		System.out.println(" 							                                 ");

		GojeckParkingProcesser gojekProcesser = new GojeckParkingProcesser();

		/*
		 * The Gojek parking Application Project will be provide solution for two major use cases
		 * 
		 *  	A. Application will take Single operation inputs for day to day operations  
		 *      B. Application will Accept Bulk Process File as input where series of operation will be performed based on input file .
		 *      
		 * 
		 */
 
		 System.out.println("System waiting for input command...");


		switch (args.length) {
		case 0:		

			//MODE:  Interactive command-line input/output 
			// Run an infinite loop to Accept Continues inputs 
			for (;;) {
				 System.out.println("");
				 System.out.println("Please enter your inputs...");

				try {
					BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
					String inputString = bufferRead.readLine();
					if (inputString.equalsIgnoreCase("exit")) {
						break;
					} else if ((inputString == null) || (inputString.isEmpty())) {
						// Do nothing
					} else {
						gojekProcesser.processCommand(inputString.trim());
					}
				} catch(IOException e) {
					System.out.println("Oops! somthing went wrong !..");
					e.printStackTrace();
				}
			}
			break;
		case 1:
			// MODE: Bulk File for input/output commands  
			GojekBulkProcesser bulkprocesser = new GojekBulkProcesser();
			bulkprocesser.processBulkCommonds(args[0]);
			break;
		default:
			System.out.println("Invalid input. Usage: java -jar <jar_fiel> <bulk_file_path>");
		}
	}
}
