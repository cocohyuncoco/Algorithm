package chap02;

import java.util.Iterator;

public class ArraySumForln {
	//�迭�� ��� ����� ���� ���Ͽ� ����ϴ� ���α׷� (Ȯ�� for��)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for (int i=0; i<a.length; i++) 
			System.out.println("a["+i+"] = "+a[i]);
		
		double sum = 0; //�հ�

		//Ȯ�� for��, for each��
		for (double i:a) {
			sum += i;
			System.out.println("��� ����� ����"+sum+"�Դϴ�."); 
		}
	}

}