package bj1;
//Bj 10430
import java.util.Scanner;

public class Bj9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
	}
}
