package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class CardConvRev {

	//정수값을 임의의 기수로 변환하는 알고리즘
	//기수 변환 프로그램
	//입력받은 10진수를 2진수 ~ 36진수로 기수 변환해서 나타내기
	static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ";
		
		do {
			//1. char 배열 d의 값에 0,1,2,3....계속 증가되게 변수 digits를 대입
			//2. String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 charAt()으로 변수 x,r (x % r)의 나머지값을 저장 
			
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		//3. x가 0 이 아니면 다시 0부터 실행하게 돌아감
		return digits;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 후의 자리수
		int retry; //다시 한번?
		char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다");
		
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수:");
				no = sc.nextInt();
			} while (no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno); //no를 cd진수로 전환
			
			System.out.println(cd+"진수로는 ");
			
			for (int i=dno-1; i>=0; i--) 
				System.out.println(cno[i]);
			
			System.out.println("입니다");
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니요) : ");
			retry = sc.nextInt();
			
		} while (retry==1);
	}
}
