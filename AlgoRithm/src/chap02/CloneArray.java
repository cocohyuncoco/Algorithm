package chap02;

import java.util.Iterator;

public class CloneArray {

	//�迭�� ���� (Ŭ��)
	// �迭�̸�.cloen() 
	// �� ������ <�迭�� ����>�ϰ� <������ �迭�� ���� ������ ����>�մϴ�
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //b�� a�� ������ ����
		
		b[3] = 0; //�ѿ�ҿ��� 3�� ����
		//�̷��� �Ѱ��� �迭 ���� b�� ������ �迭 a�� ��ü �� ��ü�� �ƴ϶�, �� �������� Ȯ�� �ϱ� �����Դϴ�
		
		//�迭a ���
		System.out.print("a=");		
		for (int i=0; i<a.length;i++) {
			System.out.print(" "+a[i]);			
		}
		
		System.out.println("");
		
		//a�迭������ b ���
		//�迭���� b�� a�� �����ϴ� �迭 ��ü�� ������ �����մϴ�
		System.out.print("b=");
		for (int i=0; i<b.length;i++) {
			System.out.print(" "+b[i]);			
		}

		
		
	}

}
