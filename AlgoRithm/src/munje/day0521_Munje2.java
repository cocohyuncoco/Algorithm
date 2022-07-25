package munje;

import java.util.Scanner;

public class day0521_Munje2 {
		// �� ���� �� ��
		static int[][] mdays = {
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
		};

		// ���� year���� �����ΰ�? (���⣺1����⣺0)
		static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}

		// ���� y�� m�� d���� ������ ���� �� ���� ���մϴ�.
		static int DayOfYear(int y, int m, int d) {
			
			while (m>1) {
		            m--;
		            d += mdays[isLeap(y)][m-1];
		       }
			
			 return 365+isLeap(y) - d;
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int retry; 

			System.out.println("���� ���� �� �� ��?");

			do {
				System.out.print("�⣺");
				int year = sc.nextInt(); // ��
				System.out.print("����");
				int month = sc.nextInt(); // ��
				System.out.print("�ϣ�");
				int day = sc.nextInt(); // ��

				System.out.printf("������ ���� �� ���� %d���Դϴ�.\n", DayOfYear(year, month, day));

				System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�)��");
				retry = sc.nextInt();
			} while (retry == 1);
		}

}
