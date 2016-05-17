import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor = 0, eng = 0, math = 0, menu, total;
		double avg = 0;

		Here:
		while (true) {

			System.out.println(" ──────────────────────");
			System.out.println("│                 메   인   메   뉴                  │");
			System.out.println(" ──────────────────────");
			System.out.println(" 1. 성적 입력");
			System.out.println(" 2. 성적 출력");
			System.out.println(" 3. 종료");
			System.out.println(" 선택 >");

			menu = scan.nextInt();

			switch (menu) {

				case 1: {
					// 성적입력작성
					System.out.println(" ──────────────────────");
					System.out.println("│                 성   적   입   력                  │");
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
					
				} break;
				case 2: {
					total = kor + eng + math;
					avg = total;
					System.out.println(" ──────────────────────");
					System.out.println("│                 성   적   출   력                  │");
					System.out.println(" ──────────────────────");
					System.out.printf(" 국\t어 : %d\n", kor);
					System.out.printf(" 영\t어 : %d\n", eng);
					System.out.printf(" 수\t학 : %d\n", math);
					System.out.printf(" 총\t점 : %d\n", total);
					System.out.printf(" 평\t균 : %5.2f\n", avg);
					System.out.println("───────────────────────");
				} break;
				case 3: {
					System.out.println("Good bye~");
					//System.exit(0);
					break Here;
				} 
				default: {
					System.out.println("유효하지 않은 값을 선택하셨습니다. 1~3 까지의 숫자를 선택하여 주세요.");
				}
			}
		}

	}

}
