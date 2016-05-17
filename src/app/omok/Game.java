package app.omok;

public class Game {

	public static void main(String[] args) {

		Board board = new Board();

		// boolean isWhiteTurn = false;

		while (true) {
			
			Stone stone = new Stone();
			board.print();
			boolean win = board.checkWin(stone);
			if (win == true) {
				printWin();
				break;
			}
			else{
				stone.input();
				boolean duplicated = board.checkDuplicated(stone);
				if (duplicated == true)
					printError();
				else
					board.add(stone);
			}

			// stone.put(board.getBuf());
			// stone.setType(isWhiteTurn ? 2 /*white*/ : 1/*black*/);
			// isWhiteTurn = !isWhiteTurn;
			
		}

	}

	private static void printWin() {
		System.out.println("�¸��ϼ̽��ϴ�");		
	}

	private static void printError() {

		System.out.println("�ߺ��� ���� �Է��Ͽ����ϴ�.");
		System.out.println("�ٽ��Է����ּ���.");

	}

}
