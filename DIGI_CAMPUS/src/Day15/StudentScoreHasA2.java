//성적처리 클래스
package Day15;

import java.util.Scanner;

import Day5.Name;
import Day5.Subject;
public class StudentScoreHasA2 {
	//이름 -> name
	//과목 -> subject
	//총점, 평균

		private Name name;
		private Subject kor;
		private Subject eng;
		private Subject math;
		StudentScoreHasA2 next;
	
		private int total=0;
		private float avg=0;
		
		public StudentScoreHasA2() {
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
			getTotal();
			this.kor.setScore(kor);
		}
	
		public int getMath() {
			return this.math.getScore();
		}
	
		public void setMath(int math) {
			getTotal();
			this.math.setScore(math);
		}
	
	
		public int getEng() {
			return this.eng.getScore();
		}
	
		public void setEng(int math) {
			getTotal();
			this.eng.setScore(math);
		}
	
		public int getTotal() {
			return total = kor.getScore()+math.getScore()+eng.getScore();
		}
	
		public float getAvg() {
			getTotal();
			return avg = total/3.f;
		}

}
