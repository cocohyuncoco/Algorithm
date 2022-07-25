package chap02;

import java.util.Iterator;

public class IntArray {

	public static void main(String[] args) {
		
		//구성요소가 5개인 배열로 실행결과가 
		//0 -> 0
		//1 -> 37
		//2 -> 51
		//3 -> 0
		//4 -> 74
		//로 출력
		int[] a = new int[5]; //구성요소가 5개인 배열을 선언

		//a[0] = 0; a[1] = 37; a[2] = 51; a[3] = 0; a[4] = 74;
		
		a[1]=37;
		a[2]=51;
		a[4]= a[1]*2; //a[4]에 a[1]*2 가 곧 74여서
		
		for (int i=0; i<a.length; i++) { //인덱스 순서대로 값 출력
			
			System.out.println("a["+i+"] ->"+a[i]);
			
		}
		
	}
}
