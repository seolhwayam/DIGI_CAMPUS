//성적처리 클래스
public class StudentScoreHasA {
	//이름 -> name
	//과목 -> subject
	//총점, 평균
	private Name name;
	private Subject kor;
	private Subject eng;
	private Subject math;


	private int total=0;
	private float avg=0;
	
	public StudentScoreHasA() {
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		math = new Subject();
	}
	
	public String getName() {
		return this.name.getName();
	}

	public void setName(String name) {
		this.name.setName(name);
	}

	public int getKor() {
		return this.kor.getScore();
	}

	public void setKor(int kor) {
		this.kor.setScore(kor);
	}

	public int getMath() {
		return this.math.getScore();
	}

	public void setMath(int math) {
		this.math.setScore(math);
	}


	public int getEng() {
		return this.eng.getScore();
	}

	public void setEng(int math) {
		this.eng.setScore(math);
	}

	public int getTotal() {
		return total = kor.getScore()+math.getScore()+eng.getScore();
	}

	public float getAvg() {
		return avg = total/3.f;
	}

	public static void main(String[] args) {
		StudentScoreHasA stu = new StudentScoreHasA();
		stu.setName("superman");
		stu.setKor(90);
		stu.setMath(100);
		stu.setEng(70);
		
		System.out.println(stu.getName());
		System.out.println(stu.getKor());
		System.out.println(stu.getMath());
		System.out.println(stu.getEng());
		System.out.println(stu.getTotal());
	    System.out.println(stu.getAvg());
	}
}
