package chap01;

import java.util.Scanner;

public class Q6 {
	
	//1���� n������ �������� ���ϴ� �˰����� ���� ���ڽ��ϴ�
	//���ϴ� ���� n�� 2�� 1+2, n�� 3�̸� 1+2+3 �Դϴ�, n�� 4�̸� 1+2+3+4
	//1���� n������ ���� ����ϴ� �˰��� 
	
	//Q. while���� ����ɶ� ���� i���� n+1 �� ���� Ȯ���ϼ��� (���� i���� ����ϵ��� ���α׷��� �����ϼ���)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�");
		System.out.print("n�� ��: ");
		int n = sc.nextInt();
		
		int sum = 0; //��
		int i = 1;
				
		while (i <= n) { //i�� n���� ������ �ݺ�
			sum += i;
			i++;
			//System.out.println("i+"+i);	
		}
		
		//if(i>n) System.out.println("Now Number n : " + i);	
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�");
		System.out.println("i�� ���� " + i + "��(��) �Ǿ����ϴ�."); //����
	}
	 
}

