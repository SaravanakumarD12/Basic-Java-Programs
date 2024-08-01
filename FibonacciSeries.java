package day8;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter 1st integer: ");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd integer: ");
	int n2 = sc.nextInt();
	System.out.println("Enter the count : ");
	int count = sc.nextInt();
	System.out.println(n1);
	System.out.println(n2);
	for (int i=2;i<count;i++) {
		int n3=0;
		n3 = n1 + n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	
	
			
	
}
}
