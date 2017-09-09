package object;

public class FieldAccess {
	public static void main(String[] args) {
		
		//����������ָ��һ�����������
		Super su = new Sub();
		System.out.println(su.field);//������û�ж�̬
		System.out.println(su.getField());//���ڷ����ʹ��ڶ�̬��
		
		Sub sup = new Sub();
		/*
		 * ��ʵ������sup���������������Ϊfield�����Լ�һ��������һ��(�ڴ���sup����ʱ���Ѿ�Ϊ�䴴���Ӷ���Super��ֻ����û�п���)
		 * 	������Sub�е�field�򲢲���Super�е�(��Sup���Լ���)��Ҫ��ȵ�Super�е�field�򣬱�����ʽ��ָ��super.field
		 */
		System.out.println(sup.field);
		System.out.println(sup.getField());
		System.out.println(sup.getSuperField());//�����ǵ��û������
		
	}
}
class Super {
	public int field = 0;
	public int getField() {
		return field;
	}
}
class Sub extends Super {
	public int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.field;//���û����field��
	}
}
