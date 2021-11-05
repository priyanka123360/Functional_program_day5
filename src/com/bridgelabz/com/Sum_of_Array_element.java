package com.bridgelabz.com;

import java.util.Scanner;

public class Sum_of_Array_element {

		static void addElements(int[] arr, int p) {
			
			boolean found = false;
			for(int i=0; i < p-2; i++) {
				for(int j=i+1; j < p-1; j++) {
					for(int k=j+1; k < p; k++) {
						if(arr[i] + arr[j] + arr[k] == 0) {
							System.out.print(arr[i]);
							System.out.print(" ");
							System.out.print(arr[j]);
							System.out.print(" ");
							System.out.print(arr[k]);
							System.out.print("\n");
							found = true;
						}
					}
				}
			}
			if(found == false) 
				System.out.println(" Not Found ");
			
		}
		public static void main(String[] args) {
			
			int arr[]= {0,5,-1,2,6,-3,-2,1,3,9,7,4,8,-9,-4};
			int p = arr.length;
			addElements(arr,p);
			

	}
	}
