package chap14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function �������̽�
 *   => �Ű������� �ְ�, ���ϰ��� ����.
 *   => applyXXX(...) �޼��带 ����
 *   
 *   
 *   Function<T,R> : R apply(T) 
 *   ToIntFunction<T>  : int applyAsInt(T)
 *   ToDoubleFunction<T>  : double applyAsDouble(T)
 */
class Student {
	private String name;
	private int eng;
	private int math;
	public Student (String name, int eng, int math ) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
}
public class LambdaEx8 {
	private static Student[] list = {
			new Student("ȫ�浿",80,90),new Student("���",85,90),
			new Student("�̸���",80,70),new Student("�Ӳ���",90,95)
	};
	public static void printString(Function<Student,String> f) {
		//t->t.getName()
		for(Student s : list) 
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	public static void printInt(Function<Student,Integer> f) {
		//t->t.getMath()
		for(Student s : list) 
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("�л��̸� : ");
//		printString(t->t.getName());
		printString(Student::getName); //���ٽ��� �޼��� �������
		System.out.print("���� ���� : ");
//		printInt(t->t.getEng());
		printInt(Student::getEng);
		System.out.print("���� ���� : ");
//		printInt(t->t.getMath());
		printInt(Student::getMath);
		System.out.print("�������� �հ�:");
		getTot(t->t.getEng());
		System.out.print("�������� �հ�:");
		getTot(t->t.getMath());
		System.out.printf("�������� ���: %.2f\n", getAvg(t->t.getEng()));
		System.out.printf("�������� ���: %.2f\n", getAvg(t->t.getMath()));
	}
	public static void getTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	public static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		return sum/list.length;
	}
}
