import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		Scanner pos = new Scanner(System.in);

		System.out.print("��ǥ���� �Է��Ͻÿ�(���� 1~19) : ");
		// ����ڿ��� ���� ��ǥ �ϳ��� �Է� �޴´�.
		int width = 0, height = 0;
		width = pos.nextInt();
		height = pos.nextInt();
		
		// ������ ���
		for (int y = 0; y < 20; y++) {
			
			for (int x = 0; x < 20; x++){
				// Ư�� ��ġ ����
				if(width == x && height == y)
					System.out.printf("%c", '��');
				// �𼭸�
				else if(x == 0 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '��');
				// �׵θ�
				else if(x == 0 && y <= 18)
					System.out.printf("%c", '��');
				else if(x <= 18 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 19 && y <= 18)
					System.out.printf("%c", '��');
				else if(x <= 19 && y == 19)
					System.out.printf("%c", '��');
				// �⺻����
				else 
					System.out.printf("%c", '��');
				
			}
			System.out.println();
		}		
	}
}
