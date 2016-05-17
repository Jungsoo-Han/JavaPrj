package oop.inhe.ya;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private Exam exam;
	private PrintListener printListener;
	private TitlePrintListener titlePrintListener;
	
	
	
	public void setTitlePrintListener(TitlePrintListener titlePrintListener) {
		this.titlePrintListener = titlePrintListener;
	}


	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}


	public ExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	
	
	public Exam getExam() {
		return exam;
	}



	public void setExam(Exam exam) {
		this.exam = exam;
	}



	public void input() {
		
		int kor;
		int eng;
		int math;

		Scanner scan = new Scanner(System.in);
		// �����Է��ۼ�
		
		if (titlePrintListener != null) {
			titlePrintListener.onTitlePrint();
		}
		else{
			System.out.println(" ��������������������������������������������");
			System.out.println("��             ��   ��   ��   ��           ��");
			System.out.println(" ��������������������������������������������");			
		}
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
			/*if (printListener != null)
				printListener.onPrint();*/
			onPrint();
			System.out.printf(" ��\t�� : %d\n", total);
			System.out.printf(" ��\t�� : %5.2f\n", avg);
			System.out.println("����������������������������������������������");
		}
	}



	protected abstract void onPrint();
	


}
