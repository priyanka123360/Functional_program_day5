package com.bridgelabz.com;

import java.util.Scanner;

public class Array_TwoD {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for Rows number : ");
		int m = sc.nextInt();
		System.out.println("Enter the Value for Columns number : ");
		int n = sc.nextInt();
		int[][] twoDArray = new int[m][n];
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.println("Enter Elements Value : [" + i + "]" + "[" + j + "]");
				int elements = sc.nextInt();
				twoDArray[i][j] = elements;
			}

		}
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {

				System.out.print(+twoDArray[i][j] + " ");

			}

			System.out.println();
		}
	}

}
