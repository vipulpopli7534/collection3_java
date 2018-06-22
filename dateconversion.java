package asg11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dateconversion {
	public static HashMap<String,String> month=new HashMap<String,String>();
	
	public static void convert(String date) {
		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");
		String result="";
		String d=date.substring(0, 2);
		String y=date.substring(6, 10);
		String m=date.substring(3, 5);
	System.out.println(d+" "+month.get(m)+" "+y);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		convert(date);
	}
}
