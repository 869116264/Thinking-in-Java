package object;

public class EmptyFinal {
	
	private final Objc objc;//����ǿհ׵�final������������ʹ��ǰ������ɸ�ֵ��ֻ��һ�ַ���(�����ڹ������н��и�ֵ��ʼ��)
	
	public EmptyFinal(Objc objc) {
		this.objc = objc;//�ڹ������ж�final���и�ֵ
	}
	
	public static void main(String[] args) {
		EmptyFinal emptyFinal = new EmptyFinal(new Objc());//��new������ʱ�򴫵�һ�������ȥ����ɶ�final��ĳ�ʼ��
	}
	
}
