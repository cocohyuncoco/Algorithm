package chap01;

import java.util.Iterator;
import java.util.Scanner;

public class Q15 {

	static void triangleLB(int n) {
		//왼쪽아래가 직각인 이등변 삼각형 출력
		
		for (int i = 1; i <= n; i++) { 		
			for (int j=1; j<=i; j++) 		
				System.out.print('*');
				System.out.println(); 			
		}
	}
	
	static void triangleLU(int n) {
		//왼쪽위가 직각인 이등변 삼각형 출력
		
		for (int i = 1; i <= n; i++) { 		
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print('*');
				System.out.println(); 			
		}
	}
	
	static void triangleRB(int n) {
		
		//오른쪽아래가 직각인 이등변 삼각형 출력
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int s=1; s < n; s++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j =1; j <=i; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}			
	
	}
	
	static void triangleRU(int n) {
		//오른쪽 위가 직각인 이등변 삼각형 출력
		for (int i=n; i>=0; i--) { 		
			for (int j=1; j<=n-i; j++) 		
				System.out.println();
			for (int j=1; i<=i; j++) {
				System.out.print('*');
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("왼쪽아래가 직각인 이등변삼각형");

		do {
			System.out.print("원하는 숫자입력:");
			n = sc.nextInt();
		} while (n <= 0);

		
		System.out.println("왼쪽 아래가 직각");
		triangleLB(n);
		
		System.out.println("-----------------------");
		System.out.println("왼쪽 위가 직각");
		triangleLU(n);
		
		System.out.println("-----------------------");
		System.out.println("오른쪽 아래가 직각");
		triangleRB(n);
		
		System.out.println("-----------------------");
		System.out.println("오른쪽 위가 직각");
		triangleRU(n);
	}
}
