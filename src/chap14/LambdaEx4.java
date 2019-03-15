package chap14;
/*
 * �Ű����� ������, ���ϰ��� ����
 */
interface FunctionalInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		FunctionalInterface4 f4 = (x,y) -> {
			return x*y;
		};
		f4 = (x,y)->x+y;
		System.out.println("�μ��� ��:" + f4.method(10, 5));
		System.out.println("�μ��� ��:" + f4.method(10, 20));
		System.out.println("�μ��� ��:" + calc((x,y)->x-y,20,10));
		//calc �Լ��� �̿��ϱ�
		f4 = (x,y)->{
		//	return Math.max(x, y);
			return (x>y)?x:y;
		};
		System.out.println("�μ� �� ū�� :" + calc(f4,20,10));
		System.out.println("�μ� �� ū�� :" + calc((x,y)->(x>y)?x:y,20,10));
		System.out.println("�μ� �� ������ :" + calc((x,y)->Math.min(x, y),20,10));
		System.out.println("x/y�� �� :" + calc((x,y)->x/y,20,10));
	}
	static int calc(FunctionalInterface4 f,int x,int y) {
		return f.method(x, y);
	}
}
