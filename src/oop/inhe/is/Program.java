package oop.inhe.is;

public class Program {

	public static void main(String[] args) {
		
//		exam.setKor(30);
//		System.out.println(exam.getKor());
		Exam exam = new Exam();
		
		ExamConsole examConsole = new ExamConsole(exam);
		
		examConsole.input();
		
		examConsole.print();
		

	}

}
