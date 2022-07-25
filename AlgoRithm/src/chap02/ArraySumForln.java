package chap02;

import java.util.Iterator;

public class ArraySumForln {
	//배열의 모든 요소의 합을 구하여 출력하는 프로그램 (확장 for문)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for (int i=0; i<a.length; i++) 
			System.out.println("a["+i+"] = "+a[i]);
		
		double sum = 0; //합계

		//확장 for문, for each문
		for (double i:a) {
			sum += i;
			System.out.println("모든 요소의 합은"+sum+"입니다."); 
		}
	}

}