package com.Patterns.pattern3;

/*
						
						* 
						* * 
						* * * 
						* * * * 
						* * * * * 
						* * * *
						* * * 
						* *
						*


*/

public class Pattern3 {

	public static void main(String[] args) {
		int n=4;
		// TODO Auto-generated method stub
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=0;i<n-1;i++) {
				for(int j=n-1;j>i;j--) {
					System.out.print("* ");
					
					
				}
				System.out.println();
			}
	}

}
