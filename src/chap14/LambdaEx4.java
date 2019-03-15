package chap14;
/*
 * 매개변수 여러개, 리턴값도 존재
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
		System.out.println("두수의 곱:" + f4.method(10, 5));
		System.out.println("두수의 합:" + f4.method(10, 20));
		System.out.println("두수의 차:" + calc((x,y)->x-y,20,10));
		//calc 함수를 이용하기
		f4 = (x,y)->{
		//	return Math.max(x, y);
			return (x>y)?x:y;
		};
		System.out.println("두수 중 큰값 :" + calc(f4,20,10));
		System.out.println("두수 중 큰값 :" + calc((x,y)->(x>y)?x:y,20,10));
		System.out.println("두수 중 작은값 :" + calc((x,y)->Math.min(x, y),20,10));
		System.out.println("x/y의 몫 :" + calc((x,y)->x/y,20,10));
	}
	static int calc(FunctionalInterface4 f,int x,int y) {
		return f.method(x, y);
	}
}
