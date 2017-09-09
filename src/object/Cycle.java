package object;

//����һ��Cycle�࣬�������������ࡣ��ʾÿһ��ʵ����������method()��������ת��
public class Cycle {
	public void method(Cycle c) {
		System.out.print("Cycle.method");
		System.out.println("���˲����������ǣ�" + c.getClass().getName());//������һ�д��룬�ȵ��������ֻ��Ǵ��˵����ͣ��ȵ������Ͳ�û������ת��?
	}
	public static void main(String[] args) {
		Unicycle unicycle = new Unicycle();
		unicycle.method(unicycle);//����������˵Ĳ�����Cycle���͵ģ�����ͬҲ���Խ������ĵ�����
		Bicycle bicycle = new Bicycle();
		bicycle.method(bicycle);
		Tricycle tricycle = new Tricycle();
		tricycle.method(tricycle);
	}
}
class Unicycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Unicycle.method");
		System.out.println("���˲����������ǣ�" + c.getClass().getName());
	}
}
class Bicycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Bicycle.method");
		System.out.println("���˲����������ǣ�" + c.getClass().getName());
	}
}
class Tricycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Tricycle.method");
		System.out.println("���˲����������ǣ�" + c.getClass().getName());
	}
}