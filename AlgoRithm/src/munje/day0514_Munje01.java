package munje;

import java.util.Random;
import java.util.Scanner;

public class day0514_Munje01 {
	//사람수를 난수로 구하고 사람수에 맞게 사람키도 난수로 구하는 문제..
	
	//지금은 비어있지만 아래의 height랜덤 값을 파라미터로 받고 제일 큰 값을 리턴(출력)
	static int max(int[] a) {	
		int max = a[0];
		
		//파라미터값으로 입력받은 길이만큼 반복
		for(int i=1; i<a.length; i++) 
			if (a[i]>max) {
				max=a[i];
			}				
		return max;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Random rand = new Random();				
		
		//사람수..1~10중에 뽑고
		int saramSu= rand.nextInt(10)+1;
		System.out.println("사람 수: "+saramSu);		
		
		int[] height = new int[saramSu];
		
		//사람들 키 랜덤으로 넣기
		System.out.println("**사람들 키**");
		
		for (int i=0; i<saramSu; i++) {			
			//사람 키 = 160...이런식으로 구해야하니까 100 부터 시작  
			height[i] = 100 + rand.nextInt(90)+1;			
			System.out.println("height["+i+"] : "+height[i]+"cm");			
		}
		
		System.out.println("제일 큰 키는 "+max(height)+"cm 입니다");
	}

}
