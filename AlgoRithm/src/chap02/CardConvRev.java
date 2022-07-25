package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class CardConvRev {

	//�������� ������ ����� ��ȯ�ϴ� �˰���
	//��� ��ȯ ���α׷�
	//�Է¹��� 10������ 2���� ~ 36������ ��� ��ȯ�ؼ� ��Ÿ����
	static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ";
		
		do {
			//1. char �迭 d�� ���� 0,1,2,3....��� �����ǰ� ���� digits�� ����
			//2. String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� charAt()���� ���� x,r (x % r)�� ���������� ���� 
			
			d[digits++] = dchar.charAt(x % r); //r�� ���� �������� ����
			x /= r;
		} while (x != 0);
		//3. x�� 0 �� �ƴϸ� �ٽ� 0���� �����ϰ� ���ư�
		return digits;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int no; //��ȯ�ϴ� ����
		int cd; //���
		int dno; //��ȯ ���� �ڸ���
		int retry; //�ٽ� �ѹ�?
		char[] cno = new char[32]; //��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�");
		
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����:");
				no = sc.nextInt();
			} while (no < 0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno); //no�� cd������ ��ȯ
			
			System.out.println(cd+"�����δ� ");
			
			for (int i=dno-1; i>=0; i--) 
				System.out.println(cno[i]);
			
			System.out.println("�Դϴ�");
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�) : ");
			retry = sc.nextInt();
			
		} while (retry==1);
	}
}
