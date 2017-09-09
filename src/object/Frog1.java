package object;

public class Frog1 extends Amphibian1 {//2.Ѱ�Ҹ����Ƿ��л���(ͨ��extends�ؼ��ֿ���֪��)���������ƣ���󵽸�����
	private Charateristic p = new Charateristic("a3");
	private Description d = new Description("b3");
	public Frog1() {
		System.out.println("Frog1");
	}
	protected void dispose() {
		System.out.println("Frog1.dispose");
		d.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args) {//1.���ȼ���main����(һ��static����)
		//  6.ͬ���ķ���Frog1��ʵ����
		Frog1 frog1 = new Frog1();
		System.out.println("Bye!");
		frog1.dispose();
		/*
		 * 7. ����dispose����
		 * 	����պ���ǰ����෴����ִ�е������dispose������������ִ�е��������dispose������������Ľ��������Frog1��������в��ֶ��ǰ��մ����������������
		 */
	}
}
class Charateristic {
	private String s;
	public Charateristic(String s) {
		this.s = s;
		System.out.println("Charateristic������");
	}
	protected void dispose() {
		System.out.println("Charateristic.dispose");
	}
}
class Description {
	private String s;
	public Description(String s) {
		this.s = s;
		System.out.println("Description������");
	}
	protected void dispose() {
		System.out.println("Description.dispose");
	}
}
class LivingCreature {
	/*
	 * 3.�����Ǹ����࣬�����Ǵ�������Ķ����ȳ�ʼ����(��Ա����)��Charateristic��Description���󶼱�����(���ԵĹ�����������)��
	 *   ��Ա����ʵ������˳���ǰ������д��˳��Ȼ���ٵ���LivingCreature�Ĺ�������LivingCreature���󱻴������������ƣ�ͬ���ķ���������һ��������
	 * 	
	 */
	private Charateristic p = new Charateristic("a");
	private Description d = new Description("b");
	public LivingCreature() {
		System.out.println("LivingCreature������");
	}
	protected void dispose() {
		System.out.println("LivingCreature.dispose");
		d.dispose();
		p.dispose();
	}
}
class Animal extends LivingCreature {
	/*
	 * 4.�����Ѿ������˻���LivingCreature�Ķ��󣬾����˴����ö���������ˡ��ȳ�ʼ����Ա����(������������)����Ա��ʼ���꣬�����ö���
	 */
	private Charateristic p = new Charateristic("a1");
	private Description d = new Description("b1");
	public Animal() {
		System.out.println("Animal");
	}
	protected void dispose() {
		System.out.println("Animal.dispose");
		d.dispose();
		p.dispose();
		super.dispose();
	}
}
class Amphibian1 extends Animal {
	/*
	 * 5.ͬ���ķ��������ö���
	 */
	private Charateristic p = new Charateristic("a2");
	private Description d = new Description("b2");
	public Amphibian1() {
		System.out.println("Amphibian1");
	}
	protected void dispose() {
		System.out.println("Amphibian1.dispose");
		d.dispose();
		p.dispose();
		super.dispose();
	}
}
