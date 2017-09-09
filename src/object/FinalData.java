package object;

import java.util.Arrays;
import java.util.Random;

class Val {
	int i;
	public Val(int i) {
		this.i = i;
	}
}

public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	public FinalData(String id) {
		this.id = id;
	}
	
	//��������+final һ����ɳ�ʼ���Ͳ��ܸı�ģ�ÿ��������һ�ݣ��ٶ�+static�����ж�����һ�ݲ��ɸı������
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	
	//final��final+static�����������У�final+static�Ļ�������ȫ�ô�д��ĸ����
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);//�������static
	
	//��������+final
	private Val v1 = new Val(11);
	private final Val v2 = new Val(2);
	private static final Val v3 = new Val(13);
	
	//��������+final��
	private final int[] a = {1,2,3,4,5,6};

	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5= " + INT_5;
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		
//		fd1.valueOne = 1;//final�����ֵ���ܱ��ı�
		fd1.v2.i = 1;//����fianl�����ֵ���Ա��ı�
		
//		fd1.v2 = new Val(7);//final+�������ͣ�һ����ʼ������ָ��ĳ��������ô�Ͳ��ܸı��������ָ������������
		fd1.v1 = new Val(6);//����final�ģ����ı�����ָ��
		
		for (int i : fd1.a) {
			fd1.a[i] = 1;//����Ԫ�ص����ݿ��Ըı�
//			fd1.a[i] = new Val(1);//���ǲ��ܸı�����Ԫ�ص�����ָ��
		}
		
		System.out.println(fd1);
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd2); 
		/*
		 * ��������Կ���
		 * 	final+��������: һ����ɳ�ʼ���Ͳ��ɸı䣬ÿ��������һ��
		 * 	final+static+�������ͣ����ɸı䣬ֻ��һ��(���ж�����һ��)
		 */
	}
}
