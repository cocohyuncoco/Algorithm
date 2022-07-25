package munje;

import java.util.Scanner;

public class day0521_Munje01 {
	//�޼��� dayOfYear�� ���� i�� days���� ����. while�� ���

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //����
	};
	
	//���� year���� �����ΰ�? (����:1/���:0)
	//�� �޼���� �Ű������� ���޹��� ������ �����̸� 1�� ��ȯ, ����̸� 0�� ��ȯ�ϴ� �޼���
	static int isLeap(int year) {
		//�⵵�� 4�� ���� ������ ���� 0 �̰ų� �⵵�� 100���� ���� ������ ���� 0�� �ƴϸ� ����, �⵵�� 400���� ���� ���������� 0�̸� ����(1) �ƴϸ� ���(0) 
		return (year%4==0 && year%100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	//���� y�� m�� d���� �� �� ��� �� ���� ���ϴ� �޼���
	static int dayOfYear(int y, int m, int d) {
				
		while (--m != 0){
			d += mdays[isLeap(y)][m-1];
			}
		
		return d;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry; //�ٽ��ѹ�?
		
		System.out.println("�� ���� ��� �ϼ��� ���մϴ�");
		
		do {
			System.out.print("��: "); 
			int year = sc.nextInt(); //��
			
			System.out.print("��: "); 
			int month = sc.nextInt(); //��
			
			System.out.print("��: "); 
			int day = sc.nextInt(); //��
			
			System.out.printf("�� �� %d��° �Դϴ�.\n", dayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�): ");
			retry = sc.nextInt();
			
		} while (retry==1);
	}

}
