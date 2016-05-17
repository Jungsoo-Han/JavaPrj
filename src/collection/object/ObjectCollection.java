package collection.object;

public class ObjectCollection {
	
	private Object[] data;// = new Exam[3]; ���⼭�� ������ �� �� ����
	private int current;// = -1;
	private int capacity;
	private int amount; // �߰�������

	public ObjectCollection() {
		capacity = 3;
		data = new Exam[capacity];
		current = -1;
		amount = 5;

	}
	
	

	public Object[] getExams() {
		return data;
	}



	public void setExams(Object[] exams) {
		this.data = exams;
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

	public Object get(int i) {
		
		return data[i];
		
	}



	public void add(Object exam) {

		current++;
		// ���࿡ ������ ���ڶ��
		if (capacity <= current) {
			// ������ �÷��ش�
			// 1. ���ο� ũ���� �迭�� ����°ž�
			Object[] temp = new Exam[capacity+amount];
			// 2. exams �迭�� ����ִ� ��ü�� temp �迭�� �Űܾ� �Ѵ�.
//			temp[0] = exams[0];
//			temp[1] = exams[1];
			for (int i = 0; i < capacity; i++) {
				temp[i] = data[i];
			}
			// 3. ������ �迭�� ������ �ʿ䰡 �ְ�, ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �ȴ�.
			data = temp;
			// 4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity += amount;
		}
		
		data[current] = exam;
		
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
