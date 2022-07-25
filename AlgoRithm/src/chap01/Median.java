package chap01;

import java.util.Scanner;

//3정수의 정수값을 입력하고 중앙값을 구한다음 출력
public class Median {

	
	static int med3(int a, int b, int c) {
			
		if (a >= b) 
			if (b >= c) 
				return b;
			else if (a <= c)				
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c) 
			return c;
		else 
			return b;
		
	}
	
	//중앙값 구하는 메서드를 이렇게 작성할수도 있다. 근데 이건 med3보다 효율이 떨어진다.
	static int meds3(int a, int b, int c) {
		
		if ((b >= a && c <= a) || (b <= a && c >= a)) 
			return a;
		else if ((a >= b && c <= b) || (a < b && c > b)) 
			return b;
		return c;		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**3 정수의 중앙값 구합니다**");
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		System.out.println("중앙값은 "+med3(a, b, c)+"입니다");

	}

}
