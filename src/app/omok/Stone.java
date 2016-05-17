package app.omok;

import java.util.Scanner;

public class Stone {

	private static boolean isWhiteTurn; // 모든 객체가 공유해서 쓰는 변수(전역변수)
	private int x;
	private int y;
	private int type;
	private int count;


	public Stone() {
		x = -1;
		y = -1;
		type = 1; // 검은돌
		count = 0;

	}

	static {
		isWhiteTurn = false; // 전역변수 초기화 (생성자에서 하면 계속 false로 됨)
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("위치를 입력하세요 x sp y  : ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		type = (isWhiteTurn ? 2 /* white */ : 1/* black */);


		//setType(isWhiteTurn ? 2 /* white */ : 1/* black */);
		//isWhiteTurn = !isWhiteTurn;
	}

	public static void toggleTurn() {
		isWhiteTurn = !isWhiteTurn;
	}

//	public void put(char[][] buf) {
//		buf[y][x] = (type == 1) ? '●' : '○';
//	}

}
