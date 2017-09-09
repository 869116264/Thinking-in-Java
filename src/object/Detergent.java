package object;

//�̳�
class Cleanser{
	
	private String s = "Cleanser";
	
	public void append(String a){
		s += a;
	}
	public void dilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);//Ĭ�ϵ���toString����
	}
}

public class Detergent extends Cleanser{

	//��д
	public void scrub() {
		append("Detergent.scrub()");
		super.scrub();//���ø����scrub����
	}
	//���һ���µķ���
	public void foam(){
		append("foam()");
	}
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);//����һ������Ĭ���ǵ�������toString����
		Cleanser.main(args);//������һ�����е�main����  
	}
	
}

//��Detergent���м̳в���һ���µ��ࡣ����scrub()�����һ����Ϊsterilize()���·���
class DetergentSon extends Detergent{
	
	//��дDetergent���scrub()����
	public void scrub() {
		System.out.println("DetergentSon.scrub");
	}
	//���һ���µķ���
	public void sterilize(){
		System.out.println("DetergentSon.sterilize");
	}
	
	public static void main(String[] args) {
		DetergentSon x = new DetergentSon(); 
		x.scrub();//��д�ķ���
		x.foam();//���ø���ķ���
		x.apply();//���ø�����ķ���
		x.sterilize();//���ø�����д�ķ���
	}
}
