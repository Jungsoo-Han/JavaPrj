package oop;

import java.util.Scanner;

public class ExamConsole {
	
	private Exam exam = new Exam();
	
	public void input() {
		
		int kor;
		int eng;
		int math;

		Scanner scan = new Scanner(System.in);
		// �����Է��ۼ�
		System.out.println(" ��������������������������������������������");
		System.out.println("��             ��   ��   ��   ��           ��");
		System.out.println(" ��������������������������������������������");
		// ���� ��ȿ�� �˻�
		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			kor = scan.nextInt();
			if (!(0 <= kor && kor <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= kor && kor <= 100));

		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			eng = scan.nextInt();
			if (!(0 <= eng && eng <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= eng && eng <= 100));

		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			math = scan.nextInt();
			if (!(0 <= math && math <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= math && math <= 100));

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();

		System.out.println(" ��������������������������������������������");
		System.out.println("��             ��   ��   ��   ��           ��");
		System.out.println(" ��������������������������������������������");

		for(int i = 0; i<3; i++)
		{
			System.out.printf(" ��\tȣ : %d\n", i+1);
			System.out.printf(" ��\t�� : %d\n", kor);
			System.out.printf(" ��\t�� : %d\n", eng);
			System.out.printf(" ��\t�� : %d\n", math);
			System.out.printf(" ��\t�� : %d\n", total);
			System.out.printf(" ��\t�� : %5.2f\n", avg);
			System.out.println("����������������������������������������������");
		}
	}
	


}
