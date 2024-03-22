package Day15;


import Day14.LinkNode;
import Day5.StudentScoreHasA;

public class LnikedExam2 {
	static StudentScoreHasA2 head;
	static StudentScoreHasA2 cur;
	static StudentScoreHasA2 newNode;
	static StudentScoreHasA2 del;
	static int size =0;
	
	public LnikedExam2(){
		head = cur = new StudentScoreHasA2();
	}
	
	public void add(String name, int kor, int math, int eng) {
		int totoal = kor+math+eng;
		cur = insertSort(totoal);
		newNode = new StudentScoreHasA2();
		if(cur==head) {
			newNode.next = head;
			head = newNode;
		}else {
			newNode.next = cur.next;
			cur.next=newNode;
		}
		newNode.setName(name);
		newNode.setKor(kor);
		newNode.setMath(math);
		newNode.setEng(eng);
		cur=head;
		System.out.println("삽입완료!"+newNode.getName());
		size++;
	}
	
	public void remove(StudentScoreHasA2 cur) {
		if(cur==head) {
			del=cur;
			head = cur.next;
						
		}else {
			del=cur.next;
			cur.next = del.next;
		}
		del.next =null;
		del=null;	
		size--;
		cur=head;
	}
	
	
	public int getSize() {
		return size;
	}

	public static void setSize(int size) {
		LnikedExam2.size = size;
	}
	
	//전체 출력용
	public void allPrint() {
		cur=head;
		while(cur != null && cur.getName() != null) {
			System.out.println("이름 : "+ cur.getName());
			System.out.println("국어 점수 : "+cur.getKor());
			System.out.println("수학 점수 : "+cur.getMath());
			System.out.println("영어 점수 : "+cur.getEng());
			System.out.println("총 점수 : "+cur.getTotal());
		    System.out.println("평균 점수 : "+cur.getAvg());
		    cur=cur.next;
		}
	}
	
	//평균 출력용
	public void allPrint(float avg) {
		cur=head;
		while(cur.getAvg()>=avg && cur!= null) {
			System.out.println("이름 : "+ cur.getName());
			System.out.println("국어 점수 : "+cur.getKor());
			System.out.println("수학 점수 : "+cur.getMath());
			System.out.println("영어 점수 : "+cur.getEng());
			System.out.println("총 점수 : "+cur.getTotal());
		    System.out.println("평균 점수 : "+cur.getAvg());
		    cur=cur.next;
		}
	}

	//이름 검색용
	public StudentScoreHasA2 get(String name) {
		cur=head;
		while(cur != null) {
			if(cur.getName().equals(name))
				break;
			cur = cur.next;			
		}
		return cur;
	}
	
	public StudentScoreHasA2 getPrev(String name) {
		StudentScoreHasA2 save = get(name);
		cur=head;
		while(cur != save) {
			cur=cur.next;		
		}
		return cur;
	}
	
	
	public StudentScoreHasA2 insertSort(int total) {
		cur=head;
		StudentScoreHasA2 save = cur;
		while(cur.getTotal()>=total) {
			save = cur;
			cur=cur.next;	
		}
		return save; 	
	}
	
	
	public void setSort(StudentScoreHasA2 setdata) {
		add(setdata.getName(),setdata.getKor(),setdata.getMath(),setdata.getEng());
		cur=head;
		StudentScoreHasA2 save = cur;
		while(cur != setdata && setdata!=head) {
			save=cur;
			cur=cur.next;
		}
		remove(save);
	}

	public static void main(String[] args) {
	
	}

}