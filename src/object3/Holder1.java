package object3;

public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) {this.a = a;}
	public Automobile get() {return this.a;}
	//�������������Ժܲ���޷������������͵��κζ����������ҪΪÿһ�����ʹ���һ����������
}
class Holder2 {
	private Object o;
	public Holder2(Object o) {this.o = o;}
	public Object get() {return this.o;}
	public void set(Object o) {this.o = o;}
	public static void main(String[] args) {
		Holder2 h2 = new Holder2(new Integer("1"));
		h2.get();
		h2.set(new Automobile());
		Automobile a = (Automobile)h2.get();
	}
	//����Holder2���Դ洢�κ����͵Ķ�����
}
class Automobile {}
/*
 * ��ʱ������ϣ���������Դ洢�������͵Ķ��󡣵��ǣ�ͨ������£�����ֻ��洢һ������ �Ķ������Ǹ�ϲ����ʱ��ָ�����ͣ������Ժ��ھ���ʹ��ʲô���͵Ĳ���
 * �ü��������ţ����������ĺ��档Ȼ����ʹ��������ʱ������ʵ�ʵ������滻�����Ͳ�����
 */
class Holder3<T> {
	private T a;
	public Holder3(T a) {this.a = a;}
	public T get() {return a;}
	public void set(T a) {this.a = a;}
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();//�Զ���ת��Ϊ��ȷ������
//		h3.set("a");
		/*
		 * ���㴴��Holder3ʱ������ָ������ʲô���͵Ķ��󣬽������ڼ������ڡ�Ȼ����ֻ����Holder3�д�Ÿ�����(���������࣬��̬�뷺�Ͳ���ͻ)
		 * 	���ң���Hodler3��ȡ�������еĶ���ʱ���Զ��ؾ�����ȷ��������
		 * ��java���͵ĺ��ĸ���:���߱�������ʹ��ʲô���ͣ����������㴦��һ��ϸ�ڡ�
		 */
	}
}
