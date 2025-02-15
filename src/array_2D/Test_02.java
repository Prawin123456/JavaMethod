package array_2D;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[][]a=new int[2][3];
		System.out.println("enter 6 element :");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		 System.out.println("2D Array:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}


