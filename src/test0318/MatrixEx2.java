package test0318;
/*
2. 

 ������ ��� ����� 2���� �迭�� ���� ������ ǥ���Ͻÿ�.
 	A=	7	4	4			B = 0	0	0	9 
 		0	3	9				0	1	0	0				
 		1	1	1				0	0	0	0				
 		3	2	7				0	0	7	0			
 		5	0	3 				0	0	0	0				
 								3	0	0	0
 								0	0	0	0
(1) A�迭�� 0��  	7��	4�� �ǹ�
    B�迭 ����
(2) A�迭�� 1�� ~ �� 
    A�迭 0�� : b�迭�� ��
    A�迭 1�� : b�迭�� ��
    A�迭 2�� : b�迭�� �ش翭�� ��
(3) B�迭 ��� 
 */
public class MatrixEx2 {
	public static void main(String[] args) {
		int[][] a = {{7,4,4},{0,3,9},{1,1,1},{3,2,7},
				{5,0,3}};
		int[][] b = new int[a[0][0]][a[0][1]];
		printArr(a);
		for (int i=1; i< a.length;i++) {
			b[a[i][0]][a[i][1]] = a[i][2];
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
	
}
