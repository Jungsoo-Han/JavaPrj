package oop.inhe.ya;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private AvgListener avgListener;

	// »ý¼ºÀÚ
	public Exam() {
		this(0, 0, 0);
	}

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
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

	public int total() {
		return total = kor + eng + math;
	}

	public double avg() {
		return avgListener.avg();
	}

}
