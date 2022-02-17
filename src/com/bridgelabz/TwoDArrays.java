package com.bridgelabz;

import java.util.Scanner;

public class TwoDArrays {


	/**
	 * Read in and return an M-by-N array of ints from standard input.
	 */
	public static int[][] readInt2D() {

		System.out.println("enter rows and columns for matrix");
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] a = new int[M][N];
		System.out.println("enter elements of matrix");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

	/**
	 * Print the M-by-N array of ints to standard output.
	 */
	public static void print(int[][] a) {
		int M = a.length;
		int N = a[0].length;
		System.out.println("2D matrix of integers");

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {

				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	/**
	 * Read in and return an M-by-N array of ints from standard input.
	 */
	public static boolean[][] readBoolean2D() {

		System.out.println("enter rows and columns for Boolean matrix");
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[][] b = new boolean[M][N];
		System.out.println("enter boolean values of matrix");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				b[i][j] = sc.nextBoolean();
			}
		}
		return b;
	}
	/**
	 * Print the M-by-N array of booleans to standard output.
	 */
	public static void print(boolean[][] b) {
		int M = b.length;
		int N = b[0].length;
		System.out.println("2D matrix of booleans");

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {

				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}

	/**
	 * Read in and return an M-by-N array of doubles from standard input.
	 */
	public static double[][] readDouble2D() {

		System.out.println("enter rows and columns for double type matrix");
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		double[][] d = new double[M][N];
		System.out.println("enter double type elements of matrix");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				d[i][j] = sc.nextDouble();
			}
		}
		return d;
	}
	/**
	 * Print the M-by-N array of booleans to standard output.
	 */
	public static void print(double[][] d) {
		int M = d.length;
		int N = d[0].length;
		System.out.println("2D matrix of doubles");

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {

				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		//method for read 2D integer array
		int a[][]=TwoDArrays.readInt2D();
		//method for printing 2D integer array
		TwoDArrays.print(a);

		//method for read 2D Boolean array
		boolean b[][]=TwoDArrays.readBoolean2D();
		//method for printing 2D integer array
		TwoDArrays.print(b);

		//method for read 2D Boolean array
		double d[][]=TwoDArrays.readDouble2D();
		//method for printing 2D integer array
		TwoDArrays.print(d);

	}

}
