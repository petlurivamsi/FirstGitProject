package com.Patterns.pattern4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			for(int i=n;i>0;i--) {
				for(int j=0;j<i-1;j++) {
					System.out.print("  ");
				}
				for(int k=n;k>=i;k--) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}

}
