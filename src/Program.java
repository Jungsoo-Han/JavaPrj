import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor = 0, eng = 0, math = 0, menu, total;
		double avg = 0;

		while (true) {

			System.out.println(" ��������������������������������������������");
			System.out.println("��                 ��   ��   ��   ��                  ��");
			System.out.println(" ��������������������������������������������");
			System.out.println(" 1. ���� �Է�");
			System.out.println(" 2. ���� ���");
			System.out.println(" 3. ����");
			System.out.println(" ���� >");

			menu = scan.nextInt();

			if (menu == 1) {
				// �����Է��ۼ�
				System.out.println(" ��������������������������������������������");
				System.out.println("��                 ��   ��   ��   ��                  ��");
				System.out.println(" ��������������������������������������������");
				System.out.print(" ���� ������ �Է��ϼ��� : ");
				kor = scan.nextInt();
				System.out.print(" ���� ������ �Է��ϼ��� : ");
				eng = scan.nextInt();
				System.out.print(" ���� ������ �Է��ϼ��� : ");
				math = scan.nextInt();
			} else if (menu == 2) {
				total = kor + eng + math;
				avg = total;
				System.out.println(" ��������������������������������������������");
				System.out.println("��                 ��   ��   ��   ��                  ��");
				System.out.println(" ��������������������������������������������");
				System.out.printf(" ��\t�� : %d\n", kor);
				System.out.printf(" ��\t�� : %d\n", eng);
				System.out.printf(" ��\t�� : %d\n", math);
				System.out.printf(" ��\t�� : %d\n", total);
				System.out.printf(" ��\t�� : %5.2f\n", avg);
				System.out.println("����������������������������������������������");
			} else if (menu == 3) {
				System.out.println("Good bye~");
				//System.exit(0);
				break;
			} else {
				System.out.println("��ȿ���� ���� ���� �����ϼ̽��ϴ�. 1~3 ������ ���ڸ� �����Ͽ� �ּ���.");
			}
		}

	}

}
