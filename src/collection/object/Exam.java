package collection.object;


public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Exam() {

		kor = 0;
		eng = 0;
		math = 0;
		total = 0;
		avg = 0;
		
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
