package object;

import java.sql.Connection;

/*
 * �ͻ��˲���ֱ�Ӵ���Connection����ֻ��ͨ��ConnectionManager����һ��static��������ȡ���ǣ�
 *	��ConnectionManager����û�ж����ʱ�����ͻ᷵��һ��null
 */
public class ConnectionManager {
	
	private static Connection[] conn;
	
	private ConnectionManager(){
		conn = new Connection[2];
	}
	
	public static ConnectionManager createObject(){//���ø÷�������һ������������ĵ�����
		return new ConnectionManager();
	}
	
	public static Connection[] createConnection(){
		return conn;//
	}

	public static void main(String[] args) {
		Connection[] conn = ConnectionManager.createConnection();//����һ��Connection�������
		System.out.println(conn);//����û�е��ù��������г�ʼ�������Է��ص���һ��������
		//����static�����ڲ��Ĺ��췽�����г�ʼ��������ȵ���ʼ��
		ConnectionManager.createObject();
		Connection[] conn2 = ConnectionManager.createConnection();
		//��������ڲ��Ĺ�������ʼ���������������null
		System.out.println(conn2);
	}

}
