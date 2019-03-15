package chap14;
/*
 * �Ű������� �ְ�, ���ϰ��� ���� �Լ� ��ü ����
 * 
 * �Ű������� �Ѱ��� ��� () ���� ����.
 * ���� ������ �Ѱ��� ��� {} ���� ����
 */
interface FunctionalInterface3 {
	void method(int x);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		FunctionalInterface3 f3;
		f3 = (x)->{
			System.out.println(x*x);
		};
		f3.method(3);
		f3 = x->System.out.println(x+x);
		f3.method(3);
		//���� : �Ű������������� ���� ����ϱ�. 
		//FunctionalInterface3 ��ü ����ϱ�
		f3 = x->{
			int sum = 0;
			for(int i=1;i<=x;i++) sum+=i;
			System.out.println(x + "������ ��:" + sum);
		};
		f3.method(10);
		f3.method(100);
		
	}
}
