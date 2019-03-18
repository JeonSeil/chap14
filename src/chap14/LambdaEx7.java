package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 인터페이스 예제 
 *   => 매개변수값은 없고, 리턴값만 존재함.
 *   => getXXX() 메서드
 *   
 *   Supplier<T> : 리턴타입이 T인  get() 메서드를 가짐 
 *   IntSupplier : 리턴타입이 int인  getAsInt() 메서드를 가짐
 */
public class LambdaEx7 {
	public static void main(String[] args) {
		 Supplier<String> s1 = ()->"Java";
		 System.out.println(s1.get());
		 
		 IntSupplier s2 = ()->{
			 int num = (int)(Math.random() * 10) + 1;
			 return num;
		 };
		 System.out.println("1 부터 10사이의 임의의 수:" + s2.getAsInt());
		 // 
		 s2 = ()->{
			 int sum = 0;
			 for(int i=1;i <=100;i++) {
				 sum += i;
			 }
			 return sum;
		 };
		 System.out.println("1 부터 100까지의 합:" + s2.getAsInt());
		 
		 double[] arr = {1,2,5,5.6,10,20,30.5};
		 DoubleSupplier s3 = ()->{
			 double sum = 0;
			 for(double d : arr) {
				 sum += d;
			 }
			 return sum;
		 };
		 System.out.println("arr 배열의 요소들의 합:" + s3.getAsDouble());
	}
}
