package object;

public class Book {
	boolean checkedOut = false;
	public Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	//ÿ���鶼Ҫǩ��
	public void checkIn(){
		checkedOut = false;
		System.out.println("�鱻ǩ��");
	}
	//��������������ǰ�����������
	protected void finalize()  {
		//���û�б�ǩ�룬checkedOut��Ϊtrue����ʱ�򵱻��ոö����ʱ��ͻ�ִ������Ĵ���
		if (checkedOut) {
			System.out.println("��û�б�ǩ��");
		}
	}
	public boolean getCheckedOut(){
		return checkedOut;
	}
	public static void main(String[] args) {
		Book book = new Book(true);
		book.checkIn();//����ǩ��
		new Book(true);
		System.gc();//ǿ�ƽ����սᶯ��(����)��new�������黹û�б�ǩ��
		/*
		 * �������ս�������:���е�Book�����ڱ���������ǰ��Ӧ�ñ�ǩ�롣����main()�����У����ڳ���Ա�Ĵ�����һ����δ��ǩ�롣
		 * 	Ҫ��û��finalize()��������֤�ս������������ѷ�������ȱ�ݡ�
		 * ע��:System.gc()����ǿ�ƽ����սᶯ������ʹû����������ͨ���ظ���ִ�г���(������򽫷�������Ĵ洢�ռ�������������ն�����ִ�У������������ǵ��ڴ����˲Ž�����������)��
		 * 	����Ҳ�ὫBook�������(����Book����һ������û�б�ǩ��)
		 */
	}
}