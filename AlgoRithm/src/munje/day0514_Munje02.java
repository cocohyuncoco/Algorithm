package munje;

import java.util.Scanner;

public class day0514_Munje02 {
	//배열b의 모든 요소를 배열a에 역순으로 복사하는 메서드 rcopy

	static void rcopy(int[] a, int[] b) {
				
		for (int i=0; i<a.length; i++)
			
			a[i] = b[b.length - i - 1];
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 a의 요솟수： ");
		int numA = sc.nextInt();
		int[] a = new int[numA];
		for (int i = 0; i < numA; i++) {
			
			System.out.print("a[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("배열 b의 요솟수： ");
		int numB = sc.nextInt(); 
		int[] b = new int[numB];
		for (int i = 0; i < numB; i++) {
			
			System.out.print("b[" + i + "]: ");
			b[i] = sc.nextInt();
		}

		
		// 배열 b의 모든 요소를 배열 a에 역순으로 copy
	System.out.println("배열b의 요소를 배열a에 역순으로 넣으면");
		rcopy(a, b);
		
		
		for (int i = 0; i < numA; i++)
			
			System.out.println("a[" + i + "]= " + a[i]);
	}

}
