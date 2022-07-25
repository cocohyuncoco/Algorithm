package chap01;

import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("<1부터 n까지의 합을 가우스 방식으로>");
		System.out.println("---------------------------");
		System.out.print("숫자 입력：");
		
		int n = sc.nextInt();

		//int tot = (n+1)*(n/2)+(n%2==1?(n+1)/2:0);  
		int tot = ((n+1)*n)/2;
		System.out.println("1~10까지의 합: "+tot);
	}
}
