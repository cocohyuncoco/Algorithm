package chap01;

import java.util.Scanner;

public class Q9 {

	
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요
	// static int sumof(int a, int b)
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // 합
		for (int i = min; i <= max; i++)
			sum += i;
		
		/*가우스식
		if(a>b) {
			int temporary=a;
			a=b;
			b=temporary;			
		}
		a=a-1;
		
		1~3까지의 합을 구하는 가우스식
		123
		321
	=>  444 = 12/2
		*/
		//작은 가우스식, 큰 가우스식
	
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();

		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
	}

}
