package object;

public class FinalArguments {

	public void with(final Gizmo g) {
		//�޷���ɸ�ֵ����Ϊ��������Ϊfinal��������÷�����ȡ��������Ϣ�����޷��ı����������
		//g = new Gizmo();
	}
	public void without(Gizmo g) {
		g = new Gizmo();//���Ըı��������Ϣ�����ı���������ö���
	}
	
	public void f(final int i) {
		//����ͬ���ǲ��ܸ��Ĳ������˵�ֵ��ֻ�������ȡ��������Ϣ
		//i = 1;
	}
	public void g(int i) {
		i = 1;//�������final������Ը��Ĳ�������i��ֵ 
	}
	
}
class Gizmo {
	public void spin() {}
}
