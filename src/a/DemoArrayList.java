package a;

import java.util.Arrays;

public class DemoArrayList {

	public static void main(String[] args) {
        
		// ����һ���ַ�������
		String[] hobbys = { "sports", "game", "movie" };
        
		// ʹ��Arrays���sort()�����������������
		Arrays.sort(hobbys);
        
		for (int i = 0; i < hobbys.length; i++) {
			// ʹ��Arrays���toString()����������ת��Ϊ�ַ��������
			System.out.println(hobbys[i]);
		}

	}
}
