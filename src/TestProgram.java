import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		int Menu = 0, InputMenu = 0, ResultMenu = 0, HelpMenu = 0, FirstNumber = 0, SecondNumber = 0, Result = 0;
		//변수 선언

		Scanner scan = new Scanner(System.in);

		exit : while (true) {  // 메뉴 부분

			System.out.println("---------------------------------------------");
			System.out.println("│         합을 구하는 프로그램       │");
			System.out.println("---------------------------------------------");
			System.out.println(" 1. 값 입력");
			System.out.println(" 2. 결과 보기");
			System.out.println(" 3. 도움말");
			System.out.println(" 4. 종료");
			System.out.println(" 선택 >");

			Menu = scan.nextInt(); //메뉴값을 입력받는 부분

			switch (Menu) {
				case 1: {
					System.out.println("--------------------------------------------------");
					System.out.println("│                1. 값 입력                  │");
					System.out.println("--------------------------------------------------");
					while (true) {
						System.out.println("시작값 space 끝값 >");
						while (true) { // 변수값을 입력 받은 후에 오류를 처리하는 부분
							FirstNumber = scan.nextInt();
							SecondNumber = scan.nextInt();
	
							if (FirstNumber >= SecondNumber) {
								System.out.println("※ 첫번째 숫자가 두번째 숫자가 적도록 입력해야 합니다.");
								System.out.println("시작값 space 끝값 >");
							} else
								break;
						}
	
						while (true) { // 값 입력 후에 상위메뉴로 이동할 때 발생할 수 있는 오류를 처리하는 부분
							System.out.println("상위메뉴로 이동(yes-1 / 재입력-2) >");
							InputMenu = scan.nextInt();
	
							if (InputMenu == 1) {
								break;  // 메인 메뉴로 이동
							} else if (InputMenu == 2) {
								break; // 값을 재 입력 받는 부분
							} else {
								System.out.println("1과 2중에 입력하셔야 합니다.");
							}
						} break;
					} break;
				}
				case 2: {
					System.out.println("--------------------------------------------------");
					System.out.println("│                2. 결과 보기               │");
					System.out.println("--------------------------------------------------");
					System.out.print("[" + FirstNumber + "] 부터 [" + SecondNumber + "] 까지의 합은");
					Result = (SecondNumber - FirstNumber) * (FirstNumber + SecondNumber) / 2;
	
					/*
					 * for (int i = FirstNumber; i <= SecondNumber; i++) { // 연산을
					 * 처리하는 부분 Result += FirstNumber++; }
					 */
	
					System.out.println("[" + Result + "]입니다.");
					System.out.println("상위 메뉴로 이동 (yes-1) >");
					FirstNumber = 0;
					SecondNumber = 0;
					Result = 0; // 결과 값 초기화
					while (true) { // 결과 메뉴에서 상위메뉴로 이동할 때 발생할 수 있는 오류를 처리하는 부분
						ResultMenu = scan.nextInt();
						if (ResultMenu == 1)
							break;
						else
							System.out.println("유효하지 않은 값입니다. 1을 입력하여 주세요");
					}
					break;
				}
				case 3: {
					System.out.println("--------------------------------------------------");
					System.out.println("│                  3. 도움말                 │");
					System.out.println("--------------------------------------------------");
					System.out.println("첫번째 숫자와 두번째 숫자를 입력하시면\n두 숫자 사이의 합을 구할 수 있습니다.\n(조건 : 첫번째 숫자<두번째숫자)");
					System.out.println("상위 메뉴로 이동 (yes-1) >");
					while(true){ // 도움말 메뉴에서 상위메뉴로 이동할 때 발생할 수 있는 오류를 처리하는 부분
					HelpMenu = scan.nextInt();
					if (HelpMenu == 1)
						break;
					else 
						System.out.println("유효하지 않은 값입니다. 1을 입력하여 주세요");
					} break;
				}
				case 4: {
					System.out.println("Good Bye~");
					break exit; // while 섹션을 빠져나와 메인함수를 완전히 종료하는 부분
				}
				default : {
					System.out.println("유효하지 않은 값을 선택하셨습니다. 1~4 까지의 숫자를 선택하여 주세요.");
				}
			}
		}
	}
}
