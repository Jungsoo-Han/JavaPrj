import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		int Menu = 0, InputMenu = 0, ResultMenu = 0, HelpMenu = 0, FirstNumber = 0, SecondNumber = 0, Result = 0;
		//���� ����

		Scanner scan = new Scanner(System.in);

		exit : while (true) {  // �޴� �κ�

			System.out.println("---------------------------------------------");
			System.out.println("��         ���� ���ϴ� ���α׷�       ��");
			System.out.println("---------------------------------------------");
			System.out.println(" 1. �� �Է�");
			System.out.println(" 2. ��� ����");
			System.out.println(" 3. ����");
			System.out.println(" 4. ����");
			System.out.println(" ���� >");

			Menu = scan.nextInt(); //�޴����� �Է¹޴� �κ�

			switch (Menu) {
				case 1: {
					System.out.println("--------------------------------------------------");
					System.out.println("��                1. �� �Է�                  ��");
					System.out.println("--------------------------------------------------");
					while (true) {
						System.out.println("���۰� space ���� >");
						while (true) { // �������� �Է� ���� �Ŀ� ������ ó���ϴ� �κ�
							FirstNumber = scan.nextInt();
							SecondNumber = scan.nextInt();
	
							if (FirstNumber >= SecondNumber) {
								System.out.println("�� ù��° ���ڰ� �ι�° ���ڰ� ������ �Է��ؾ� �մϴ�.");
								System.out.println("���۰� space ���� >");
							} else
								break;
						}
	
						while (true) { // �� �Է� �Ŀ� �����޴��� �̵��� �� �߻��� �� �ִ� ������ ó���ϴ� �κ�
							System.out.println("�����޴��� �̵�(yes-1 / ���Է�-2) >");
							InputMenu = scan.nextInt();
	
							if (InputMenu == 1) {
								break;  // ���� �޴��� �̵�
							} else if (InputMenu == 2) {
								break; // ���� �� �Է� �޴� �κ�
							} else {
								System.out.println("1�� 2�߿� �Է��ϼž� �մϴ�.");
							}
						} break;
					} break;
				}
				case 2: {
					System.out.println("--------------------------------------------------");
					System.out.println("��                2. ��� ����               ��");
					System.out.println("--------------------------------------------------");
					System.out.print("[" + FirstNumber + "] ���� [" + SecondNumber + "] ������ ����");
					Result = (SecondNumber - FirstNumber) * (FirstNumber + SecondNumber) / 2;
	
					/*
					 * for (int i = FirstNumber; i <= SecondNumber; i++) { // ������
					 * ó���ϴ� �κ� Result += FirstNumber++; }
					 */
	
					System.out.println("[" + Result + "]�Դϴ�.");
					System.out.println("���� �޴��� �̵� (yes-1) >");
					FirstNumber = 0;
					SecondNumber = 0;
					Result = 0; // ��� �� �ʱ�ȭ
					while (true) { // ��� �޴����� �����޴��� �̵��� �� �߻��� �� �ִ� ������ ó���ϴ� �κ�
						ResultMenu = scan.nextInt();
						if (ResultMenu == 1)
							break;
						else
							System.out.println("��ȿ���� ���� ���Դϴ�. 1�� �Է��Ͽ� �ּ���");
					}
					break;
				}
				case 3: {
					System.out.println("--------------------------------------------------");
					System.out.println("��                  3. ����                 ��");
					System.out.println("--------------------------------------------------");
					System.out.println("ù��° ���ڿ� �ι�° ���ڸ� �Է��Ͻø�\n�� ���� ������ ���� ���� �� �ֽ��ϴ�.\n(���� : ù��° ����<�ι�°����)");
					System.out.println("���� �޴��� �̵� (yes-1) >");
					while(true){ // ���� �޴����� �����޴��� �̵��� �� �߻��� �� �ִ� ������ ó���ϴ� �κ�
					HelpMenu = scan.nextInt();
					if (HelpMenu == 1)
						break;
					else 
						System.out.println("��ȿ���� ���� ���Դϴ�. 1�� �Է��Ͽ� �ּ���");
					} break;
				}
				case 4: {
					System.out.println("Good Bye~");
					break exit; // while ������ �������� �����Լ��� ������ �����ϴ� �κ�
				}
				default : {
					System.out.println("��ȿ���� ���� ���� �����ϼ̽��ϴ�. 1~4 ������ ���ڸ� �����Ͽ� �ּ���.");
				}
			}
		}
	}
}
