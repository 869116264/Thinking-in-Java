package object;

public class CovariantReturn {
	public static void main(String[] args) {
		
		Mill m1 = new Mill();
		Grain p1 = m1.process();
		System.out.println(p1);//���ﶼ��������
		
		Mill m2 = new WheatMill();
		Grain p2 = m2.process();
		System.out.println(p2);
	}
}
class Grain {
	public String toString() {return "Grain";}
}
class Wheat extends Grain {
	public String toString() {return "Wheat";}
}
class Mill {
	public Grain process() {return new Grain();}
}
class WheatMill extends Mill {
	/*
	 * ������д��process����������ֵ��������Wheat��������и÷����ķ���ֵ�ǲ�һ����(����ķ���ֵ������Grain)������Wheat��Grain�ĵ�����Ҳ������
	 * 	������5.0֮��ֻҪ���ǵķ����ķ���ֵ�������ĵ�����Ϳ����ˣ��Ϳ���ʹ�ø����������ա�
	 * 	һ�仰�����ǵķ�������ֵ���Ͳ�һ��Ҫ������һ��(���䵼����Ҳ����)
	 */
	public Wheat process() {return new Wheat();}
}