package com.song;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		double num1, num2;
		double result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("num1 입력 : ");
		str = scan.nextLine();
		num1 = Double.parseDouble(str);
		System.out.print("num2 입력 : ");
		num2 = scan.nextDouble();
		
		result = num1 + num2;
		System.out.println(result);
	}

}
