package object;

//��DataOnly�Ĵ����ҳ���д��һ������Ȼ����룬����
public class DataOnly {
	int i;
	double d;
	boolean b;
	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		//�������ϰ��������ӡ����
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
	}
}
