package object;

public class FinalAndStatic {

	private final Obj a = new Obj();//ʹ��final�ؼ��֣��ڶ��������ʱ����������и�ֵ����ֵ��Ͳ��ܸı�(��ָ���������ò��ܸı䣬�������ݿ��Ըı�)��ÿ������ӵ�ж�һ�޶���һ��
	
	private static final Obj b = new Obj();//���ж�����һ�ݣ���ɸ�ֵ���ܸı䣬ֻռһ���ڴ�
	
	public static void main(String[] args) {
		//������������
		FinalAndStatic fas1 = new FinalAndStatic();
		FinalAndStatic fas2 = new FinalAndStatic();
		//final��hashCode
		System.out.println(fas1.a.hashCode());
		System.out.println(fas2.a.hashCode());
		/*
		 * fianl+static��hashCode
		 * ������final�����������a��ֵ���ǲ�һ���ģ�ÿ�����󶼶���һ��
		 */
		System.out.println(fas1.b.hashCode());
		System.out.println(fas2.b.hashCode());
		/*
		 * final+static�����ж�����һ�ݣ�hashCode����һ����
		 */
	}
}
class Obj {
	
}