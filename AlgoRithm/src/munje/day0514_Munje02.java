package munje;

import java.util.Scanner;

public class day0514_Munje02 {
	//�迭b�� ��� ��Ҹ� �迭a�� �������� �����ϴ� �޼��� rcopy

	static void rcopy(int[] a, int[] b) {
				
		for (int i=0; i<a.length; i++)
			
			a[i] = b[b.length - i - 1];
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ��� ");
		int numA = sc.nextInt();
		int[] a = new int[numA];
		for (int i = 0; i < numA; i++) {
			
			System.out.print("a[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("�迭 b�� ��ڼ��� ");
		int numB = sc.nextInt(); 
		int[] b = new int[numB];
		for (int i = 0; i < numB; i++) {
			
			System.out.print("b[" + i + "]: ");
			b[i] = sc.nextInt();
		}

		
		// �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy
	System.out.println("�迭b�� ��Ҹ� �迭a�� �������� ������");
		rcopy(a, b);
		
		
		for (int i = 0; i < numA; i++)
			
			System.out.println("a[" + i + "]= " + a[i]);
	}

}
