package a;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
	public static void main(String[] args) {
		List<String> lists = null;
		lists = new ArrayList<String>();
		lists.add("A");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}
}
