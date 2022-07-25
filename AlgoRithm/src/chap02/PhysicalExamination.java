package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class PhysicalExamination {
	
	// 클래스의 배열
	//클래스는 이름, 키, 시력을 한곳에 모은것
	
	// <신체검사 데이터를 따로따로인 배열의 모임이 아닌 클래스의 배열로 구현한 프로그램>
	//이 프로그램은 신체검사 데이터의 일람표를 나타내고 평균 키와 시력의 분포를 보여줌
	
	static final int VMAX = 21; //시력 분포(0.0에서 0.1단위로 21개)
	 
	
	static class PhyscData{
		String name; //이름
		int height;	 //키
		double vision; //시력
		
		//생성자_입력받을 값 3개
		PhyscData(String name, int height, double vision){ 
			this.name = name;
			this.height = height;
			this.vision = vision;
		}		
	}
	
	//키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
				
		double sum = 0;
		
		for (int i=0; i<dat.length; i++) //배열 길이 만큼 반복
			sum += dat[i].height; //입력받은 PhyscData의 height값 누적
		
		return sum/dat.length; //누적한 height값 나누기 인원 수
	}
					
		
	//시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;
		
		dist[i] = 0;
		
		for (i=0; i<dat.length; i++) //배열 길이만큼 반복
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) //시력이 0.0이상, 21/10.0=2.1  2.1보디 작을 경우에													
				dist[(int)(dat[i].vision * 10)]++; //거기에 해당하는 사람의 새력 분포에 1을 증가시킨다....예)시력 0.4 1명 증가 
    }	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("박현규", 162, 0.3),
			new PhyscData("함진아", 173, 0.7),
			new PhyscData("최윤미", 175, 2.0),
			new PhyscData("홍연의", 171, 1.5),
			new PhyscData("이수진", 168, 0.4),
			new PhyscData("김영준", 174, 1.2),
			new PhyscData("박용규", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX]; //시력분포
		
		System.out.println("신체검사 리스트");
		System.out.println("이름     키  시력");
		System.out.println("-------------------");
		
		for (int i=0; i<x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n", 
					 x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); //시력 분포를 구함
		
		System.out.println("\n시력 분포");
		
		for (int i=0; i<VMAX; i++) 
			System.out.printf("%3.1f~:%2d명\n", i/10.0, vdist[i]);
		
		}
	}

