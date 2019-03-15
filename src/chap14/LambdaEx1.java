package chap14;
/*
 * ���ٽ� ���� : jdk8 ���� �߰�
 * 
 * ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionalInterface ���� ��.
 * FunctionalInterface : �߻�޼��尡 �Ѱ��� �������̽��� ����.
 * 
 * @FunctionalInterface : �������̽����� �߻�޼��尡 �Ѱ���. 
 * 
 * �Ű����� ����, ���ϰ��� ���� ��� ����.
 *
 * �Ű����� ���� :  () ->
 * ���ٽ� ���ο� ó���ϴ� ������ �Ѱ��� ��� {} ���� �� �� �ִ�.
 */

@FunctionalInterface
interface FuntionalInterface1 {
	void method();
//	void method1();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//���� ������� �ڵ�
		FuntionalInterface1 f1 = new FuntionalInterface1() {
			@Override
			public void method() {
				System.out.println("�������̽� ��ü");
			}
		};
		f1.method();
		//���ٹ�� 1
		f1 = () -> {
			String str = "method call(1)";
			System.out.println(str);
		};
		f1.method();
		f1 = () -> 	System.out.println("method call(2)");
		f1.method();
		//���� ��� 2 : �Ű������� ���Ǵ� ���ٽ�
		execute(f1);
		execute(()->{System.out.println("method call(3)");});
		execute(()->System.out.println("method call(4)"));
	}
	static void execute(FuntionalInterface1 f) {
		f.method();
	}
}
