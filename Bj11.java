package bj1;
// Bj 11382
import java.util.Scanner;

public class Bj11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int형보다 큰 값을 출력할 수 있어서 long형으로 사용 
		long a, b, c = 0;
		
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		
		System.out.println(a + b + c);
	}
}
