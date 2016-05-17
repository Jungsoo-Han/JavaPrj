import java.util.Scanner;
// 데이터 수집을 위한 객체 다루기

public class Program7 {

	public static void main(String[] args) {
		
		/*int kor;
		int eng;
		int math;*/
		
		
		/*Exam[] exams = new Exam[3];
		int current = -1;*/
		
		ExamCollection list = new ExamCollection();
		list.exams = new Exam[3];
		list.current = -1;
		int exit = 0;
		
		int x = 0;
		int y;
		
		x += 3;
		y = x + 3;
		
		
		

		while (exit == 0) {

			// 메인메뉴
			switch (inputMainMenu()) {
			case 1:
				// 성적입력
				inputGrade(list);

				break;
			case 2:
				// 성적출력
				printGrade(list);

				break;
			case 3:
				// 종료
				exit = exitProgram(exit);
				break;

			default:
				break;
			}

		}
		
	}


	// 종료 함수
	private static int exitProgram(int exit) {
		System.out.println("Good bye~");
		exit = 1;
		return exit;
		
	}

	// 성적 출력 함수
	private static void printGrade(ExamCollection list) {
		
		Exam[] exams = list.exams;
		int current = list.current;
		
		System.out.println(" ──────────────────────");
		System.out.println("│             성   적   출   력           │");
		System.out.println(" ──────────────────────");

		for(int i = 0; i < current+1; i++){
			
			Exam exam = new Exam();
			exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = 0;
			double avg = 0;
			
			//total = total(kor, eng, math);//kor + eng + math;
			total = total(exam);
			avg = total / (current+1);
			
			System.out.printf(" 번\t호 : %d\n", i+1);
			System.out.printf(" 국\t어 : %d\n", kor);
			System.out.printf(" 영\t어 : %d\n", eng);
			System.out.printf(" 수\t학 : %d\n", math);
			System.out.printf(" 총\t점 : %d\n", total);
			System.out.printf(" 평\t균 : %5.2f\n", avg);
			System.out.println("───────────────────────");
		}
	}

	// 값만 넘겨줌 total Logic은 같음
	private static int total(Exam exam) {
		return total(exam.kor, exam.eng, exam.math);
	}


	// 국영수의 총합을 구하는 함수
	private static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}


	// 성적 입력 함수
	private static void inputGrade(ExamCollection list) {
		
		int kor;
		int eng;
		int math;
		Exam[] exams = list.exams;
		int current = list.current;
		
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

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		exams[++current] = exam;			
	}

	// 메인 메뉴 함수
	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ──────────────────────");
		System.out.println("│             메   인   메   뉴           │");
		System.out.println(" ──────────────────────");
		System.out.println(" 1. 성적 입력");
		System.out.println(" 2. 성적 출력");
		System.out.println(" 3. 종료");
		System.out.println(" 선택 >");

		int menu = scan.nextInt();
		return menu;
	}
	
}
