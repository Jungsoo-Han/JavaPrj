package collection;

public class ExamCollection {
	
	private Exam[] exams;// = new Exam[3]; ���⼭�� ������ �� �� ����
	private int current;// = -1;
	private int capacity;
	private int amount; // �߰�������

	public ExamCollection() {
		capacity = 3;
		exams = new Exam[capacity];
		current = -1;
		amount = 5;

	}
	
	

	public Exam[] getExams() {
		return exams;
	}



	public void setExams(Exam[] exams) {
		this.exams = exams;
	}



	public int getCurrent() {
		return current;
	}



	public void setCurrent(int current) {
		this.current = current;
	}



	public int size() {
		
		return current+1;
	}

	public Exam get(int i) {
		
		return exams[i];
		
	}



	public void add(Exam exam) {

		current++;
		// ���࿡ ������ ���ڶ��
		if (capacity <= current) {
			// ������ �÷��ش�
			// 1. ���ο� ũ���� �迭�� ����°ž�
			Exam[] temp = new Exam[capacity+amount];
			// 2. exams �迭�� ����ִ� ��ü�� temp �迭�� �Űܾ� �Ѵ�.
//			temp[0] = exams[0];
//			temp[1] = exams[1];
			for (int i = 0; i < capacity; i++) {
				temp[i] = exams[i];
			}
			// 3. ������ �迭�� ������ �ʿ䰡 �ְ�, ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �ȴ�.
			exams = temp;
			// 4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity += amount;
		}
		
		exams[current] = exam;
		
//		if (current < 2) {
//			exams[++current] = exam;
//		}
//		else {
//			exams[capacity] = exam;
//			capacity++;
//			current++;
//		}
		
		
		
	}
}
