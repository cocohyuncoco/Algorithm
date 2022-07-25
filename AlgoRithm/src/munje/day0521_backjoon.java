package munje;

import java.util.Scanner;

public class day0521_backjoon {
	//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	public static boolean[] prime;
	// 에라토스테네스의 체 알고리즘
		public static void get_prime() {
			// true = 소수아님 , false = 소수 
			prime[0] = prime[1] = true;
			
			for(int i = 2; i <= Math.sqrt(prime.length); i++) {
				if(prime[i]) continue;
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1];
		get_prime();
				
		for(int i = M; i <= N; i++) {
			// false = 소수 
			if(!prime[i]) System.out.println(i);
		}
		
	}

}
