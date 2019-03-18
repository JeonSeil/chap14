package test0318;
/*
1. 

다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
 	A=	0	0	0	9			B = 7	4	4
 		0	1	0	0				0	3	9			
 		0	0	0	0				1	1	1				
		0	0	7	0				3	2	7			
 		0	0	0	0				5	0	3				
		3	0	0	0
 		0	0	0	0
   (1) cnt = A행렬을 검색해서 0이아니값의 갯수 계산
       b배열 생성
       b =  new int[cnt+1][3]
   (2) A행렬의 행과 열의 계산한다.
       A행렬의 행의수 : a.length
       A행렬의 열의수 : a[0].length
       b[0][0] = a.length
       b[0][1] = a[0].length
       b[0][2] = cnt
   (3) a 행렬을 조회해서 0이 아닌값이 나오면 해당 행과 열을
       b 배열의 값으로 설정   
    
   (4) b배열을 출력    */
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
		//b배열의 값을 설정
		for (int i=0;i < a.length; i++) {
			for (int j=0; j < a[i].length; j++)
				if (a[i][j] > 0) {
					b[++indexb][0] = i; //행의값 설정
					b[indexb][1] = j;   //열의값 설정
					b[indexb][2] = a[i][j]; //값 설정
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
