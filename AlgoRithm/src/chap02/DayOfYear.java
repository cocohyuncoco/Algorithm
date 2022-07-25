package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class DayOfYear {
	//한 해의 경과 일 수를 계산하는 프로그램
	
	//2차원 배열을 활용하여 <어떤 날짜의 그 해의 경과 일 수> 구하기
	
	//4월 15일을 예를들어 구하면
	//1월의 수 + 2월의 수 + 3월의 수 + 15 
	//이렇게 계산
	
	//일반적으로 나타내면 m월 d일의 그 해 경과 일 수는 다음과 같다
	//1월, 2월,....,m - 1월의 일 수의 합 + d
	
	//그런데 2월의 일 수는 평년 28일, 윤년 29일로 해에 따라 달라짐
	//그래서 2행 12열의 2차원 배열에 각 달의 일 수를 저장할 수 있습니다.
	//평년의 각 달의 일수 ...mdays[0][0],mdays[0][1],....,mdays[0][11]
	//윤년의 각 달의 일수 ...mdays[1][0],mdays[1][1],....,mdays[11[11]
	
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
		int days = d; //days에 d의 값을 그대로 대입한다
		
		//i를 1부터 m-1까지 증가하면서 days에 y년 i월의 일 수를 더한다 (즉, 1월부터 m-1월까지 일 수를 더함)
		for (int i=1; i<m; i++)//1월~(m-1)월의 일 수를 더함
			//y년의 i월의 일 수는 mdays[isLeap(y)][i-1]로 구한다 
			days += mdays[isLeap(y)][i-1];//윤년이면 1, 평년이면 0			
			
		return days;
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
