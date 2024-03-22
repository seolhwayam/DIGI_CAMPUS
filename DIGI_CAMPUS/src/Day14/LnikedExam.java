package Day14;


import Day5.StudentScoreHasA;

public class LnikedExam {
	static LinkNode head;
	static LinkNode cur;
	static LinkNode newNode;
	static LinkNode del;
	static int size =0;
	
	public LnikedExam(){
		head = cur = new LinkNode();
	}
	
	public void add(StudentScoreHasA student ,int i) {
		search(i);
		if(cur==head) {
			newNode = new LinkNode();
			newNode.next = head;
			head = newNode;
			newNode.setData(student);
			
		}else {
			newNode = new LinkNode();
			newNode.next = cur.next;
			cur.next=newNode;
			newNode.setData(student);
		}
		size++;
	}
	
	
	public void remove(int i) {
		search(i);
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
	}
	
	public void remove(LinkNode cur) {
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
		resetCur();
	}
	
	
	
	public int getSize() {
		return size;
	}

	public static void setSize(int size) {
		LnikedExam.size = size;
	}

	//이름 검색용
	public StudentScoreHasA get(String name) {
		cur=head;
		while(cur != null) {
			if(cur.getData().getName().equals(name))
				break;
			cur = cur.next;			
		}
		System.out.println(cur.getData().getName());
		return cur.getData();
	}
	
	//이름 검색 cur반환
	public LinkNode getNameCur(String name) {
		cur=head;
		while(cur != null) {
			if(cur.getData().getName().equals(name))
				break;
			cur = cur.next;			
		}
		System.out.println(cur.getData().getName());
		return cur;
	}
	
	//삽입 전 , 삭제 전 노드 찾기 검색
	public LinkNode search(int num) {
		cur=head;
		for(int i=0; i<num-2; i++) {
			if(num==1) {
				cur = head;
				break;
			}
			cur = cur.next;	
		}
		return cur;
	}
	
	public void print() {
		while(cur != null) {
			cur = cur.next;			
		}
	}
	
	public StudentScoreHasA get() {
		return cur.getData();
	}
	public void resetCur() {
		cur=head;
	}
	public void moveCur() {
		cur = cur.next;	
	}
	public static void main(String[] args) {
	
	}

}