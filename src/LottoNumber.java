//�Է� -> ��� �Լ� ���
import java.util.Scanner;

public class LottoNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String num1, num2, num3, num4, num5, num6, bonus, animal;

		System.out.println("�ζ� 6���� ��ȣ / ���ʽ���ȣ�� �Է»��̿� : ");
		num1 = scan.nextLine();
		num2 = scan.nextLine();
		num3 = scan.nextLine();
		num4 = scan.nextLine();
		num5 = scan.nextLine();
		num6 = scan.nextLine();
		bonus = scan.nextLine();
		
		
		System.out.println("�츦 �Է��Ͻÿ�(�̹����� ��� �˷���) : ");
		animal = scan.nextLine();
		
		System.out.println("-------------------------------------");
		System.out.println("�̹��� ���� ��ȣ��");

		System.out.printf("%s, %s, %s, %s, %s, %s, ���ʽ���ȣ %s�Դϴ�.\n", num1, num2, num3, num4, num5, num6, bonus);
		System.out.println("-------------------------------------");

		
		System.out.println("����� ��� " + animal + " �̸� 1�� �� ����̿��� �Ǹ������� �޷�������");
		System.out.println("-------------------------------------");
		

	}

}
