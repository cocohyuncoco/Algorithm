package chap01;

import java.util.Scanner;

public class Q17 {
	static void npira(int n) {
		for (int i=1; i<=n; i++) { 					
			for (int j=1; j<=n-i+1; j++) 		
				System.out.print(" ");
			for (int j=1; j<=(i-1)*2+1; j++) 	
				System.out.print(i%10);
			System.out.println(); 						
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("���� Ʈ�� �����");

		do {
			System.out.print("�����Է� :");
			n = sc.nextInt();
		} while (n <= 0);

		npira(n); 
	}
}
