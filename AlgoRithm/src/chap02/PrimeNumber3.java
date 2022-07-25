package chap02;

import java.util.Iterator;

public class PrimeNumber3 {
	
	//1,000 이하의 소수를 열거 (버전3)
	//직사각형 한 변의 길이까지만 소수로 나눗셈을 시도하고
	//그 과정에서 한번도 나눠지지 않으면 소수로 판단
	//100이 5로 나누어 떨어지지 않으면 20으로도 나누어 떨어지지 않음
	
	//넓이가 100이란건 직사각형 어느 한 변으로도 나눌수 있단 의미
	//이런 성질을 이용해서 제곱근을 한 변으로 한느 이후 직사각형에 대한 계산량을 줄이는게
	//이 알고리즘 개선(3)의 핵심
	
	//즉 어떤 정수n은 n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않으면 소수다
	
	//이 조건을 바탕으로 개선한 프로그램이 이 알고리즘.
	//prime[i]의 제곱이 n이하인가?
	//이때 n의 제곱근을 구하는것보다 제곱을 구하는게 훨씬 간단+빠름
	//제곱근을 구할때는 곱하기 연산 사용
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0; //곱셈과 나눗셈의 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수
		prime[ptr++] = 3; //3은 소수
		
		for (int n=5; n<=1000; n +=2) { //대상은 홀수만
			
			boolean flag = false;
			
			for (int i=1; prime[i]*prime[i] <= n; i++) {
				
				//for문을 반복할때마다 2씩 증가하는건 다음 두 연산의 수행 횟수를 계산하기 위해
				counter += 2; 
				if (n % prime[i]==0) {//나누어떨어지면 소수가 아님
					flag = true;
					break; //더이상 반복은 불필요
				}				
			}			
			if (!flag) { //마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n; //소수라고 배열에 저장
				counter++;
			}			
		}		
		for (int i=0; i<ptr; i++) { //찾은 ptr개의 소수를 출력
			System.out.println("소수"+(i+1)+": "+prime[i]);
			
			
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수: "+counter);
		System.out.println("찾은 소수의 갯수: "+ptr);
	}

}
