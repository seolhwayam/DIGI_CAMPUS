package Study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import Day5.StudentScoreHasA;

public class HashSetTest {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>(); //동적 배열 가능(붙어있음)
//		list.add("가");
//		list.add("나");
//		list.add("다");
//		
//		ArrayList<String> list2 = new ArrayList<String>();//동적 배열 가능(붙어있음)
//		list2.add("가");
//		list2.add("나");
//		
//		HashSet <String> set1 = new HashSet<String>(); //중복불가 
//		set1.add("가");
//		set1.add("나");
//		set1.add("가");
//		set1.add("다");
//		set1.add("라");
//		set1.add("마");
		
		HashSet <StudentScoreHasA> set2 = new HashSet<StudentScoreHasA>(); //중복불가 
		StudentScoreHasA student = new StudentScoreHasA();
		StudentScoreHasA student2 = new StudentScoreHasA();
		student.setName("김설화");
		student.setKor(50);
		student2.setName("김근미");
		student2.setKor(100);
		set2.add(student);
		set2.add(student2);
		System.out.println("set꺼내기 : ");
		
		Iterator<StudentScoreHasA> iter = set2.iterator();	// Iterator 사용
		boolean a = true;
		StudentScoreHasA aa = null;
		while(a==true) {//값이 있으면 true 없으면 false
			aa = iter.next();
			if(aa.getName().equals("김설화")) {
				System.out.println(aa.getName());
				aa.setKor(100);
				System.out.println(aa.getKor());
				a=false;
			}  
		}


		
//		LinkedList <String> linkedlist1 = new LinkedList<String>(); //주소참조/정렬
//		linkedlist1.add("가");
//		linkedlist1.add("나");
//		
//		System.out.print("ArrayList : ");
//		System.out.println(list);
//		System.out.print("ArrayList2 : ");
//		System.out.println(list2);
//		System.out.print("HashSet : ");
//		System.out.println(set1);
//		System.out.print("HashSet2 : ");
//		System.out.println(set2);
//		System.out.print("LinkedList : "); 
//		System.out.println(linkedlist1);
//		
//		set1.removeAll(set2);
//		System.out.println(set1);
//		System.out.println(set2);
//		
		
		
		
		
		
		
		
	}
}
