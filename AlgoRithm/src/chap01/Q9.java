package chap01;

import java.util.Scanner;

public class Q9 {

	
	//���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �Ʒ� �޼��带 �ۼ��ϼ���
	// static int sumof(int a, int b)
	static int sumof(int a, int b) {
		int min; // a, b�� ���� ���� ��
		int max; // a, b�� ū ���� ��

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // ��
		for (int i = min; i <= max; i++)
			sum += i;
		
		/*���콺��
		if(a>b) {
			int temporary=a;
			a=b;
			b=temporary;			
		}
		a=a-1;
		
		1~3������ ���� ���ϴ� ���콺��
		123
		321
	=>  444 = 12/2
		*/
		//���� ���콺��, ū ���콺��
	
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = stdIn.nextInt();
		System.out.print("b�� ����");
		int b = stdIn.nextInt();

		System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�.");
	}

}
