
public class ExamLib {
	
	// 값만 넘겨줌 total Logic은 같음
	public static int total(Exam exam) {
		return total(exam.kor, exam.eng, exam.math);
	}


	// 국영수의 총합을 구하는 함수
	public static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}

}
