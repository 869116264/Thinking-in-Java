package test;

import java.util.ArrayList;

public class ArrayListDisplay {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println(arrayList);
		// ������Ҳ��toString���������Ҹ�д��� ������ʹ�������ɵ�String����ܹ�������Լ���Ԫ��
	}
}
class InfiniteRecursion {
	public static void main(String[] args) {
		ArrayList<InfiniteRecursion> arrayList = new ArrayList<InfiniteRecursion>();
		arrayList.add(new InfiniteRecursion());
		System.out.println(arrayList.toString());
		/*
		 * ����ᱨ���ԭ���ǣ�
		 * 	�����е����д����ʱ�� "address" + this ;
		 * 	�ͻᷢ������ת��������������String����("address����һ��String����")�������һ��"+"�����Ǳ������ͳ��Խ�  this ת��ΪString����
		 * 	������ô��this ת��ΪString?�������ͳ��Ե���this��toString����--���ǵ���this.toString���ֻص���toString�����ˣ��ͷ����˵ݹ�
		 */
	}
	public String toString() {
		return "address" + this ;
//		return "address" + super.toString();
	}
	//���������ӡ�ڴ��ַ����Ӧ�õ���Obejct.toString()����,�����Ǹ����������ķ���(���������ָ��ӡ�ڴ��ַ)�����ԣ��㲻Ӧ��ʹ��this������Ӧ�õ���super.toString()����
}
