package chap02;

import java.util.Iterator;

public class IntArrayInit {

	//���� �ڷ����� Int�� �迭 (������ڼ��� 5�� , �迭�ʱ�ȭ�� ���� ����)
	public static void main(String[] args) {
		
		//�迭�ʱ�ȭ��?
		//�迭�� ��Ұ��� �ʱ�ȭ�ϸ� �迭 �����ϴ°� (����� �ʱ�ȭ ���ÿ�)
		//�迭�ʱ�ȭ�� �ϸ� �迭 ��ü�� ������ ���ÿ� �� ����� �ʱ�ȭ�� ������
		
		int [] a= {1,2,3,4,5}; //<- �̰� �迭�ʱ�ȭ (����+�ʱ�ȭ ���ÿ�)
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]"+"="+i);
			
		}
	}
	
}
