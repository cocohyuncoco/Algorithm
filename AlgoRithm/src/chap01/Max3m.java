package chap01;

public class Max3m {
	//3���� ������ �� �ִ밪�� ���Ͽ� ����Ұ� �Դϴ�
	
	//���ڰ����� a,b,c�� ���� �ް� 3���� �ִ��� ���Ͽ� ��ȯ�Ұ� �Դϴ�	
	static int max3(int a, int b, int c) {
	
		int max=a;
		
		if (b > max) {
			max =b;
		}
		if (c > max) {
			max =c;
		}
		
		return max; //���� �ִ밪�� ȣ���� ������ ��ȯ�Ұ� �Դϴ�
	}

	//���ڰ����� a,b,c�� ���� �ް� 3���� �ּҰ��� ���Ͽ� ��ȯ�Ұ� �Դϴ�
	static int min3(int a, int b, int c) {
		
		int min=a;
		
		if (b < min) {
			min =b;
		}
		if (c < min) {
			min =c;
		}
		
		return min; //���� �ִ밪�� ȣ���� ������ ��ȯ�Ұ� �Դϴ�
	}

	//���ڰ����� a,b,c,d�� ���� �ް� 4���� �ִ��� ���Ͽ� ��ȯ�Ұ� �Դϴ�
	static int max4(int a, int b, int c, int d) {
	
	int min=a;
	
	if (b < min) {
		min =b;
	}
	if (c < min) {
		min =c;
	}
	
	return min; //���� �ִ밪�� ȣ���� ������ ��ȯ�Ұ� �Դϴ�
	}
	
	//���ڰ����� a,b,c,d�� ���� �ް� 4���� �ּҰ��� ���Ͽ� ��ȯ�Ұ� �Դϴ�
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
		
		return min; //���� �ִ밪�� ȣ���� ������ ��ȯ�Ұ� �Դϴ�
	}



	public static void main(String[] args) {
		
		
		//������ �ݺ��ؼ� ���ϰ���� ��쿡�� �޼���� ó���ϸ� ���մϴ�
		System.out.println("***���� 3���� �ִ밪***");
		System.out.println("max3(3,2,1)="+max3(3, 2, 1));	
		System.out.println("max3(58,21,85)="+max3(58,21,85));
		
		System.out.println("-----------------------------------");
		System.out.println("***������ 3���� �ּҰ�***");
		System.out.println("min3(3,2,1)="+min3(3, 2, 1));
		System.out.println("min3(84,27,41)="+min3(84,27,41));
		
		System.out.println("-----------------------------------");
		System.out.println("***���� 4���� �ִ밪***");
		System.out.println("max4(4,3,2,1)="+max4(4,3,2,1));	
		System.out.println("max4(14,58,21,85)="+max4(14,58,21,85));
		
		System.out.println("-----------------------------------");
		System.out.println("***������ 4���� �ּҰ�***");
		System.out.println("min4(4,3,2,1)="+min4(4,3,2,1));
		System.out.println("min4(117, 4874, 21, 47)="+min4(117, 4874, 21, 47));
	}
}
