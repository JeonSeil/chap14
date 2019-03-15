package chap14;
/*
 * Runnable 인터페이스 구현 객체를 람다식으로 표현하기.
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		Runnable r = ()->{
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("1.1부터100까지의 합:" + sum);
		};
		Thread t = new Thread(r);
		t.start();

		Thread t2 = new Thread(()->  {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("2.1부터100까지의 합:" + sum);
		});
		t2.start();
		System.out.println("main 메서드 종료");
	}
}
