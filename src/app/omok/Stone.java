package app.omok;

import java.util.Scanner;

public class Stone {

	private static boolean isWhiteTurn; // ��� ��ü�� �����ؼ� ���� ����(��������)
	private int x;
	private int y;
	private int type;
	private int count;


	public Stone() {
		x = -1;
		y = -1;
		type = 1; // ������
		count = 0;

	}

	static {
		isWhiteTurn = false; // �������� �ʱ�ȭ (�����ڿ��� �ϸ� ��� false�� ��)
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

		System.out.print("��ġ�� �Է��ϼ��� x sp y  : ");
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
//		buf[y][x] = (type == 1) ? '��' : '��';
//	}

}
