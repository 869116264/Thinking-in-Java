package object;

//��ʼ�����в����Ĺ�����
public class Chess extends BoardGame {

	public Chess(int i) {
		/*
		 * Ҫ��ʹ�ô��в����Ĺ��������뽫���� ͨ��super��������
		 */
		super(i);
		System.out.println("Chess���󴴽�" + "i=" + i);
	}
	
	public static void main(String[] args) {
		Chess chess = new Chess(12);//ָ�������������󣬷ֱ�������������в����Ĺ�����������������������Ӷ���һ���ⲿ����
	}

}
class Game {
	Game(int i) {
		System.out.println("Game���󴴽�" + "i=" + i);
	}
}
class BoardGame extends Game {

	BoardGame(int i) {
		super(i);//����Game���в����Ĺ�����
		System.out.println("BoardGame���󴴽�" + "i=" + i);
	}
	
}

