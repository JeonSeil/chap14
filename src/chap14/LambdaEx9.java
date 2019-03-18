package chap14;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스 
 *  => Function인터페이스의 하위 인터페이스
 *  => 매개변수 있고, 리턴값도 있음.
 *  
 *  IntBinaryOperator : int applyAsInt(int,int)
 */
public class LambdaEx9 {
	private static int[] score = {92,85,87};
	public static void main(String[] args) {
		System.out.println("최대값:" + maxOrMin((a,b)->(a>=b)?a:b));//92
		System.out.println("최소값:" + maxOrMin((a,b)->(a<=b)?a:b));//85
	}
	//op : (a,b)->(a<=b)?a:b)
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0]; //85
		for(int s:score) { //s : 87
			result = op.applyAsInt(result, s);
		}
		return result;
	}
}