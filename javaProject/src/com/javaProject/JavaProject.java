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
			scr = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm29JAN2020bhav.csv"));
			scr2 = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm30JAN2020bhav.csv"));
			scr3 = new Scanner(new File("D:\\Desktop\\iconnect\\input/cm31JAN2020bhav.csv"));
			scr.useDelimiter(","); // sets the delimiter pattern
			scr2.useDelimiter(",");
			scr3.useDelimiter(",");
			avoid(scr, 13);
			avoid(scr2, 13);
			avoid(scr3, 13);

			String path = "D:\\Desktop\\iconnect\\output/output1.csv";

			FileWriter fw = new FileWriter(path);
			fw.write(" Range \n");
			while (scr2.hasNext()) {
				double sum = 0;

				avoid(scr, 3);
				String HIGH1 = scr.next();
				String LOW1 = scr.next();
				double range1 = Double.parseDouble(HIGH1) - Double.parseDouble(LOW1);

				System.out.println("Range=" + range1 + "-->");

				avoid(scr, 8);

				avoid(scr2, 3);
				String HIGH2 = scr2.next();
				String LOW2 = scr2.next();
				double range2 = Double.parseDouble(HIGH2) - Double.parseDouble(LOW2);

				System.out.println("Range=" + range2 + "-->");

				avoid(scr2, 8);

				avoid(scr3, 3);
				String HIGH3 = scr3.next();
				String LOW3 = scr3.next();
				double range3 = Double.parseDouble(HIGH3) - Double.parseDouble(LOW3);

				System.out.println("Range=" + range3 + "-->");

				avoid(scr3, 8);

				sum = (range1 + range2 + range3);

				String conn = Double.toString(sum) + "\n";

				fw.write(conn + "  ");

			}

			fw.flush();
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (scr != null)
				scr.close(); // closes the scanner
			if (scr2 != null)
				scr2.close();// closes the scanner
			if (scr3 != null)
				scr3.close();// closes the scanner
		}

	}

	private static void avoid(Scanner scr, int j) {
		for (int i = 0; i < j; i++) {

			scr.next();
		}

	}

}
