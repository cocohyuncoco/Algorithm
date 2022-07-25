package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class MaxOfArray {

	//�迭�� �ִ밪�� ���ϴ� �޼��� -> �μ��� ���� �迭a�� �ִ밪�� ���ϰ� �� ���� ��ȯ
	static int maxOf(int[] a) { //int a[] = height; �̷��� �ʱ�ȭ
		
		int max =a[0]; //height[0] �� ���Ŷ� ��������
		
		for (int i=1; i<a.length; i++) {
			if (a[i]>max) {//height[0,1,2,3....] > height[0]
				max = a[i]; //height�� ��ڰ��� 0~n ���� �ݺ��ϸ鼭 ���� ū ���� max�� ����
			}			
		}		
		return max;
	}
	
	public static void main(String[] args) {
		//������� ������� ���� num�� �ְ�
		//��ڼ��� num�� �迭 height�� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪 �� ���մϴ�");
		
		System.out.print("�����: ");
		int num = sc.nextInt(); //height�迭�� ��ڼ��� �� num���� �Է¹ް�
		
		int[] height = new int[num]; //�Է¹��� num���� height�迭�� ���� (num ���� height�� ��ڼ�����)
		
		for (int i=0; i<num; i++) { 
			
			System.out.print("height["+i+"] : "); //�迭�� ��ڼ���ŭ Ű�� �Է¹ް�
			height[i] = sc.nextInt();			
		}
		
		//�Է¹��� height�� �޼���maxOf�� �����ϰ� �޼��尡 ��ȯ�� �ִ밪�� ���
		System.out.println("�ִ밪�� "+maxOf(height)+"�Դϴ�"); 
		
	}
}
