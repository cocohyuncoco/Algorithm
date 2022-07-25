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
		
		//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
		//둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 숫자 입력:");		
		int num = sc.nextInt(); 
		int[] n = new int[num];
		
		for (int i=0; i<num; i++) {
			n[i] = sc.nextInt();
			
		}
		
		System.out.println("배열의 최대값: "+maxArr(n));
		System.out.println("배열의 최소값: "+minArr(n));	
	}	

}
