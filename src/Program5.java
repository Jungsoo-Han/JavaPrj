import java.util.Scanner;


// 함수를 이용해 구조만 작성하는 코드

public class Program5 {

	public static void main(String[] args) {
		
		/*int kor;
		int eng;
		int math;*/
		
		Exam exam = new Exam();
		int exit = 0;
		
		

		Out : while (exit == 0) {

			// 메인메뉴
			switch (inputMainMenu()) {
			case 1:
				// 성적입력
				inputGrade(exam);

				break;
			case 2:
				// 성적출력
				printGrade(exam);

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
	private static void printGrade(Exam exam) {
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
	private static void inputGrade(Exam exam) {
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
