package a;

import java.util.Arrays;

public class DemoPractise {
	// ��� main ����
	public static void main(String[] args) {
		DemoPractise hello = new DemoPractise();

		int[] sorts = hello.sort();
		System.out.println(Arrays.toString(sorts));

		
		
	}

	// ���巽����ɳɼ��������ǰ�����Ĺ���
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
