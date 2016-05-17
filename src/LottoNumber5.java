
//이차배열 사용

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoNumber5 {
	
	

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		// 컬렉팅 하기 위한 변수들과 함께 저장소 변수 선언
		int[][] lottos = new int[10][6];
		int current = -1; // 마지막에 저장한 데이터의 위치가 어디냐

		menu: while (true) {

			switch (inputMainMenu()) {
			case 1:
				current = manageLotto(lottos, current);
				break;
			case 2:
				//스트링으로 해보다가 실패
				/*FileInputStream fin = new FileInputStream("res/lotto/lottos.txt");
				Scanner fscan = new Scanner(fin);
				current = -1;
				String count = fscan.nextLine();
				int count_Number = Integer.parseInt(count);
				for (int i = 0; i < count_Number; i++) { //읽을 로또가 몇개
					String[] lotto = new String[6];
					for (int j = 0; j < 6; j++) {
						lotto[j] = fscan.nextLine();
					}
					current++;
					lottos[current] = lotto;
				}				
				fin.close();
				System.out.println("데이터 읽기가 완료되었습니다.");*/				
								
				FileInputStream fin = new FileInputStream("res/lotto/lottos.txt");
				current = -1;
				int count = fin.read(); //리드 카운터 헤더
				for (int i = 0; i < count; i++) { //읽을 로또가 몇개
					int[] lotto = new int[6];
					for (int j = 0; j < 6; j++) {
						lotto[j] = fin.read();
					}
					current++;
					lottos[current] = lotto;
				}				
				fin.close();
				System.out.println("데이터 읽기가 완료되었습니다.");
				break;
			case 3:
				//숫자로 저장할 때
				//"32434567 -> 16바이트"
				//"32434567 -> 4바이트"
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				fos.write(current + 1); // 나중에 읽을 때 카운트가 되는것(헤더)
				
				for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					for (int j = 0; j < 6; j++){
						fos.write(lotto[j]);
					}
				}
				fos.close();
				System.out.println("목록을 저장하였습니다.");
				
				//문자로 저장할 때
				/*FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				PrintStream fout = new PrintStream(fos);
				fout.printf("%d\r\n", current+1);
				for (int i = 0; i < current + 1; i++) {
					int[] lotto1 = lottos[i];
					fout.printf("%2d %2d %2d %2d %2d %2d\r\n", lotto1[0], lotto1[1], lotto1[2], lotto1[3], lotto1[4],
							lotto1[5]);
				}
				System.out.println("목록을 저장하였습니다.");
				fout.close();
				fos.close();*/
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				break menu;

			default:
				break;
			}
		}
	}
	
	private static int manageLotto(int[][] lottos, int current) {
		Scanner scan = new Scanner(System.in);
		menu1: while (true) {
			int smenu = 0;

			// 목록 출력 코드를 작성
			if (current > -1) {
				System.out.println("로또 목록--------------------");
				for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					System.out.printf("%d : %2d %2d %2d %2d %2d %2d\n",
							i + 1, lotto[0], lotto[1], lotto[2],
							lotto[3], lotto[4], lotto[5]);
				}
				System.out.println();						
			}

			System.out.println("1. 번호 생성 : ");
			System.out.println("2. 번호 입력 : ");
			System.out.println("3. 상위메뉴로 이동 : ");
			smenu = scan.nextInt();
			switch (smenu) {
			case 1:
				int[] lotto = new int[6];

				//로또번호생성
				generateLotto(lotto);

				//정렬
				sortLotto(lotto);

				// lotto 에 있는 값을 lottos로 옮기는 작업
				current++;
				for (int i = 0; i < 6; i++) {
					lottos[current][i] = lotto[i];
				}
				/*
				 * for (int i = 0; i < current+1; i++) {
				 * System.out.printf("%d : %2d %2d %2d %2d %2d %2d \n",
				 * i+1, lottos[i][0], lottos[i][1], lottos[i][2],
				 * lottos[i][3], lottos[i][4], lottos[i][5]); }
				 */
				/*for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					System.out.printf("%d : %2d %2d %2d %2d %2d %2d\n", i + 1, lotto[0], lotto[1], lotto[2],
							lotto[3], lotto[4], lotto[5]);
				}
				System.out.println();*/
				break;
			case 2:
				System.out.println("번호를 입력하세요 : ");
				break;
			case 3: // switch? while? 을 벗어나야함
				break menu1;

			default:
				break;
			}
		} return current;
		
	}

	public static void generateLotto(int[] lotto){
		// 중복검사
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i -= 1;
					break;
				}
			}
		}
		
	}
	
	public static void sortLotto(int[] lotto) {
		// 정렬하기
		int temp;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}
	}
	
	public static int inputMainMenu(){
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		System.out.println("로또 메인 메뉴");
		System.out.println("1. 번호 목록 : ");
		System.out.println("2. 번호 읽기 : ");
		System.out.println("3. 번호 저장 : ");
		System.out.println("4. 종료 : ");
		
		menu = scan.nextInt();
		
		return menu;
		
	}
	
}
