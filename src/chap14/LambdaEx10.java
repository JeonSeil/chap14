package chap14;

import java.util.function.Predicate;
/*
 * Predicate �������̽� : ������ �ʿ��� ��� ��� 
 *    => �Ű������� ����. ����Ÿ���� boolean
 *    => test �޼���
 */
class Student3 {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student3(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	@Override
	public String toString() {
		return "name="+name+", eng="+eng+", math="+math+", major="+major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
	
}
public class LambdaEx10 {
	private static Student3[] list= {
			new Student3("ȫ�浿",55,60,"�İ�"),new Student3("�̸���",95,90,"�濵"),
			new Student3("���",75,80,"�ɸ�"),new Student3("�Ӳ���",65,70,"����"),
			new Student3("������",65,75,"�İ�")
	};
	public static void main(String[] args) {
		System.out.println("���� ������ 60�� �̻��� �л��� ���� ���:" 
                 	+ avgEng(t->t.getEng() >= 60)); 
		System.out.println("�İ��� �л��� ���� ���:"
                 	+ avgEng(t->t.getMajor().equals("�İ�"))); 
		System.out.println("���� ������ 80�̻��� �л��� ���� ���:"
             	+ avgEng(t->t.getMath() >= 80)); 
		System.out.println("�İ����� �ƴ� �л��� ���� ���:"
             	+ avgEng(t->!t.getMajor().equals("�İ�"))); 
	}
	private static double avgEng(Predicate<Student3> p) {
		int count=0,sum=0;
		for(Student3 s : list) {
			if(p.test(s)) {
				count++;
				sum += s.getEng();
				System.out.println(s);
			}
		}
		return (double)sum/count;
	}
}
