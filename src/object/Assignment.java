package object;

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
		//��ʱ��t1��t2��ָ����һ��������(����t2ԭ�����Ǹ�����t1ԭ��ָ�����Ǹ������û�����ã�����������������)
		t1 = t2;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
		//��ʱ��ı�t1��ֵ��t2��ֵҲ�������ı���
		t1.level = 3;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
	}

}
