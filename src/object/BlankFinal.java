package object;

public class BlankFinal {

	private final int i = 0;//��������Ķ��崦��ֵ
	private final int j;//�����Ȳ��ø�ֵ�����Ǳ���Ҫ��  ������  �н��и�ֵ
	
	public BlankFinal(int j) {
		this.j = j;//����Ͷ�final����ֵ
	}
	
	public static void main(String[] args) {
		BlankFinal blankFinal = new BlankFinal(1);//������ʹ��ǰ���и�ֵ���ṩ�˺ܴ�������
//		blankFinal.j = 1;//ͬ��Ҳ�ǲ��ɱ��
	}
	
}
