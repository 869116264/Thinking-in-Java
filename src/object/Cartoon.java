package object;

//��ʼ������
public class Cartoon extends Drawing{
	
	public Cartoon() {
		System.out.println("Cartoon���󴴽�");
	}
	
	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
		/*
		 * ������һ��Cartoon����ʱ�����ȴ���һ�����ĸ��࣬Ȼ��һ�������´���������Ӷ���
		 * 	�����ڵ����๹��������֮ǰ���Ѿ���ɳ�ʼ����
		 */
	}
	
}

class Art {
	Art(){
		System.out.println("Art���󴴽�");
	}
}
class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing���󴴽�");
	}
}
