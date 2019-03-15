package chap14;
/*
 * 람다식 예제 : jdk8 버전 추가
 * 
 * 람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface 여야 함.
 * FunctionalInterface : 추상메서드가 한개인 인터페이스를 말함.
 * 
 * @FunctionalInterface : 인터페이스에는 추상메서드가 한개임. 
 * 
 * 매개변수 없고, 리턴값도 없는 경우 예제.
 *
 * 매개변수 없음 :  () ->
 * 람다식 내부에 처리하는 구문이 한개인 경우 {} 생략 할 수 있다.
 */

@FunctionalInterface
interface FuntionalInterface1 {
	void method();
//	void method1();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//예전 방식으로 코딩
		FuntionalInterface1 f1 = new FuntionalInterface1() {
			@Override
			public void method() {
				System.out.println("인터페이스 객체");
			}
		};
		f1.method();
		//람다방식 1
		f1 = () -> {
			String str = "method call(1)";
			System.out.println(str);
		};
		f1.method();
		f1 = () -> 	System.out.println("method call(2)");
		f1.method();
		//람다 방식 2 : 매개변수로 사용되는 람다식
		execute(f1);
		execute(()->{System.out.println("method call(3)");});
		execute(()->System.out.println("method call(4)"));
	}
	static void execute(FuntionalInterface1 f) {
		f.method();
	}
}
