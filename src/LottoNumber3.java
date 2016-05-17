//���� ����� �ڵ� ����

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoNumber3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\SIST\\Desktop\\lotto.txt");
		Scanner fscan = new Scanner(fis);
		
		Random rand = new Random();

		int[] lotto = new int[6];
		int temp = 0;

		// ���� : �ߺ� �˻� �Է�
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = fscan.nextInt();  //rand.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i -= 1;
					break;
				}
			}
		}
		fscan.close(); // ���� �ݾƹ����ž�
		fis.close();
		
		// ��ȣ ���
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d, ", lotto[i]);
		}
		

		// ���� �ϱ�
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\SIST\\Desktop\\lotto.txt");
		PrintStream fout = new PrintStream(fos);
		
		// ��ȣ ���
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d, ", lotto[i]);
			fout.printf("%d, ", lotto[i]);
		}
		System.out.println();
		fout.close();
		fos.close();
	}

}
