package chap02;

import java.util.Iterator;
import java.util.Scanner;

//배열 요소를 입력받은 값의 역순으로 정렬하는 알고리즘
public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		
		//배열요소 idx1, 2의 값을 교환함
		//교환을 위해 같은 자료형을 가진 변수 t를 이용한다.
		//idx1의 값을 t에 대입, idx2의 값을 idx1에 대입, t에 대입한 처음 값을 idx2에 대입		
		
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
		}	
	
	
	//배열 a의 요소를 역순으로 정렬
	//교환횟수는 '요소갯수/2' 이며, 이 나눗셈에서 나머지는 버린다
	//요소갯수가 홀수인 경우 가운데 요소는 교환할 필요가 없기 때문이다 (교환 안해도 순서가 맞음)
	
	//'정수/정수' 연산은 나머지를 버리고 정수부만 얻을수있음으로 나머지를 버리기에 좋다
	//(요소 갯수가 7인 경우 교환횟수는 7/2 곧 3이다)	
	
	static void reverse(int[] a) {
		for (int i=0; i<a.length/2; i++)
			
			swap(a, i, a.length-i-1);
		
			//요소갯수가 n인 배여 요소를 역순으로 정렬하는 알고리즘을 간단하게 나타내면
			//a[i]와 a[n-i-1]의 값을교환
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		
		//요솟수 5를 입력했으면
		//int[]x = new int[5]; 배열의 길이가 5인배열
		int num = sc.nextInt();		
		int[] array = new int[num];
				
		
		//길이를 위에서 정했으면 배열의 길이만큼 값을 입력받는 for문 생성
		for (int i=0; i<num; i++) {
			System.out.print("array[ "+i+" ] : ");
			array[i] = sc.nextInt();
		}
		
		//입력받은 
		//역순으로 정렬하는 reverse, swap메서드 사용해서 배열을 역순정렬
		reverse(array); 
		
		
		System.out.println("--역순으로 정렬--");		
		//역순으로 정렬한 값 출력하는 for문
		for (int i=0; i<num; i++) {
			System.out.println("array[ "+i+" ] ="+array[i]);
			
		}
	}
}	
