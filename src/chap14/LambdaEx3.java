package chap14;
/*
 * 매개변수가 있고, 리턴값이 없는 함수 객체 예제
 * 
 * 매개변수가 한개인 경우 () 생략 가능.
 * 실행 구문이 한개인 경우 {} 생략 가능
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
		//문제 : 매개변수값까지의 합을 출력하기. 
		//FunctionalInterface3 객체 사용하기
		f3 = x->{
			int sum = 0;
			for(int i=1;i<=x;i++) sum+=i;
			System.out.println(x + "까지의 합:" + sum);
		};
		f3.method(10);
		f3.method(100);
		
	}
}
