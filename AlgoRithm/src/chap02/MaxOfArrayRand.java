package chap02;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	
	static int maxOf(int[] a) {
		//배열 a의 최대값을 구하여 반환합니다
		int max = a[0];
		
		for(int i=1; i<a.length; i++) 
			if (a[i]>max)max=a[i];
		return max;
	}
	//배열요소의 최대값을 나타냅니다 (값을 난수로)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다");
		System.out.print("사람 수:");
		int num = sc.nextInt();
		//배열의 요솟수 받고
		
		int[] height = new int[num];
		//요솟수가 num인 배열생성
		System.out.println("키 값은 아래와 같습니다");
		
		for (int i=0; i<num; i++) {
			
			//요소의 값을 난수로 0부터 89까지 생성
			height[i] =100 + rand.nextInt(90);
			
			System.out.println("height["+i+"] : "+height[i]);
			
		}
		System.out.println("최대값은 "+maxOf(height)+"입니다");
	}
	

}
