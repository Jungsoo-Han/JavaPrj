
public class ExamLib {
	
	// ���� �Ѱ��� total Logic�� ����
	public static int total(Exam exam) {
		return total(exam.kor, exam.eng, exam.math);
	}


	// �������� ������ ���ϴ� �Լ�
	public static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}

}
