import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {

		char[] str = new char[]{'H', 'E', 'L', 'L', 'O', 0, 'O', 'K', 0};

		System.out.println("Hello Java World".substring(2)); // 2���Ŀ� ���ڿ� ���
		//���ڿ� ��ġ��
		// -> +, concat(str)
		System.out.println("Good" + " bye~");
		System.out.println("Good".concat(" bye~"));
		
		//���ڿ� ������  �� ���ڿ� �Լ����� �迭 new�� ������ �� �ְ� ���ش�.
		// ->split() // lotto : 12 23 45
		String[] strs = "lotto : 12 23 45".split(" : ");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//���ڿ� �ڸ���
		"Hello".substring(2, 4);
		
		//���ڿ� ���ϱ�
		String name1 = "������"; // ���������� ���ش�
		String name2 = new String("������"); // ���� (���������)
		System.out.println(name1 == name2); // ��ü�� ������ ��
		System.out.println(name1.equals(name2)); // ���� �������� ��
		
		//���ڿ� ã��
		System.out.println("Hello".indexOf("el"));
		int idx = "Hello how are you".indexOf("o");
		System.out.println(idx);
		idx = "Hello how are you".indexOf("o", idx+1);
		System.out.println(idx);
		idx = "Hello how are you".indexOf("o", idx+1);
		System.out.println(idx);
		/*int idx1 = "Hello how are you".indexOf("o"+1);
		System.out.println(idx1);*/
		String filename = "file1.txt";
		idx = filename.lastIndexOf(".");
		System.out.println(filename.substring(idx+1));
		
		String path = "E:\\2016-02-22\\lotto.txt";
		idx = path.lastIndexOf("\\");
		System.out.println(path.substring(idx+1));
		
		idx = path.indexOf("\\");
		System.out.println(path.substring(idx+1));
		
		idx = path.indexOf("\\", idx+1);
		System.out.println(path.substring(idx+1));
		
		//���ڿ� ��ȯ  ���� -> ���ڿ�  ���ڿ� -> ����
		//"23"+"33" => "2333"
		//"23" -> 23
		int kor = Integer.parseInt("23");
		System.out.println(kor + 2);
		
		//String s = String.valueOf(kor);
		String s = "" + kor; //Ʈ��... kor �� ���������� ���������� ���ڿ��� ��ȯ�� �ȴ�.
		System.out.println(kor + 2); // ���� ������ ���µ� ���������� ���� 2�� ���ڿ��� ��ȯ

		//String str = "Hello"// -> new char[]{'H', 'E', 'L', 'L', 'O', \0} ���ڿ� ����(), ���ڿ� �ڸ���(), ���ڿ� ������() �����ؾ� �Ǵµ�... �˾Ƽ� ������

		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\SIST\\Desktop\\Hello.txt");
		PrintStream fout = new PrintStream(fos);
		fout.printf("Lotto : %d %d %d", 12, 14, 13);
		fout.close();
		fos.close();

		System.out.println("�Է� �޾� �����?");
		FileInputStream fis = new FileInputStream("C:\\Users\\SIST\\Desktop\\Hello.txt");
		Scanner fscan = new Scanner(fis);

		fscan.next();
		fscan.next();
		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();

		System.out.printf("n1 : %d, n2 : %d, n3 : %d\n", n1, n2, n3);


		//String str = fscan.nextLine();
		//System.out.println(str);

		fscan.close();
		fis.close();*/

	}

}
