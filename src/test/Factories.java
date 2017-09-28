package test;

public class Factories {
	public static void main(String[] args) {
		//���ù���ģʽ�����÷����Ϳ��Է���һ��������
		ServiceFactory factory = ServiceImpl.factory();
		Service service = factory.getService();
		service.method1();
		service.method2();
		//������һ��������������һ�ֶ���ʵ��
		ServiceFactory factory2 = ServiceImpl.factory();
		Service service2 = factory2.getService();
		service2.method1();
		service2.method2();
	}
}
//�ӿ�
interface Service {
	void method1();
	void method2();
}
//����һ������������getService�������Է���һ��ʵ��
interface ServiceFactory {
	Service getService();
}
class ServiceImpl implements Service {
	public void method1() {System.out.println("ServiceImpl.method1");}
	public void method2() {System.out.println("ServiceImpl.method2");}
	//��������������Ի��һ������
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service getService() {
				return new ServiceImpl();
			}
		};
	}
}
class ServiceImpl2 implements Service {
	public void method1() {System.out.println("ServiceImpl2.method1");}
	public void method2() {System.out.println("ServiceImpl2.method2");}
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service getService() {
				return new ServiceImpl2();
			}
		};
	}
}


