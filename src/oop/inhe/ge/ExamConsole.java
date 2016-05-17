package oop.inhe.ge;

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
		// 성적입력작성
		
		if (titlePrintListener != null) {
			titlePrintListener.onTitlePrint();
		}
		else{
			System.out.println(" ──────────────────────");
			System.out.println("│             성   적   입   력           │");
			System.out.println(" ──────────────────────");			
		}
		// 성적 유효성 검사
		do{
			System.out.print(" 국어 점수를 입력하세요 : ");
			kor = scan.nextInt();
			if (!(0 <= kor && kor <= 100))
				System.out.println("입력범위를 초과하였습니다. 0~100 사이의 값을 입력해주세요");
		} while (!(0 <= kor && kor <= 100));

		do{
			System.out.print(" 영어 점수를 입력하세요 : ");
			eng = scan.nextInt();
			if (!(0 <= eng && eng <= 100))
				System.out.println("입력범위를 초과하였습니다. 0~100 사이의 값을 입력해주세요");
		} while (!(0 <= eng && eng <= 100));

		do{
			System.out.print(" 수학 점수를 입력하세요 : ");
			math = scan.nextInt();
			if (!(0 <= math && math <= 100))
				System.out.println("입력범위를 초과하였습니다. 0~100 사이의 값을 입력해주세요");
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

		System.out.println(" ──────────────────────");
		System.out.println("│             성   적   출   력           │");
		System.out.println(" ──────────────────────");

		for(int i = 0; i<3; i++)
		{
			System.out.printf(" 번\t호 : %d\n", i+1);
			System.out.printf(" 국\t어 : %d\n", kor);
			System.out.printf(" 영\t어 : %d\n", eng);
			System.out.printf(" 수\t학 : %d\n", math);
			/*if (printListener != null)
				printListener.onPrint();*/
			onPrint();
			System.out.printf(" 총\t점 : %d\n", total);
			System.out.printf(" 평\t균 : %5.2f\n", avg);
			System.out.println("───────────────────────");
		}
	}



	protected abstract void onPrint();
	


}
