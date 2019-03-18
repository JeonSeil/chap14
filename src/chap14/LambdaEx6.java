package chap14;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer FunctionInterface 예제
 *  => 매개변수가 있고, 리턴타입이 없는 추상 메서드를 멤버로 가지고 있는 인터페이스
 *  => accept 메서드
 *  Consumer<T> : 매개변수로 객체를 받는 accept 메서드를 가짐.
 *  BiConsumer<T,U> : 매개변수가 두개인 accept 메서드를 가짐
 *  DoubleConsumer : 매개변수가 double인 accept 메서드를 가짐
 *  ObjIntConsumer<T> :  매개변수가 Object와 int인 accept 메서드를 가짐
 */
public class LambdaEx6 {
	static Integer[] arr = {1,2,3,4,5};
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t + "8.0");
		c1.accept("Java");
		Consumer<Integer[]> c2 = t->{
			int sum = 0;
			for(int i : t) sum += i;
			System.out.println("배열의 합 :" + sum);
		};
		c2.accept(arr);
		BiConsumer<String,String> c3 = (t,u)->System.out.println(t+u);
		c3.accept("Java", "8.0");
		DoubleConsumer c4 = d->System.out.println("Java" + d);
		c4.accept(8);
		ObjIntConsumer<String> c5 = (t,i)->System.out.println(t+i);
		c5.accept("Java", 8);
	}
}
