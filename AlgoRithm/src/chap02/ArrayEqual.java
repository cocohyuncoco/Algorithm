package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEqual {

	//하나의 배열이 아니라 여러 배열을 처리하는 알고리즘이다.
	//두 배열의 모든요소값이 같은가? 를 판단하는 메서드를 구현하는 프로그램이다
	
	static boolean equals(int[] a, int[] b) {
		
		//1. 두 배열 a,b의 길이(요솟수)를 비교. 요솟수가 다르면 false
		if (a.length != b.length)
			return false;
		
		//2. 두 배열을 스캔하면서 a,b의 요소 값을 비교하는걸 반복. 다른 요소값을 발견하면 false
		for (int i=0; i<a.length; i++) 
			if (a[i] != b[i]) 
				return false;
			
		//3. 여기까지 오면 if, for문이 중단되지 않고 끝까지 실행된 경우다. 두 배열은 같다고 판단할수 있음으로 true
		return true;			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열a의 요솟수: ");
		int num = sc.nextInt();
		
		int[]a = new int[num]; //요솟수가 num인 배열
		
		for (int i=0; i<num; i++) {
			System.out.print("a[ "+ i +" ] : ");
			a[i] = sc.nextInt();			
		}
		
		System.out.print("배열b의 요숫수: ");
		int num2 = sc.nextInt();
		
		int[]b = new int[num2]; //요솟수가 num2인 배열
		
		for (int i=0; i<num2; i++) {
			System.out.print("b[ "+ i +" ] : ");
			b[i] = sc.nextInt();			
		}
		
		
		System.out.println("배열 a와 b는"+(equals(a, b)?"같습니다":"같지 않습니다"));		
		//메서드 equals는 두 배열 a, b의 모든 요소가 같은지를 판단합니다.
		//이 메서드의 반환형은 boolean입니다. 모든 요소의 값이 같으면 true, 그렇지 않으면 false를 반환합니다
		
		
		
	}
}
