
public class StarProgram {

	public static void main(String[] args) {
		
		for (int y = 1; y <= 20; y++) {
			for (int x = 1; x <= 20; x++)
				if (x <= y &&  y <= -x+21){
					System.out.print("¡Ù");
				}
				else{
					System.out.print("¡Û");
				}
					System.out.println();
		}
		/*for (int i = 0, n = 1; i < 20; i++) {
			// 2, 5, 8, 11, 14, 17, 20
			if (i == 2 + (n - 1) * 3) {
				System.out.print("¡Ù");
				n++;
			} else {
				System.out.print("O");
			}
		}*/

	}
}
