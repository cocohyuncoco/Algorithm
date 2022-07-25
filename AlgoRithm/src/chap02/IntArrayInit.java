package chap02;

import java.util.Iterator;

public class IntArrayInit {

	//구성 자료형이 Int인 배열 (구성요솟수는 5개 , 배열초기화에 의해 생성)
	public static void main(String[] args) {
		
		//배열초기화란?
		//배열의 요소값을 초기화하면 배열 선언하는것 (선언과 초기화 동시에)
		//배열초기화를 하면 배열 본체의 생성과 동시에 각 요소의 초기화가 가능함
		
		int [] a= {1,2,3,4,5}; //<- 이게 배열초기화 (선언+초기화 동시에)
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]"+"="+i);
			
		}
	}
	
}
