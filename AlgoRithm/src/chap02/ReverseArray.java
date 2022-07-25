package chap02;

import java.util.Iterator;
import java.util.Scanner;

//�迭 ��Ҹ� �Է¹��� ���� �������� �����ϴ� �˰���
public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		
		//�迭��� idx1, 2�� ���� ��ȯ��
		//��ȯ�� ���� ���� �ڷ����� ���� ���� t�� �̿��Ѵ�.
		//idx1�� ���� t�� ����, idx2�� ���� idx1�� ����, t�� ������ ó�� ���� idx2�� ����		
		
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
		}	
	
	
	//�迭 a�� ��Ҹ� �������� ����
	//��ȯȽ���� '��Ұ���/2' �̸�, �� ���������� �������� ������
	//��Ұ����� Ȧ���� ��� ��� ��Ҵ� ��ȯ�� �ʿ䰡 ���� �����̴� (��ȯ ���ص� ������ ����)
	
	//'����/����' ������ �������� ������ �����θ� �������������� �������� �����⿡ ����
	//(��� ������ 7�� ��� ��ȯȽ���� 7/2 �� 3�̴�)	
	
	static void reverse(int[] a) {
		for (int i=0; i<a.length/2; i++)
			
			swap(a, i, a.length-i-1);
		
			//��Ұ����� n�� �迩 ��Ҹ� �������� �����ϴ� �˰����� �����ϰ� ��Ÿ����
			//a[i]�� a[n-i-1]�� ������ȯ
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		
		//��ڼ� 5�� �Է�������
		//int[]x = new int[5]; �迭�� ���̰� 5�ι迭
		int num = sc.nextInt();		
		int[] array = new int[num];
				
		
		//���̸� ������ �������� �迭�� ���̸�ŭ ���� �Է¹޴� for�� ����
		for (int i=0; i<num; i++) {
			System.out.print("array[ "+i+" ] : ");
			array[i] = sc.nextInt();
		}
		
		//�Է¹��� 
		//�������� �����ϴ� reverse, swap�޼��� ����ؼ� �迭�� ��������
		reverse(array); 
		
		
		System.out.println("--�������� ����--");		
		//�������� ������ �� ����ϴ� for��
		for (int i=0; i<num; i++) {
			System.out.println("array[ "+i+" ] ="+array[i]);
			
		}
	}
}	
