package munje;

import java.util.Scanner;

public class day0521_backjoon {
	//M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static boolean[] prime;
	// �����佺�׳׽��� ü �˰���
		public static void get_prime() {
			// true = �Ҽ��ƴ� , false = �Ҽ� 
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
			// false = �Ҽ� 
			if(!prime[i]) System.out.println(i);
		}
		
	}

}
