package object;
public class Beetle extends Insect {//�ڶ������鿴�Ƿ��л���(ͨ��extends�ؼ���)���еĻ����ػ���
	private int k = printInit("Beetle��ʵ������");//���߲���ʵ��������ʼ��
	public Beetle() {
		System.out.println("Beetle�Ĺ�����������");//�ڰ˲�����������ű�����
	}
	private static int x2 = printInit("Beetle��static����");//���岽���������static������ʼ��
	public static void main(String[] args) {//��һ��������main����(һ��static����������.class�ļ�)
		Beetle beetle = new Beetle();
	}
}
class Insect {//�����������ػ���
	public Insect() {
		System.out.println("Insect�Ĺ�����������");//������������Ĺ�����������(Ҫ�봴�������࣬����Ĺ�����һ���ᱻ����)
	}
	private static int x1 = printInit("Insect��static����");//���Ĳ��������static������ʼ��
	public static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
/*
 * �̳����ʼ��
 * 	��Beetle������javaʱ�������ĵ�һ��������ͼ����Beetle.main()(һ��stati����)���ҳ�Beetle��ı������(����ΪBeetle.class��)
 * 	������ע�⵽����һ������(������extends��֪)���Ի�����м���(������໹�л��࣬�������أ��Դ�����)
 * 	������������(���ϵ��Ǹ�����)�е�static��ʼ����Ȼ������һ�������࣬�Դ����ơ����ֻ��ƺ���Ҫ����Ϊ�������static��ʼ���������������static��
 * 	����Ϊֹ��������������ȫ��������ϣ�������Ա����������󴴽��Ĺ���:���ȣ������е����л������Ͷ��ᱻ��ΪĬ��ֵ���������ñ���Ϊnull��
 * 	���๹���������ã����๹�������֮�󣬵������ʵ����������ʼ��
 * 
 */
