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
	// exam에서 kor 값을 꺼내줘 하는 함수(객체를 가지고 있지만 값을 볼 수 없음)
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

	// 성적 출력 함수
	static void printGrade(Exam exam) {
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = 0;
		double avg = 0;

		total = kor + eng + math;
		avg = total;
		System.out.println(" ──────────────────────");
		System.out.println("│             성   적   출   력           │");
		System.out.println(" ──────────────────────");

		for(int i = 0; i<3; i++)
		{
			System.out.printf(" 번\t호 : %d\n", i+1);
			System.out.printf(" 국\t어 : %d\n", kor);
			System.out.printf(" 영\t어 : %d\n", eng);
			System.out.printf(" 수\t학 : %d\n", math);
			System.out.printf(" 총\t점 : %d\n", total);
			System.out.printf(" 평\t균 : %5.2f\n", avg);
			System.out.println("───────────────────────");
		}
	}

	// 성적 입력 함수
	static void inputGrade(Exam exam) {
		int kor;
		int eng;
		int math;

		Scanner scan = new Scanner(System.in);
		// 성적입력작성
		System.out.println(" ──────────────────────");
		System.out.println("│             성   적   입   력           │");
		System.out.println(" ──────────────────────");
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

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}
