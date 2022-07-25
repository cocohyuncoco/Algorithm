package chap01;

import java.util.Iterator;
import java.util.Scanner;

public class Q15 {

	static void triangleLB(int n) {
		//���ʾƷ��� ������ �̵ �ﰢ�� ���
		
		for (int i = 1; i <= n; i++) { 		
			for (int j=1; j<=i; j++) 		
				System.out.print('*');
				System.out.println(); 			
		}
	}
	
	static void triangleLU(int n) {
		//�������� ������ �̵ �ﰢ�� ���
		
		for (int i = 1; i <= n; i++) { 		
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print('*');
				System.out.println(); 			
		}
	}
	
	static void triangleRB(int n) {
		
		//�����ʾƷ��� ������ �̵ �ﰢ�� ���
		for (int i = 1; i <= n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int s=1; s < n; s++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j =1; j <=i; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						// ����(�ٺ�ȯ)
		}			
	
	}
	
	static void triangleRU(int n) {
		//������ ���� ������ �̵ �ﰢ�� ���
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

		System.out.println("���ʾƷ��� ������ �̵�ﰢ��");

		do {
			System.out.print("���ϴ� �����Է�:");
			n = sc.nextInt();
		} while (n <= 0);

		
		System.out.println("���� �Ʒ��� ����");
		triangleLB(n);
		
		System.out.println("-----------------------");
		System.out.println("���� ���� ����");
		triangleLU(n);
		
		System.out.println("-----------------------");
		System.out.println("������ �Ʒ��� ����");
		triangleRB(n);
		
		System.out.println("-----------------------");
		System.out.println("������ ���� ����");
		triangleRU(n);
	}
}
