package collection.generic;

public class GCollection<T> {

	private T[] data;// = new Exam[3]; 여기서는 연산을 할 수 없어
	private int current;// = -1;
	private int capacity;
	private int amount; // 추가증가량
	
	
	public class Iterator {
		
		private int index; // 열거를 하기 위한 변수
		
		public Iterator() {
			index = -1;
		}

		public T next() {

			return data[++index];

		}

		public boolean hasNext() {

			return index < current;

		}

		public void clear() {
			index = -1;
		}
	}

	public GCollection() {
		capacity = 3;
		data = (T[]) new Object[capacity]; // 다음시간에
		current = -1;
		amount = 5;
	}
	

	public T[] getExams() {
		return data;
	}

	public void setExams(T[] exams) {
		this.data = exams;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int size() {

		return current + 1;
	}

	public T get(int i) {

		return data[i];

	}

	public void add(T exam) {

		current++;
		// 만약에 공간이 모자라면
		if (capacity <= current) {
			// 공간을 늘려준다
			// 1. 새로운 크기의 배열을 만드는거야
			T[] temp = (T[]) new Object[capacity + amount];
			// 2. exams 배열에 들어있는 객체를 temp 배열로 옮겨야 한다.
			// temp[0] = exams[0];
			// temp[1] = exams[1];
			for (int i = 0; i < capacity; i++) {
				temp[i] = data[i];
			}
			// 3. 기존의 배열은 버려질 필요가 있고, 새로운 배열이 현재 참조되는 배열이 되어야 된다.
			data = temp;
			// 4. 늘어난 용량이 새로운 값으로 대치되어야 겠지요?
			capacity += amount;
		}

		data[current] = exam;

		// if (current < 2) {
		// exams[++current] = exam;
		// }
		// else {
		// exams[capacity] = exam;
		// capacity++;
		// current++;
		// }

	}

	public Iterator iterator() {
		
		return new Iterator();
	}
}
