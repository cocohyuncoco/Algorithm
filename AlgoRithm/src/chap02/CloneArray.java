package chap02;

import java.util.Iterator;

public class CloneArray {

	//배열의 복제 (클론)
	// 배열이름.cloen() 
	// 이 수식은 <배열을 복제>하고 <복제한 배열에 대한 참조를 생성>합니다
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //b는 a의 복제를 참조
		
		b[3] = 0; //한요소에만 3을 대입
		//이렇게 한것은 배열 변수 b의 참조가 배열 a의 본체 그 자체가 아니라, 그 복제임을 확인 하기 위함입니다
		
		//배열a 출력
		System.out.print("a=");		
		for (int i=0; i<a.length;i++) {
			System.out.print(" "+a[i]);			
		}
		
		System.out.println("");
		
		//a배열복제한 b 출력
		//배열변수 b는 a가 참조하는 배열 본체의 복제를 참조합니다
		System.out.print("b=");
		for (int i=0; i<b.length;i++) {
			System.out.print(" "+b[i]);			
		}

		
		
	}

}
