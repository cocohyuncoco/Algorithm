package chap01;

public class Max3m {
	//3개의 정수값 중 최대값을 구하여 출력할것 입니다
	
	//인자값으로 a,b,c의 값을 받고 3중의 최댓값을 구하여 반환할것 입니다	
	static int max3(int a, int b, int c) {
	
		int max=a;
		
		if (b > max) {
			max =b;
		}
		if (c > max) {
			max =c;
		}
		
		return max; //구한 최대값을 호출한 곳으로 반환할것 입니다
	}

	//인자값으로 a,b,c의 값을 받고 3중의 최소값을 구하여 반환할것 입니다
	static int min3(int a, int b, int c) {
		
		int min=a;
		
		if (b < min) {
			min =b;
		}
		if (c < min) {
			min =c;
		}
		
		return min; //구한 최대값을 호출한 곳으로 반환할것 입니다
	}

	//인자값으로 a,b,c,d의 값을 받고 4중의 최댓값을 구하여 반환할것 입니다
	static int max4(int a, int b, int c, int d) {
	
	int min=a;
	
	if (b < min) {
		min =b;
	}
	if (c < min) {
		min =c;
	}
	
	return min; //구한 최대값을 호출한 곳으로 반환할것 입니다
	}
	
	//인자값으로 a,b,c,d의 값을 받고 4중의 최소값을 구하여 반환할것 입니다
	static int min4(int a, int b, int c, int d) {
		
		int min=a;
		
		if (b < min) {
			min =b;
		}
		if (c < min) {
			min =c;
		}
		if(d < min) {
			min =d;
		}
		
		return min; //구한 최대값을 호출한 곳으로 반환할것 입니다
	}



	public static void main(String[] args) {
		
		
		//여러번 반복해서 구하고싶은 경우에는 메서드로 처리하면 편리합니다
		System.out.println("***정수 3개의 최대값***");
		System.out.println("max3(3,2,1)="+max3(3, 2, 1));	
		System.out.println("max3(58,21,85)="+max3(58,21,85));
		
		System.out.println("-----------------------------------");
		System.out.println("***정수의 3개의 최소값***");
		System.out.println("min3(3,2,1)="+min3(3, 2, 1));
		System.out.println("min3(84,27,41)="+min3(84,27,41));
		
		System.out.println("-----------------------------------");
		System.out.println("***정수 4개의 최대값***");
		System.out.println("max4(4,3,2,1)="+max4(4,3,2,1));	
		System.out.println("max4(14,58,21,85)="+max4(14,58,21,85));
		
		System.out.println("-----------------------------------");
		System.out.println("***정수의 4개의 최소값***");
		System.out.println("min4(4,3,2,1)="+min4(4,3,2,1));
		System.out.println("min4(117, 4874, 21, 47)="+min4(117, 4874, 21, 47));
	}
}
