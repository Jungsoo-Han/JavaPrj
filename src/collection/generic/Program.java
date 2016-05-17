package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import collection.generic.GCollection.Iterator;

public class Program {


	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("ok");
		list.add("hello");
		list.add("ok");
		
		
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for (String s : list) {
			System.out.println(s);
		}*/
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("--------<Set>----------");
		
		Set<String> sets = new HashSet<>();
		sets.add("hello");
		sets.add("ok");
		sets.add("hello");
		sets.add("ok");

		// ���� ���� ���� �������� ��ü�Ѵ�, �ߺ����� �ʴ� ���� �������� Set �� ����Ѵ�
		
		for (String s : sets) {
			System.out.println(s);
		}
		
		System.out.println("---------<Map>----------");
		
		Map<String, String> m = new HashMap<>();
		
		m.put("name", "ȫ�浿");
		m.put("address", "����� ������");
		m.put("name", "��浿");
		
		System.out.println(m.get("name"));
		
		
		// GCollection<Integer> list = new GCollection<Integer>();
		// GCollection list = new GCollection();
		
//		list.add(3);
//		list.add("23");
//		list.add(23.4);
//		list.add(new Exam());
//		list.get(1);
		
//		for (int i = 0; i < 300; i++) {
//			list.add(i+1);
//		}
//		
//		Thread th = new Thread(new Runnable() {
//			public void run() {
//				print(2, list);				
//			}
//		});
//		
//		
//		th.start();

		/*list.clear();
		while(list.hasNext()) {
			System.out.println(list.next());
		}*/
		
		// print(2, list);
		// print(1, list);
		
//		List<Integer> lis = new ArrayList<Integer>();
//		for (int i = 0; i < 100; i++) {
//			lis.add(i);
//		}
//		System.out.println(lis.indexOf(list));
		

	}

	/*private static void print(int key, GCollection list) {

		
		Iterator it = list.iterator();
		
		it.clear();
		
		while(it.hasNext()) {
			
			System.out.printf("key : %d, value : %d\n", key, it.next());
			
		}
		
	}*/

}
