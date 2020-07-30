package com.javaProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = null;
		Scanner scr2 = null;
		Scanner scr3 = null;
		try {
			scr = new Scanner(new File(
					"C:\\Users\\NIkhil\\workspace\\File handling\\sample folder\\sample2/cm29JAN2020bhav.csv"));
			scr2 = new Scanner(new File(
					"C:\\Users\\NIkhil\\workspace\\File handling\\sample folder\\sample2/cm30JAN2020bhav.csv"));
			scr3 = new Scanner(new File(
					"C:\\Users\\NIkhil\\workspace\\File handling\\sample folder\\sample2/cm31JAN2020bhav.csv"));
			scr.useDelimiter(","); // sets the delimiter pattern
			scr2.useDelimiter(",");
			scr3.useDelimiter(",");
			avoid(scr, 13);
			avoid(scr2, 13);
			avoid(scr3, 13);

			String path = "D:\\Desktop\\iconnect/output1.csv";
			// File file = new File(path);
			// file.createNewFile();
			FileWriter fw = new FileWriter(path);
			fw.write(" Range \n");
			while (scr2.hasNext()) {
				double sum = 0;

				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				String HIGH1 = scr.next();
				String LOW1 = scr.next();
				double range1 = Double.parseDouble(HIGH1) - Double.parseDouble(LOW1);

				System.out.println("HIGH-->" + HIGH1);
				System.out.println("LOW-->" + LOW1);
				System.out.println("Range=" + range1 + "-->");

				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");
				System.out.println(scr.next() + "  -->");

				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				String HIGH2 = scr2.next();
				String LOW2 = scr2.next();
				double range2 = Double.parseDouble(HIGH2) - Double.parseDouble(LOW2);

				System.out.println("HIGH-->" + HIGH2);
				System.out.println("LOW-->" + LOW2);
				System.out.println("Range=" + range2 + "-->");

				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");
				System.out.println(scr2.next() + "  -->");

				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				String HIGH3 = scr3.next();
				String LOW3 = scr3.next();
				double range3 = Double.parseDouble(HIGH3) - Double.parseDouble(LOW3);

				System.out.println("HIGH-->" + HIGH3);
				System.out.println("LOW-->" + LOW3);
				System.out.println("Range=" + range3 + "-->");

				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");
				System.out.println(scr3.next() + "  -->");

				sum = (range1 + range2 + range3);

				String conn = Double.toString(sum) + "\n";
				// System.out.println("sum= "+sum);
				fw.write(conn + "  ");
				// System.out.println(fw);

			}

			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scr != null)
				scr.close(); // closes the scanner
			if (scr2 != null)
				scr2.close();
			if (scr3 != null)
				scr3.close();
		}

	}

	private static void avoid(Scanner scr, int j) {
		for (int i = 0; i < j; i++) {

			System.out.println(scr.next() + "  -->");
		}

	}

}