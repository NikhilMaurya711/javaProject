package com.javaProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaProject {

	public static void main(String[] args) {

		Scanner scr = null;
		Scanner scr2 = null;
		Scanner scr3 = null;

		try {

			// fetching the csv files from directory
			scr = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm29JAN2020bhav.csv"));
			scr2 = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm30JAN2020bhav.csv"));
			scr3 = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm31JAN2020bhav.csv"));

			// removing ' , ' from records to seperate the words.
			scr.useDelimiter(","); // sets the delimiter pattern
			scr2.useDelimiter(",");
			scr3.useDelimiter(",");

			// calling for avoid method to avoid unrequiered column to display
			avoid(scr, 13);
			avoid(scr2, 13);
			avoid(scr3, 13);

			// creating output.csv files to store the result
			String path = "D:\\Desktop\\iconnect\\output/output1.csv";

			// used FileWriter class to write into output.csv files
			FileWriter fw = new FileWriter(path);

			// ====Column name in output.csv file============
			fw.write(" Running Total \n");

			// checking for input value->if true ->go into ->while
			while (scr.hasNext()) {
				double sum = 0;// for adding running total

				avoid(scr, 3);// to avoid starting columns in 1st file

				// =======Opertaion code for 1st CSV file=============
				String HIGH1 = scr.next();
				String LOW1 = scr.next();
				double range1 = Double.parseDouble(HIGH1) - Double.parseDouble(LOW1);

				System.out.println("Range=" + range1);

				avoid(scr, 8);// to avoid ending columns in 1st file

				avoid(scr2, 3);// to avoid starting columns in 2nd file

				// =======Opertaion code for 2nd CSV file=============
				String HIGH2 = scr2.next();
				String LOW2 = scr2.next();
				double range2 = Double.parseDouble(HIGH2) - Double.parseDouble(LOW2);

				System.out.println("Range=" + range2);

				avoid(scr2, 8);// to avoid ending columns in 2nd file

				avoid(scr3, 3);// to avoid ending columns in 3rd file
				// =======Opertaion code for 3rd CSV file=============
				String HIGH3 = scr3.next();
				String LOW3 = scr3.next();
				double range3 = Double.parseDouble(HIGH3) - Double.parseDouble(LOW3);

				System.out.println("Range=" + range3);

				avoid(scr3, 8);// to avoid ending columns in 3rd file

				// adding all 3 range to get the Runnning total
				sum = (range1 + range2 + range3);

				String conn = Double.toString(sum) + "\n";// to convert Double datatype into String and go to next line
														
				fw.write(conn + "  ");// To write into output.csv file

			}

			fw.flush();// to store into output.csv files permanently
			fw.close();// closing of output.csv file after opertaion
		} catch (IOException e) {

			e.printStackTrace();// to show thw error
		} finally {
			if (scr != null)
				scr.close(); // closes the scanner
			if (scr2 != null)
				scr2.close();// closes the scanner
			if (scr3 != null)
				scr3.close();// closes the scanner
		}

	}

	// j parameter indicates no of column to avoid and scr point the catched
	// object of 1st, 2nd and 3rd files
	private static void avoid(Scanner scr, int j) {
		for (int i = 0; i < j; i++) {
			if (scr.hasNext())
				scr.next();
		}

	}

}
