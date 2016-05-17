package app.omok;

public class Board {

	private Stone[] stones;
	private int width;
	private int height;
	private char[][] buf;
	private int current;

	public Board() {
		width = 20;
		height = 20;
		buf = new char[height][width];
		stones = new Stone[width * height];
		current = -1;
		initBoard();
	}

	public Stone[] getStones() {
		return stones;
	}

	public void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char[][] getBuf() {
		return buf;
	}

	public void setBuf(char[][] buf) {
		this.buf = buf;
	}

	private void initBoard() {
		// ������ �ʱ�ȭ
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				buf[y][x] = '��';

		// �׵θ� �׸��� : ���ڷ��̼�
		for (int i = 0; i < width; i++)
			buf[0][i] = '��';
		for (int i = 0; i < width; i++)
			buf[height - 1][i] = '��';
		for (int i = 0; i < height; i++)
			buf[i][0] = '��';
		for (int i = 0; i < width; i++)
			buf[i][width - 1] = '��';

		buf[0][0] = '��';
		buf[0][width - 1] = '��';
		buf[height - 1][0] = '��';
		buf[height - 1][width - 1] = '��';
	}

	public void print() {

		initBoard();

		for (int i = 0; i < current + 1; i++) {
			putStone(stones[i]);
		}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.printf("%c", buf[y][x]);
			}
			System.out.println();

		}

	}

	public boolean checkDuplicated(Stone stone) {
		for (int i = 0; i < current + 1; i++)
			if (stones[i].getX() == stone.getX() && stones[i].getY() == stone.getY())
				return true;

		return false;
	}

	public void putStone(Stone stone) {

		buf[stone.getY()][stone.getX()] = (stone.getType() == 1) ? '��' : '��';

	}

	public void add(Stone stone) {
		stones[++current] = stone;
		Stone.toggleTurn();
		// isWhiteTurn = !isWhiteTurn;
		// putStone(stone);
	}

	public boolean checkWin(Stone stone) {
		int x = stone.getX();
		int y = stone.getY();
		char[][] board = buf;
		int cntX = 0;
		int cntWinX = 0;
		int cntY = 0;
		int cntWinY = 0;
		int cntXYL = 0;
		int cntWinXYL = 0;
		int cntXYR = 0;
		int cntWinXYR = 0;

		// �浹 �¸� �˻�
		if (board[y][x] == '��') {

			for (int i = 1; i <= 4; i++) {
				if (board[y][x - i] == '��')
					cntX++;
				else
					break;
				if (cntX == 4)
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntX * (-1)); j < j + 5; j++) {
				if (board[y][x + j] == '��') {
					cntWinX++;
				} else
					break;
				if (cntWinX == 5) {
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (board[y - i][x] == '��')
					cntY++;
				else
					break;
				if (cntY == 4)
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntY * (-1)); j < j + 5; j++) {
				if (board[y + j][x] == '��') {
					cntWinY++;
				} else
					break;
				if (cntWinY == 5) {
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (board[y + i][x - i] == '��')
					cntXYL++;
				else
					break;
				if (cntXYL == 4)
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntXYL * (-1)); j < j + 5; j++) {
				if (board[y + j * (-1)][x + j] == '��') {
					cntWinXYL++;
				} else
					break;
				if (cntWinXYL == 5) {
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (board[y - i][x - i] == '��')
					cntXYR++;
				else
					break;
				if (cntXYR == 4)
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntXYR * (-1)); j < j + 5; j++) {
				if (board[y + j][x + j] == '��') {
					cntWinXYR++;
				} else
					break;
				if (cntWinXYR == 5) {
					System.out.println("�浹�� �¸��Ͽ����ϴ�.");
				}
			}
		}
		
		if (board[y][x] == '��') {

			for (int i = 1; i <= 4; i++) {
				if (board[y][x - i] == '��')
					cntX++;
				else
					break;
				if (cntX == 4)
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntX * (-1)); j < j + 5; j++) {
				if (board[y][x + j] == '��') {
					cntWinX++;
				} else
					break;
				if (cntWinX == 5) {
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (board[y - i][x] == '��')
					cntY++;
				else
					break;
				if (cntY == 4)
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntY * (-1)); j < j + 5; j++) {
				if (board[y + j][x] == '��') {
					cntWinY++;
				} else
					break;
				if (cntWinY == 5) {
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (board[y + i][x - i] == '��')
					cntXYL++;
				else
					break;
				if (cntXYL == 4)
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
			}
			for (int j = (cntXYL * (-1)); j < j + 5; j++) {
				if (board[y + j * (-1)][x + j] == '��') {
					cntWinXYL++;
				} else
					break;
				if (cntWinXYL == 5) {
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
				}
			}
			
			for (int i = 1; i <= 4; i++) {
				if (board[y - i][x - i] == '��')
					cntXYR++;
				else
					break;
				if (cntXYR == 4){
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
					return true;
				}
			}
			for (int j = (cntXYR * (-1)); j < j + 5; j++) {
				if (board[y + j][x + j] == '��') {
					cntWinXYR++;
				} else
					break;
				if (cntWinXYR == 5) {
					System.out.println("�鵹�� �¸��Ͽ����ϴ�.");
					return true;
				}
			}
		}
		return false;
	}

}
