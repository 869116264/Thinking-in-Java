package object;

public class AutoboxingVarargs {
	
	public static void f(Integer... args){
		/*
		 * �������ʹ�õ���֤����õ�����һ������
		 */
		for (Integer i : args) {
			 System.out.println(i.getClass());
		}
	}
	
	public static void main(String[] args) {
		f(new Integer(1),new Integer(2));
		f(new Integer[]{1,5});//�����һ�����鴫��ȥ���������ᷢ�����Ѿ���һ�������ˣ����Բ���������ִ���κε�ת����  
		f(4,5);
		f(6,new Integer(7));
		f();//��0���������ݸ��ɱ�����б��ǿ��Եá�
		/*
		 * ������ɱ��������������ΪIntegerʱ���ǿ��Խ���������int����ȥ�����ǻὫint����ת��Integer
		 * 	�������һ��������԰����ǵ����б��ݣ���������Ѿ���һ�����飬�÷������԰����ǵ����ɱ�����б�������
		 * 	
		 */
	}

}
