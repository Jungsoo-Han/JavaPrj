//입력 -> 출력 함수 사용
import java.util.Scanner;

public class LottoNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String num1, num2, num3, num4, num5, num6, bonus, animal;

		System.out.println("로또 6개의 번호 / 보너스번호를 입력사이오 : ");
		num1 = scan.nextLine();
		num2 = scan.nextLine();
		num3 = scan.nextLine();
		num4 = scan.nextLine();
		num5 = scan.nextLine();
		num6 = scan.nextLine();
		bonus = scan.nextLine();
		
		
		System.out.println("띠를 입력하시오(이번주의 운세를 알랴줌) : ");
		animal = scan.nextLine();
		
		System.out.println("-------------------------------------");
		System.out.println("이번주 응모 번호는");

		System.out.printf("%s, %s, %s, %s, %s, %s, 보너스번호 %s입니다.\n", num1, num2, num3, num4, num5, num6, bonus);
		System.out.println("-------------------------------------");

		
		System.out.println("당신의 띠는 " + animal + " 이며 1등 될 운명이오니 판매점으로 달려가세요");
		System.out.println("-------------------------------------");
		

	}

}
