package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEqual {

	//�ϳ��� �迭�� �ƴ϶� ���� �迭�� ó���ϴ� �˰����̴�.
	//�� �迭�� ����Ұ��� ������? �� �Ǵ��ϴ� �޼��带 �����ϴ� ���α׷��̴�
	
	static boolean equals(int[] a, int[] b) {
		
		//1. �� �迭 a,b�� ����(��ڼ�)�� ��. ��ڼ��� �ٸ��� false
		if (a.length != b.length)
			return false;
		
		//2. �� �迭�� ��ĵ�ϸ鼭 a,b�� ��� ���� ���ϴ°� �ݺ�. �ٸ� ��Ұ��� �߰��ϸ� false
		for (int i=0; i<a.length; i++) 
			if (a[i] != b[i]) 
				return false;
			
		//3. ������� ���� if, for���� �ߴܵ��� �ʰ� ������ ����� ����. �� �迭�� ���ٰ� �Ǵ��Ҽ� �������� true
		return true;			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭a�� ��ڼ�: ");
		int num = sc.nextInt();
		
		int[]a = new int[num]; //��ڼ��� num�� �迭
		
		for (int i=0; i<num; i++) {
			System.out.print("a[ "+ i +" ] : ");
			a[i] = sc.nextInt();			
		}
		
		System.out.print("�迭b�� �����: ");
		int num2 = sc.nextInt();
		
		int[]b = new int[num2]; //��ڼ��� num2�� �迭
		
		for (int i=0; i<num2; i++) {
			System.out.print("b[ "+ i +" ] : ");
			b[i] = sc.nextInt();			
		}
		
		
		System.out.println("�迭 a�� b��"+(equals(a, b)?"�����ϴ�":"���� �ʽ��ϴ�"));		
		//�޼��� equals�� �� �迭 a, b�� ��� ��Ұ� �������� �Ǵ��մϴ�.
		//�� �޼����� ��ȯ���� boolean�Դϴ�. ��� ����� ���� ������ true, �׷��� ������ false�� ��ȯ�մϴ�
		
		
		
	}
}
