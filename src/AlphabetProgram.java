public class AlphabetProgram {

	public static void main(String[] args) {
		
		int cnt = 'Z' - 'A' + 1;
		
		/*for(int i=0; i<cnt; i++){
			System.out.printf("%c", 'A'+i); //A부터 Z까지 출력
		}*/
		/*for(int i=0; i<cnt; i++){
		System.out.printf("%c", 'Z'-i); //Z부터 A까지 출력
		}*/
		
		/*cnt *= 2;
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+(i%26)); // A부터 Z까지 두번 출력 i가 25번째가 되면 0이 된다.
		*/
		cnt *= 2;
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));		
	}
}
