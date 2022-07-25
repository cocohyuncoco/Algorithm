package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class PhysicalExamination {
	
	// Ŭ������ �迭
	//Ŭ������ �̸�, Ű, �÷��� �Ѱ��� ������
	
	// <��ü�˻� �����͸� ���ε����� �迭�� ������ �ƴ� Ŭ������ �迭�� ������ ���α׷�>
	//�� ���α׷��� ��ü�˻� �������� �϶�ǥ�� ��Ÿ���� ��� Ű�� �÷��� ������ ������
	
	static final int VMAX = 21; //�÷� ����(0.0���� 0.1������ 21��)
	 
	
	static class PhyscData{
		String name; //�̸�
		int height;	 //Ű
		double vision; //�÷�
		
		//������_�Է¹��� �� 3��
		PhyscData(String name, int height, double vision){ 
			this.name = name;
			this.height = height;
			this.vision = vision;
		}		
	}
	
	//Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) {
				
		double sum = 0;
		
		for (int i=0; i<dat.length; i++) //�迭 ���� ��ŭ �ݺ�
			sum += dat[i].height; //�Է¹��� PhyscData�� height�� ����
		
		return sum/dat.length; //������ height�� ������ �ο� ��
	}
					
		
	//�÷� ������ ����
	static void distVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;
		
		dist[i] = 0;
		
		for (i=0; i<dat.length; i++) //�迭 ���̸�ŭ �ݺ�
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) //�÷��� 0.0�̻�, 21/10.0=2.1  2.1���� ���� ��쿡													
				dist[(int)(dat[i].vision * 10)]++; //�ű⿡ �ش��ϴ� ����� ���� ������ 1�� ������Ų��....��)�÷� 0.4 1�� ���� 
    }	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("������", 162, 0.3),
			new PhyscData("������", 173, 0.7),
			new PhyscData("������", 175, 2.0),
			new PhyscData("ȫ����", 171, 1.5),
			new PhyscData("�̼���", 168, 0.4),
			new PhyscData("�迵��", 174, 1.2),
			new PhyscData("�ڿ��", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX]; //�÷º���
		
		System.out.println("��ü�˻� ����Ʈ");
		System.out.println("�̸�     Ű  �÷�");
		System.out.println("-------------------");
		
		for (int i=0; i<x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n", 
					 x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n��� Ű : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); //�÷� ������ ����
		
		System.out.println("\n�÷� ����");
		
		for (int i=0; i<VMAX; i++) 
			System.out.printf("%3.1f~:%2d��\n", i/10.0, vdist[i]);
		
		}
	}

