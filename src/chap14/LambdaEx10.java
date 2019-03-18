package chap14;

import java.util.function.Predicate;
/*
 * Predicate 인터페이스 : 조건이 필요한 경우 사용 
 *    => 매개변수가 존재. 리턴타입이 boolean
 *    => test 메서드
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
			new Student3("홍길동",55,60,"컴공"),new Student3("이몽룡",95,90,"경영"),
			new Student3("김삿갓",75,80,"심리"),new Student3("임꺽정",65,70,"전자"),
			new Student3("성춘향",65,75,"컴공")
	};
	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균:" 
                 	+ avgEng(t->t.getEng() >= 60)); 
		System.out.println("컴공과 학생의 영어 평균:"
                 	+ avgEng(t->t.getMajor().equals("컴공"))); 
		System.out.println("수학 점수가 80이상인 학생의 영어 평균:"
             	+ avgEng(t->t.getMath() >= 80)); 
		System.out.println("컴공과가 아닌 학생의 영어 평균:"
             	+ avgEng(t->!t.getMajor().equals("컴공"))); 
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
