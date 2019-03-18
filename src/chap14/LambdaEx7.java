package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier �������̽� ���� 
 *   => �Ű��������� ����, ���ϰ��� ������.
 *   => getXXX() �޼���
 *   
 *   Supplier<T> : ����Ÿ���� T��  get() �޼��带 ���� 
 *   IntSupplier : ����Ÿ���� int��  getAsInt() �޼��带 ����
 */
public class LambdaEx7 {
	public static void main(String[] args) {
		 Supplier<String> s1 = ()->"Java";
		 System.out.println(s1.get());
		 
		 IntSupplier s2 = ()->{
			 int num = (int)(Math.random() * 10) + 1;
			 return num;
		 };
		 System.out.println("1 ���� 10������ ������ ��:" + s2.getAsInt());
		 // 
		 s2 = ()->{
			 int sum = 0;
			 for(int i=1;i <=100;i++) {
				 sum += i;
			 }
			 return sum;
		 };
		 System.out.println("1 ���� 100������ ��:" + s2.getAsInt());
		 
		 double[] arr = {1,2,5,5.6,10,20,30.5};
		 DoubleSupplier s3 = ()->{
			 double sum = 0;
			 for(double d : arr) {
				 sum += d;
			 }
			 return sum;
		 };
		 System.out.println("arr �迭�� ��ҵ��� ��:" + s3.getAsDouble());
	}
}
