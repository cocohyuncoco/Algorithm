package munje;

import java.util.Random;
import java.util.Scanner;

public class day0514_Munje01 {
	//������� ������ ���ϰ� ������� �°� ���Ű�� ������ ���ϴ� ����..
	
	//������ ��������� �Ʒ��� height���� ���� �Ķ���ͷ� �ް� ���� ū ���� ����(���)
	static int max(int[] a) {	
		int max = a[0];
		
		//�Ķ���Ͱ����� �Է¹��� ���̸�ŭ �ݺ�
		for(int i=1; i<a.length; i++) 
			if (a[i]>max) {
				max=a[i];
			}				
		return max;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Random rand = new Random();				
		
		//�����..1~10�߿� �̰�
		int saramSu= rand.nextInt(10)+1;
		System.out.println("��� ��: "+saramSu);		
		
		int[] height = new int[saramSu];
		
		//����� Ű �������� �ֱ�
		System.out.println("**����� Ű**");
		
		for (int i=0; i<saramSu; i++) {			
			//��� Ű = 160...�̷������� ���ؾ��ϴϱ� 100 ���� ����  
			height[i] = 100 + rand.nextInt(90)+1;			
			System.out.println("height["+i+"] : "+height[i]+"cm");			
		}
		
		System.out.println("���� ū Ű�� "+max(height)+"cm �Դϴ�");
	}

}
