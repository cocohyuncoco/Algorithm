package munje;

import java.util.Scanner;

public class day0521_Munje01 {
	//메서드 dayOfYear를 변수 i와 days없이 구현. while문 사용

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
	};
	
	//서기 year년은 윤년인가? (윤년:1/평년:0)
	//이 메서드는 매개변수로 전달받은 연도가 윤년이면 1을 반환, 평년이면 0을 반환하는 메서드
	static int isLeap(int year) {
		//년도를 4로 나눈 나머지 값이 0 이거나 년도를 100으로 나눈 나머지 값이 0이 아니면 윤년, 년도를 400으로 나눈 나머지값이 0이면 윤년(1) 아니면 평년(0) 
		return (year%4==0 && year%100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구하는 메서드
	static int dayOfYear(int y, int m, int d) {
				
		while (--m != 0){
			d += mdays[isLeap(y)][m-1];
			}
		
		return d;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry; //다시한번?
		
		System.out.println("그 해의 년과 일수를 구합니다");
		
		do {
			System.out.print("년: "); 
			int year = sc.nextInt(); //년
			
			System.out.print("월: "); 
			int month = sc.nextInt(); //월
			
			System.out.print("일: "); 
			int day = sc.nextInt(); //일
			
			System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1.예/0.아니요): ");
			retry = sc.nextInt();
			
		} while (retry==1);
	}

}
