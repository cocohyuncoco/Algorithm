package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class DayOfYear {
	//�� ���� ��� �� ���� ����ϴ� ���α׷�
	
	//2���� �迭�� Ȱ���Ͽ� <� ��¥�� �� ���� ��� �� ��> ���ϱ�
	
	//4�� 15���� ������� ���ϸ�
	//1���� �� + 2���� �� + 3���� �� + 15 
	//�̷��� ���
	
	//�Ϲ������� ��Ÿ���� m�� d���� �� �� ��� �� ���� ������ ����
	//1��, 2��,....,m - 1���� �� ���� �� + d
	
	//�׷��� 2���� �� ���� ��� 28��, ���� 29�Ϸ� �ؿ� ���� �޶���
	//�׷��� 2�� 12���� 2���� �迭�� �� ���� �� ���� ������ �� �ֽ��ϴ�.
	//����� �� ���� �ϼ� ...mdays[0][0],mdays[0][1],....,mdays[0][11]
	//������ �� ���� �ϼ� ...mdays[1][0],mdays[1][1],....,mdays[11[11]
	
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
		int days = d; //days�� d�� ���� �״�� �����Ѵ�
		
		//i�� 1���� m-1���� �����ϸ鼭 days�� y�� i���� �� ���� ���Ѵ� (��, 1������ m-1������ �� ���� ����)
		for (int i=1; i<m; i++)//1��~(m-1)���� �� ���� ����
			//y���� i���� �� ���� mdays[isLeap(y)][i-1]�� ���Ѵ� 
			days += mdays[isLeap(y)][i-1];//�����̸� 1, ����̸� 0			
			
		return days;
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
