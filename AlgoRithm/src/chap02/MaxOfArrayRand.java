package chap02;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	
	static int maxOf(int[] a) {
		//�迭 a�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�
		int max = a[0];
		
		for(int i=1; i<a.length; i++) 
			if (a[i]>max)max=a[i];
		return max;
	}
	//�迭����� �ִ밪�� ��Ÿ���ϴ� (���� ������)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�");
		System.out.print("��� ��:");
		int num = sc.nextInt();
		//�迭�� ��ڼ� �ް�
		
		int[] height = new int[num];
		//��ڼ��� num�� �迭����
		System.out.println("Ű ���� �Ʒ��� �����ϴ�");
		
		for (int i=0; i<num; i++) {
			
			//����� ���� ������ 0���� 89���� ����
			height[i] =100 + rand.nextInt(90);
			
			System.out.println("height["+i+"] : "+height[i]);
			
		}
		System.out.println("�ִ밪�� "+maxOf(height)+"�Դϴ�");
	}
	

}
