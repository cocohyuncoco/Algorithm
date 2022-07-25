package chap01;

import java.util.Scanner;

public class Q6 {
	
	//1부터 n까지의 정수합을 구하는 알고리즘을 살펴 보겠습니다
	//구하는 값은 n이 2면 1+2, n이 3이면 1+2+3 입니다, n이 4이면 1+2+3+4
	//1부터 n까지의 합을 출력하는 알고리즘 
	
	//Q. while문이 종료될때 변수 i값이 n+1 이 됨을 확인하세요 (변수 i값을 출력하도록 프로그램을 수정하세요)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0; //합
		int i = 1;
				
		while (i <= n) { //i가 n보다 작으면 반복
			sum += i;
			i++;
			//System.out.println("i+"+i);	
		}
		
		//if(i>n) System.out.println("Now Number n : " + i);	
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다");
		System.out.println("i의 값은 " + i + "가(이) 되었습니다."); //정답
	}
	 
}

