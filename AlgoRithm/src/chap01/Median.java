package chap01;

import java.util.Scanner;

//3������ �������� �Է��ϰ� �߾Ӱ��� ���Ѵ��� ���
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
	
	//�߾Ӱ� ���ϴ� �޼��带 �̷��� �ۼ��Ҽ��� �ִ�. �ٵ� �̰� med3���� ȿ���� ��������.
	static int meds3(int a, int b, int c) {
		
		if ((b >= a && c <= a) || (b <= a && c >= a)) 
			return a;
		else if ((a >= b && c <= b) || (a < b && c > b)) 
			return b;
		return c;		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**3 ������ �߾Ӱ� ���մϴ�**");
		
		System.out.print("a�� ��: ");
		int a = sc.nextInt();
		
		System.out.print("b�� ��: ");
		int b = sc.nextInt();
		
		System.out.print("c�� ��: ");
		int c = sc.nextInt();
		
		System.out.println("�߾Ӱ��� "+med3(a, b, c)+"�Դϴ�");

	}

}
