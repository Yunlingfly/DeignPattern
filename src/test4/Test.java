package test4;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MiXian mi=new ShuiMi();	//ˮ����
		System.out.println("�����ˮ���� "+" ��ǮΪ��"+mi.getPrice());
		Eggs egg=new Eggs(mi,1);
		System.out.println(egg.getName()+" ���ڵļ�ǮΪ��"+egg.getPrice());
		Tofu tofu=new Tofu(egg,1);
		System.out.println(tofu.getName()+" ���ڵļ�ǮΪ��"+tofu.getPrice());
	}

}
