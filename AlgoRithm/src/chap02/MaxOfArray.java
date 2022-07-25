package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class MaxOfArray {

	//배열의 최대값을 구하는 메서드 -> 인수로 받은 배열a의 최대값을 구하고 그 값을 반환
	static int maxOf(int[] a) { //int a[] = height; 이렇게 초기화
		
		int max =a[0]; //height[0] 이 들어간거랑 마찬가지
		
		for (int i=1; i<a.length; i++) {
			if (a[i]>max) {//height[0,1,2,3....] > height[0]
				max = a[i]; //height의 요솟값을 0~n 까지 반복하면서 제일 큰 값을 max에 넣음
			}			
		}		
		return max;
	}
	
	public static void main(String[] args) {
		//가장먼저 사람수를 변수 num에 넣고
		//요솟수가 num인 배열 height를 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값 을 구합니다");
		
		System.out.print("사람수: ");
		int num = sc.nextInt(); //height배열의 요솟수가 될 num수를 입력받고
		
		int[] height = new int[num]; //입력받은 num으로 height배열을 생성 (num 수가 height의 요솟수가됨)
		
		for (int i=0; i<num; i++) { 
			
			System.out.print("height["+i+"] : "); //배열의 요솟수만큼 키를 입력받고
			height[i] = sc.nextInt();			
		}
		
		//입력받은 height를 메서드maxOf에 전달하고 메서드가 반환한 최대값을 출력
		System.out.println("최대값은 "+maxOf(height)+"입니다"); 
		
	}
}
