package object3;

//���ָ��Holder3���Գ���ĳ���������ͣ���ô��Ҳ�ܳ��е�����
public class ObjectA {
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());//h3���е���Automobile����
		h3.set(new Automobile2());//Ҳ���Գ������ĵ�����Automobile2
	}
}
class Automobile2 extends Automobile {}
