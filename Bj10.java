package bj1;
// Bj 2588
import java.util.Scanner;

public class Bj10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
//		System.out.println(472*(385%10));
//		System.out.println(472*(385%100/10));
//		System.out.println(472*(385/100));
//		System.out.println(472*385);
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
