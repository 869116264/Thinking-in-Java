package object;

public class Amphibian extends Frog {
	
	//���������¶������Frog�е�methodA����
//	public void methodA(Frog f) {
//		System.out.println("Amphibian.methodA");
//	}
	
	public static void main(String[] args) {
		Amphibian amphibian = new Amphibian();
		amphibian.methodA(amphibian);
		/*
		 * Amphibian��Frog�ĵ����࣬Frog�ķ������ܵ���Frog���͵Ĳ���
		 * 	Amphibian�̳�Frog��ʹ��Frog�ķ�������ʵ�ʴ��˵Ĳ�����Amphibian���͵�,������û�б���
		 * 	AmphibianҲ��Frog���͵�һ�֣���������ת��
		 */
	}

}
class Frog {
	public void methodA(Frog f) {
		System.out.println("Frog.methodA");
	}
	public void methodB(Frog f) {
		System.out.println("Frog.methodB");
	}
}