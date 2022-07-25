package chap01;

import java.util.Scanner;



public class Max3 {
		
	//알고리즘 이란? -> 프로그램 명령어의 집합체
	//문제를 해결하기 위한것, 명확하게 정의되고 순서가있는 유한개의 규칙으로 이루어진 집합	
	
	//문제 (아래처럼 출력할것) 
	
	// 3정수의 최댓값을 구해보자
	// a의 값: 1
	// b의 값: 2
	// c의 값: 3
	// 최대값은 3입니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //정수 3개 키보드에서 입력받게 세팅
			
		
		System.out.println("<입력한 3개의 숫자 중 최대값을 구합니다>");
		
		System.out.print("a의 값 입력: ");
		int a = sc.nextInt();
		
		System.out.print("b의 값 입력: ");
		int b = sc.nextInt();
		
		System.out.print("c의 값 입력: ");		
		int c = sc.nextInt();
		
		//최대값 구하는 조건문 
		int max=a; //max에 a값을 넣는다
		if (b>max) max=b;	//b값이 max보다 크면 max에 b값을 넣는다
		if (c>max)	max=c;  //c값이 max보다 크면 max에 c값을 넣는다
		
		System.out.println("최대값은 "+max+"입니다");
		
	
		
	}

}
