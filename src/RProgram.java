
public class RProgram {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("n = %d, Sn = %d, An = %d\r\n", i, sum(i), an(i));
		}
		
	}

	private static int an(int n) {		
		return 3+(n-1)*7;
		
	}

	private static int sum(int n) {
		if(n == 1)
			return 3;
		return sum(n-1) + an(n);
	}

}
