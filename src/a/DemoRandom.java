package a;

import java.util.Arrays;

public class DemoRandom {
	public static void main(String[] args) {
        
        // �������󣬶�����Ϊhello
		DemoRandom hello = new DemoRandom();
       
       // ���÷�����������ֵ�����ڱ�����
		int[] nums = hello.getArray(8);
       
       // ������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(nums)); 
	}

	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	public int[] getArray(int length) {
       // ����ָ�����ȵ���������
		int[] nums = new int[length];
       
       // ѭ���������鸳ֵ
		for ( int i=0;i<8;i++ ) {
           
			// ����һ��100���ڵ������������ֵ�������ÿ����Ա
		nums[i]=(int)(Math.random() * 100);
       
		}
		return nums; // ���ظ�ֵ�������
	}
}
