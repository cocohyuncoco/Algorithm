package chap01;

import java.util.Scanner;



public class Max3 {
		
	//�˰��� �̶�? -> ���α׷� ��ɾ��� ����ü
	//������ �ذ��ϱ� ���Ѱ�, ��Ȯ�ϰ� ���ǵǰ� �������ִ� ���Ѱ��� ��Ģ���� �̷���� ����	
	
	//���� (�Ʒ�ó�� ����Ұ�) 
	
	// 3������ �ִ��� ���غ���
	// a�� ��: 1
	// b�� ��: 2
	// c�� ��: 3
	// �ִ밪�� 3�Դϴ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //���� 3�� Ű���忡�� �Է¹ް� ����
			
		
		System.out.println("<�Է��� 3���� ���� �� �ִ밪�� ���մϴ�>");
		
		System.out.print("a�� �� �Է�: ");
		int a = sc.nextInt();
		
		System.out.print("b�� �� �Է�: ");
		int b = sc.nextInt();
		
		System.out.print("c�� �� �Է�: ");		
		int c = sc.nextInt();
		
		//�ִ밪 ���ϴ� ���ǹ� 
		int max=a; //max�� a���� �ִ´�
		if (b>max) max=b;	//b���� max���� ũ�� max�� b���� �ִ´�
		if (c>max)	max=c;  //c���� max���� ũ�� max�� c���� �ִ´�
		
		System.out.println("�ִ밪�� "+max+"�Դϴ�");
		
	
		
	}

}
