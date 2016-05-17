
//�����迭 ���

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoNumber4 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		// �÷��� �ϱ� ���� ������� �Բ� ����� ���� ����
		int[][] lottos = new int[10][6];
		int current = -1; // �������� ������ �������� ��ġ�� ����

		menu: while (true) {

			int menu = 0;

			System.out.println("�ζ� ���� �޴�");
			System.out.println("1. ��ȣ ��� : ");
			System.out.println("2. ��ȣ �б� : ");
			System.out.println("3. ��ȣ ���� : ");
			System.out.println("4. ���� : ");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				menu1: while (true) {
					int smenu = 0;
					
					// ��� ��� �ڵ带 �ۼ�
					if (current > -1) {
						System.out.println("�ζ� ���--------------------");
						for (int i = 0; i < current + 1; i++) {
							int[] lotto = lottos[i];
							System.out.printf("%d : %2d %2d %2d %2d %2d %2d\n",
									i + 1, lotto[0], lotto[1], lotto[2],
									lotto[3], lotto[4], lotto[5]);
						}
						System.out.println();						
					}

					System.out.println("1. ��ȣ ���� : ");
					System.out.println("2. ��ȣ �Է� : ");
					System.out.println("3. �����޴��� �̵� : ");
					smenu = scan.nextInt();
					switch (smenu) {
					case 1:
						Random rand = new Random();
						int temp = 0;

						// �ߺ��˻�
						int[] lotto = new int[6];
						for (int i = 0; i < 6; i++) {
							lotto[i] = rand.nextInt(45) + 1;
							for (int j = 0; j < i; j++) {
								if (lotto[j] == lotto[i]) {
									i -= 1;
									break;
								}
							}
						}

						// �����ϱ�
						for (int j = 0; j < 5; j++) {
							for (int i = 0; i < 5 - j; i++) {
								if (lotto[i] > lotto[i + 1]) {
									temp = lotto[i];
									lotto[i] = lotto[i + 1];
									lotto[i + 1] = temp;
								}
							}
						}

						// lotto �� �ִ� ���� lottos�� �ű�� �۾�
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
						System.out.println("��ȣ�� �Է��ϼ��� : ");
						break;
					case 3: // switch? while? �� �������
						break menu1;

					default:
						break;
					}
				}
				break;
			case 2:
				//��Ʈ������ �غ��ٰ� ����
				/*FileInputStream fin = new FileInputStream("res/lotto/lottos.txt");
				Scanner fscan = new Scanner(fin);
				current = -1;
				String count = fscan.nextLine();
				int count_Number = Integer.parseInt(count);
				for (int i = 0; i < count_Number; i++) { //���� �ζǰ� �
					String[] lotto = new String[6];
					for (int j = 0; j < 6; j++) {
						lotto[j] = fscan.nextLine();
					}
					current++;
					lottos[current] = lotto;
				}				
				fin.close();
				System.out.println("������ �бⰡ �Ϸ�Ǿ����ϴ�.");*/				
								
				FileInputStream fin = new FileInputStream("res/lotto/lottos.txt");
				current = -1;
				int count = fin.read(); //���� ī���� ���
				for (int i = 0; i < count; i++) { //���� �ζǰ� �
					int[] lotto = new int[6];
					for (int j = 0; j < 6; j++) {
						lotto[j] = fin.read();
					}
					current++;
					lottos[current] = lotto;
				}				
				fin.close();
				System.out.println("������ �бⰡ �Ϸ�Ǿ����ϴ�.");
				break;
			case 3:
				//���ڷ� ������ ��
				//"32434567 -> 16����Ʈ"
				//"32434567 -> 4����Ʈ"
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				fos.write(current + 1); // ���߿� ���� �� ī��Ʈ�� �Ǵ°�(���)
				
				for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					for (int j = 0; j < 6; j++){
						fos.write(lotto[j]);
					}
				}
				fos.close();
				System.out.println("����� �����Ͽ����ϴ�.");
				
				//���ڷ� ������ ��
				/*FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				PrintStream fout = new PrintStream(fos);
				fout.printf("%d\r\n", current+1);
				for (int i = 0; i < current + 1; i++) {
					int[] lotto1 = lottos[i];
					fout.printf("%2d %2d %2d %2d %2d %2d\r\n", lotto1[0], lotto1[1], lotto1[2], lotto1[3], lotto1[4],
							lotto1[5]);
				}
				System.out.println("����� �����Ͽ����ϴ�.");
				fout.close();
				fos.close();*/
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				break menu;

			default:
				break;
			}
		}
	}
}
