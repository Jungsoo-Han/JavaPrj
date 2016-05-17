import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		Scanner pos = new Scanner(System.in);

		System.out.print("좌표값을 입력하시오(범위 1~19) : ");
		// 사용자에게 오목 좌표 하나를 입력 받는다.
		int width = 0, height = 0;
		width = pos.nextInt();
		height = pos.nextInt();
		
		// 오목판 출력
		for (int y = 0; y < 20; y++) {
			
			for (int x = 0; x < 20; x++){
				// 특정 위치 조건
				if(width == x && height == y)
					System.out.printf("%c", '○');
				// 모서리
				else if(x == 0 && y == 0)
					System.out.printf("%c", '┌');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '┐');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '└');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '┘');
				// 테두리
				else if(x == 0 && y <= 18)
					System.out.printf("%c", '├');
				else if(x <= 18 && y == 0)
					System.out.printf("%c", '┬');
				else if(x == 19 && y <= 18)
					System.out.printf("%c", '┤');
				else if(x <= 19 && y == 19)
					System.out.printf("%c", '┴');
				// 기본뼈대
				else 
					System.out.printf("%c", '┼');
				
			}
			System.out.println();
		}		
	}
}
