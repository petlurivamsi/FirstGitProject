package com.Patterns.pattern5;

public class Pattern5 {

	/*
	 * 				   *
					  **
					 ***
					****
					 ***
					  **
					   *

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=4;
			for(int i=0;i<n;i++) {
					for(int space=n-1;space>i;space--) {
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
			}
			for(int i=0;i<n-1;i++) {
				for(int space=0;space<=i;space++) {
						System.out.print(" ");
				}
				for(int j=n-1;j>i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
