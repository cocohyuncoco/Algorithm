package chap02;

import java.util.Iterator;

public class IntArray {

	public static void main(String[] args) {
		
		//������Ұ� 5���� �迭�� �������� 
		//0 -> 0
		//1 -> 37
		//2 -> 51
		//3 -> 0
		//4 -> 74
		//�� ���
		int[] a = new int[5]; //������Ұ� 5���� �迭�� ����

		//a[0] = 0; a[1] = 37; a[2] = 51; a[3] = 0; a[4] = 74;
		
		a[1]=37;
		a[2]=51;
		a[4]= a[1]*2; //a[4]�� a[1]*2 �� �� 74����
		
		for (int i=0; i<a.length; i++) { //�ε��� ������� �� ���
			
			System.out.println("a["+i+"] ->"+a[i]);
			
		}
		
	}
}
