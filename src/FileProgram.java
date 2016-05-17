import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {

		char[] str = new char[]{'H', 'E', 'L', 'L', 'O', 0, 'O', 'K', 0};

		System.out.println("Hello Java World".substring(2)); // 2이후에 문자열 출력
		//문자열 합치기
		// -> +, concat(str)
		System.out.println("Good" + " bye~");
		System.out.println("Good".concat(" bye~"));
		
		//문자열 나누기  ※ 문자열 함수에서 배열 new로 생성할 수 있게 해준다.
		// ->split() // lotto : 12 23 45
		String[] strs = "lotto : 12 23 45".split(" : ");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//문자열 자르기
		"Hello".substring(2, 4);
		
		//문자열 비교하기
		String name1 = "아이유"; // 묵시적으로 해준다
		String name2 = new String("아이유"); // 정상 (명시적으로)
		System.out.println(name1 == name2); // 객체가 같은지 비교
		System.out.println(name1.equals(name2)); // 값이 같은지를 비교
		
		//문자열 찾기
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
		
		//문자열 변환  숫자 -> 문자열  문자열 -> 숫자
		//"23"+"33" => "2333"
		//"23" -> 23
		int kor = Integer.parseInt("23");
		System.out.println(kor + 2);
		
		//String s = String.valueOf(kor);
		String s = "" + kor; //트릭... kor 가 숫자임으로 묵시적으로 문자열로 변환이 된다.
		System.out.println(kor + 2); // 원래 오류가 나는데 묵시적으로 숫자 2를 문자열로 변환

		//String str = "Hello"// -> new char[]{'H', 'E', 'L', 'L', 'O', \0} 문자열 길이(), 문자열 자르기(), 문자열 나누기() 구현해야 되는데... 알아서 만들어놈

		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\SIST\\Desktop\\Hello.txt");
		PrintStream fout = new PrintStream(fos);
		fout.printf("Lotto : %d %d %d", 12, 14, 13);
		fout.close();
		fos.close();

		System.out.println("입력 받아 볼까요?");
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
