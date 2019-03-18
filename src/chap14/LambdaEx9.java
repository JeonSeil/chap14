package chap14;

import java.util.function.IntBinaryOperator;

/*
 * Operator �������̽� 
 *  => Function�������̽��� ���� �������̽�
 *  => �Ű����� �ְ�, ���ϰ��� ����.
 *  
 *  IntBinaryOperator : int applyAsInt(int,int)
 */
public class LambdaEx9 {
	private static int[] score = {92,85,87};
	public static void main(String[] args) {
		System.out.println("�ִ밪:" + maxOrMin((a,b)->(a>=b)?a:b));//92
		System.out.println("�ּҰ�:" + maxOrMin((a,b)->(a<=b)?a:b));//85
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