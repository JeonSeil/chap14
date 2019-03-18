package test0318;
/*
1. 

������ ��� ����� 2���� �迭�� ���� ������ ǥ���Ͻÿ�.
 	A=	0	0	0	9			B = 7	4	4
 		0	1	0	0				0	3	9			
 		0	0	0	0				1	1	1				
		0	0	7	0				3	2	7			
 		0	0	0	0				5	0	3				
		3	0	0	0
 		0	0	0	0
   (1) cnt = A����� �˻��ؼ� 0�̾ƴϰ��� ���� ���
       b�迭 ����
       b =  new int[cnt+1][3]
   (2) A����� ��� ���� ����Ѵ�.
       A����� ���Ǽ� : a.length
       A����� ���Ǽ� : a[0].length
       b[0][0] = a.length
       b[0][1] = a[0].length
       b[0][2] = cnt
   (3) a ����� ��ȸ�ؼ� 0�� �ƴѰ��� ������ �ش� ��� ����
       b �迭�� ������ ����   
    
   (4) b�迭�� ���    */
public class MatrixEx1 {
	public static void main(String[] args) {
		int[][] a = {{0,0,0,9},{0,1,0,0},{0,0,0,0},
				{0,0,7,0},{0,0,0,0},{3,0,0,0},
				{0,0,0,0},{0,0,1,0},};
		printArr(a);
		int cnt = valueCnt(a);
		int[][] b = new int[cnt + 1][3];
		b[0][0] = a.length;  
		b[0][1] = a[0].length;
		b[0][2] = cnt;       
		int indexb = 0;
		//b�迭�� ���� ����
		for (int i=0;i < a.length; i++) {
			for (int j=0; j < a[i].length; j++)
				if (a[i][j] > 0) {
					b[++indexb][0] = i; //���ǰ� ����
					b[indexb][1] = j;   //���ǰ� ����
					b[indexb][2] = a[i][j]; //�� ����
				}
		}
		printArr(b);
	}
	public static void  printArr(int[][] a) {
		for (int i=0;i < a.length; i++) {
			for (int j=0; j < a[i].length; j++)
				System.out.printf("%3d ",a[i][j]);
			System.out.println();
		}
		System.out.println();
		System.out.println();		
	}
	public static int valueCnt(int[][] a) {
		int cnt = 0;
		for (int i=0; i< a.length; i++)
			for (int j=0; j< a[i].length; j++)
				if (a[i][j] > 0) cnt++;
		return cnt;
	}
}
