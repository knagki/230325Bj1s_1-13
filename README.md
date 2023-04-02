# 230325Bj1s_1-13
## 백준 입출력과 시칙연산
1. 2557번
```java
package bj1;

public class Bj1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```
2. 1000번
```java
package bj1;

import java.util.Scanner;

public class Bj2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
	}
}

```
3. 1001번
```java
package bj1;

import java.util.Scanner;

public class Bj3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a - b);
	}
}

```
4. 10998번
```java
package bj1;

import java.util.Scanner;

public class Bj4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a * b);

	}
}

```
5. 1008번
```java
package bj1;

import java.util.Scanner;

public class Bj5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b = 0.0;

		a = sc.nextDouble();
		b = sc.nextDouble();

		System.out.println(a / b);
	}
}

```
6. 10869번
```java
package bj1;

import java.util.Scanner;

public class Bj6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}

```
7. 10926번
```java
package bj1;
// Bj 10926
import java.util.Scanner;

public class Bj7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = "";

		i = sc.next();
		
		System.out.println(i + "??!");
	}
}

```
8. 18108번
```java
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

```
9. 10430번
```java
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

```
10. 2588번
```java
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

```
11. 11382번
```java
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

```
12. 10171번
```java
package bj1;
// Bj 10171
public class Bj12 {
	public static void main(String[] args) {
		
		System.out.println("\\    /\\\n"
						  + " )  ( ')\n"
						  + "(  /  )\n"
						  + " \\(__)|");
	}
}

```
13. 10172번
```java
package bj1;
// Bj 10172
public class Bj13 {
	public static void main(String[] args) {
		System.out.println("|\\_/|\n"
						 + "|q p|   /}\n"
						 + "( 0 )\"\"\"\\\n"
						 + "|\"^\"`    |\n"
						 + "||_/=\\\\__|");
	}
}

```
