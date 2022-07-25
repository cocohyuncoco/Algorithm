package chap01;

public class test02 {

	static int max4(int a, int b, int c, int d) {
		//4개중 최대값
		int max = a;
		
		if (b >= max)
			max = b;
		if(c >= max)
			max = c;
		if(d >= max)
			max = d;
		return max;
	}
	
	static int min3(int a, int b, int c) {
		//3개중 최소값
		int min = a;
		
		if (b <= min)
			min = b;
		if(c <= min)
			min = c;
		return min;
	}
	
	
	static int min4(int a, int b, int c, int d) {
		//4개중 최소값
		int min = a;
		
		if (b <= min)
			min = b;
		if(c <= min)
			min = c;
		if(d <= min)
			min = d;
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("4개중에 최대값은->"+max4(84, 24, 411, 3));
		System.out.println("");
		System.out.println("3개중에 최소값은->"+min3(874, 54, 1));
		System.out.println("");
		System.out.println("4개중에 최소값은->"+min4(84, 24, 411, 3));
	}

}
