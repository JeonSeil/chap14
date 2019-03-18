package test0318;
/*
2. 

 다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
 	A=	7	4	4			B = 0	0	0	9 
 		0	3	9				0	1	0	0				
 		1	1	1				0	0	0	0				
 		3	2	7				0	0	7	0			
 		5	0	3 				0	0	0	0				
 								3	0	0	0
 								0	0	0	0
(1) A배열의 0행  	7행	4열 의미
    B배열 생성
(2) A배열의 1행 ~ 끝 
    A배열 0열 : b배열의 행
    A배열 1열 : b배열의 열
    A배열 2열 : b배열의 해당열의 값
(3) B배열 출력 
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
