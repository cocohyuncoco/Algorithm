package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class Q1 {

		
	 static int maxArr(int[] max) {
		
		int nummax = max[0];
		
		for(int i=1; i<max.length; i++) {
			if(max[i]>nummax) {
				nummax = max[i];
			}
		}
		return nummax;
	}
	 
	 static int minArr(int[] min) {
			
			int nummin = min[0];
			
			for(int i=1; i<min.length; i++) {
				if(min[i]<nummin) {
					nummin = min[i];
				}
			}
			return nummin;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����.
		//��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
		//��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		//ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է�:");		
		int num = sc.nextInt(); 
		int[] n = new int[num];
		
		for (int i=0; i<num; i++) {
			n[i] = sc.nextInt();
			
		}
		
		System.out.println("�迭�� �ִ밪: "+maxArr(n));
		System.out.println("�迭�� �ּҰ�: "+minArr(n));	
	}	

}
