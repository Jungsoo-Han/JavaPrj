package capsule;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	static void setKor(Exam exam, int kor){
		//exam = new Exam();
		exam.kor = kor;
	}
	// exam���� kor ���� ������ �ϴ� �Լ�(��ü�� ������ ������ ���� �� �� ����)
	static int getKor(Exam exam){
		return exam.kor;
	}
	
	static void setEng(Exam exam, int eng){
		exam.eng = eng;
	}
	static int getEng(Exam exam){
		return exam.eng;
	}
	
	static void setMath(Exam exam, int math){
		exam.math = math;	
	}
	static int getMath(Exam exam){
		return exam.math;
	}
	
	static void setTotal(Exam exam, int total){
		exam.total = total;
	}
	static int getTotal(Exam exam){
		return exam.total;
	}
	
	static void setAvg(Exam exam, double avg){
		exam.avg = avg;
	}
	static double getAvg(Exam exam){
		return exam.avg;
	}

	// ���� ��� �Լ�
	static void printGrade(Exam exam) {
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = 0;
		double avg = 0;

		total = kor + eng + math;
		avg = total;
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

	// ���� �Է� �Լ�
	static void inputGrade(Exam exam) {
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

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}
