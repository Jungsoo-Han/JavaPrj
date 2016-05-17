import java.util.Scanner;

// ���� �����͸� ����ȭ�ϱ�

public class Program8 {
	
	static ExamCollection list = new ExamCollection();

	public static void main(String[] args) {
		
		/*int kor;
		int eng;
		int math;*/
		
		
		/*Exam[] exams = new Exam[3];
		int current = -1;*/
		
		list.exams = new Exam[3];
		list.current = -1;
		int exit = 0;		
		
		
		

		while (exit == 0) {

			// ���θ޴�
			switch (inputMainMenu()) {
			case 1:
				// �����Է�
				inputGrade();

				break;
			case 2:
				// �������
				printGrade();

				break;
			case 3:
				// ����
				exit = exitProgram(exit);
				break;

			default:
				break;
			}

		}
		
	}


	// ���� �Լ�
	private static int exitProgram(int exit) {
		System.out.println("Good bye~");
		exit = 1;
		return exit;
		
	}

	// ���� ��� �Լ�
	private static void printGrade() {
		
		Exam[] exams = list.exams;
		int current = list.current;
		
		System.out.println(" ��������������������������������������������");
		System.out.println("��             ��   ��   ��   ��           ��");
		System.out.println(" ��������������������������������������������");

		for(int i = 0; i < current+1; i++){
			
			Exam exam = new Exam();
			exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = 0;
			double avg = 0;
			
			total = kor + eng + math;
			avg = total;
			
			System.out.printf(" ��\tȣ : %d\n", i+1);
			System.out.printf(" ��\t�� : %d\n", kor);
			System.out.printf(" ��\t�� : %d\n", eng);
			System.out.printf(" ��\t�� : %d\n", math);
			System.out.printf(" ��\t�� : %d\n", total);
			System.out.printf(" ��\t�� : %5.2f\n", avg);
			System.out.println("����������������������������������������������");
		}
	}

	// ���� �Է� �Լ�
	private static void inputGrade() {
		
		int kor;
		int eng;
		int math;
		
		Exam[] exams = list.exams;
		int current = list.current;
		
		Scanner scan = new Scanner(System.in);
		// �����Է��ۼ�
		System.out.println(" ��������������������������������������������");
		System.out.println("��             ��   ��   ��   ��           ��");
		System.out.println(" ��������������������������������������������");
		// ���� ��ȿ�� �˻�
		
		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			kor = scan.nextInt();
			if (!(0 <= kor && kor <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= kor && kor <= 100));

		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			eng = scan.nextInt();
			if (!(0 <= eng && eng <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= eng && eng <= 100));

		do{
			System.out.print(" ���� ������ �Է��ϼ��� : ");
			math = scan.nextInt();
			if (!(0 <= math && math <= 100))
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. 0~100 ������ ���� �Է����ּ���");
		} while (!(0 <= math && math <= 100));

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		exams[++current] = exam;
		list.current = current;
	}

	// ���� �޴� �Լ�
	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ��������������������������������������������");
		System.out.println("��             ��   ��   ��   ��           ��");
		System.out.println(" ��������������������������������������������");
		System.out.println(" 1. ���� �Է�");
		System.out.println(" 2. ���� ���");
		System.out.println(" 3. ����");
		System.out.println(" ���� >");

		int menu = scan.nextInt();
		return menu;
	}
	
}
