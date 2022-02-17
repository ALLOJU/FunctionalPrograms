package com.bridgelabz;

import java.util.Scanner;

public class SumOfTriplets {

	
	private static void findTriplets(int[] arr, int n) {
		boolean found=true;
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k] == 0) 
					{
						System.out.print(arr[i]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[j]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[k]); 
	                    System.out.print(" \t "); 
	                    found = true; 
					}
				}
			}
		}
		if(found==false) {
			System.out.println("Triplet not exist");
		}
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter an array elements");
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		}
		 findTriplets(arr, n);
	}


}
