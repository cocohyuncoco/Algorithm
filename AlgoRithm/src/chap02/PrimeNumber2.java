package chap02;

import java.util.Iterator;

public class PrimeNumber2 {
	//PrimeNumber 알고리즘 개선하는 알고리즘
	//n이 소수인지 아닌지 판단하는 알고리즘
	//1,000 이하의 소수를 열거 (버전2)
		

	public static void main(String[] args) {
		
		int counter = 0; //나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 갯수..찾으면 1씩올라감
		
		//소수를 구하는 과정에서 그때까지 구한 소수를 배열 prime의 요소로 저장
		//이때 n이 소수인지 아닌지 판단하기 위해서 쌓아뒀던 소수에서 나눗셈을 진행
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수다
		
		for (int n=3; n<=1000; n+=2) { //대상은 홀수만
			
			int i;
			
			//3이상의 소수부터는 이중 for문으로 구한다
			//변수 i의 증가는 0이 아니라 1부터 시작한다
			//판단 대상인 n이 홀수임으로 prime[]에 저장된 2로는 나눌필요가 없기때문이다
			for (i=1; i<ptr; i++) { //이미 찾은 소수로 나누고
				counter++;
				if (n % prime[i] == 0) //0으로 나누어 떨어지면 소수가 아니니까
					break; //멈춰
			}
				//for문의 제어식이 성립하지 않으면 for문을 반복하지 않고
				//if에서 n값 3이 prime[1]에 저장			
				if (ptr==i)  //(1 == 1) //마지막까지 나누어 떨어지지 않으면 
				prime[ptr++] = n; //소수라고 배열에 저장
			}
		
		for (int i=0; i <ptr; i++)  //찾은 ptr개의 소수를 나타냄
			System.out.println("소수:"+(i+1)+": "+prime[i]);					
		
		System.out.println("나눗셈을 수행한 횟수: "+counter);
		System.out.println("소수갯수: "+ptr);
		
		//이렇게 알고리즘을 수정하면 나눗셈을 수행하는 횟수가 78,022회 에서 14,622로감소
		//두 프로그램 비교해서 얻는 결론
		//1. 같은 답을 얻는 알고리즘은 하나가 아니다
		//2. 빠른 알고리즘은 메모리를 많이 요구한다
}
	
}
