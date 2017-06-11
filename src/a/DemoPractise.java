package a;

import java.util.Arrays;

public class DemoPractise {
	// 完成 main 方法
	public static void main(String[] args) {
		DemoPractise hello = new DemoPractise();

		int[] sorts = hello.sort();
		System.out.println(Arrays.toString(sorts));

		
		
	}

	// 定义方法完成成绩排序并输出前三名的功能
	@SuppressWarnings("null")
	public int[] sort() {
		int sorts[] = { 89, -23, 64, 91, 119, 52, 73 };
		Arrays.sort(sorts);
		int num = 0;
		int[] top = new int[3];
		int j = 0;
		for (int i = sorts.length - 1; i >= 0; i--) {
			if (!(100 < sorts[i] || sorts[i] < 0)) {
				top[j] = sorts[i];
				j++;
				num++;
				if (num > 2) {
					break;
				}
			}
		}

		return top;

	}
}
