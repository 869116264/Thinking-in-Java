package object;

import object2.A1;

//�ڵڶ������д���һ��protected���ڲ��࣬ʵ�ָո��Ǹ��ӿ�
public class A2 {
	protected class A2Inner implements A1 {
		public A2Inner() {}
		public void method() {System.out.println("A2Inner.method");}
	}
	
}
