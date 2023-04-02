package bj1;
// bj18108

import java.util.Scanner;

public class Bj8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		
		year = sc.nextInt();
		
		if (year >= 1000 && year <= 3000) {
			System.out.println(year - 543);
		}
	}
}
