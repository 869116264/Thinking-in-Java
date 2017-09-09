package object;

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
//		op.f();//���ò���
	}
}
class WithFinals {
//	@Override//������һ��Overrideע��Ϳ��Խ���������⣬Override��Ϊ����Ҫ���ǻ���ķ������������Ϊĳ�����ر�������¶��壬��ô�������ͻ����һ������
	private final void f() {
		System.out.println("WithFinals.f()");
	}
	private void g() {
		System.out.println("WithFinals.g()");
	}
}
class OverridingPrivate extends WithFinals {
	//�����ǲ���һ���µķ����������Ǹ��ǻ���ķ���
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	//����Ҳ�ǣ�����һ���µķ�������������ԭ���ķ���
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}
class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}
