package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {
		
		
		// 1 행, 열의 크기를 키보드로 받습니다
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요 : ");
		int row = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		
		// 2 행, 열 안에 각각의 위치에 값을 입력합니다
		for(int i=0; i<arr.length; i++)	{
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("arr[%d][%d]=",i,j);
				arr[i][j]=sc.nextInt();	
			}
		}
		
		int rowsum[] = new int[arr.length];
		//각행의 총합 출력
		for(int i=0; i<arr.length; i++)	{
			for(int j=0; j<arr[i].length; j++) {
				rowsum[i]+=arr[i][j];	
			}
		}
		
		// 3 0번 행의 값의 총합을 따로 출력합니다
		
				
		// 4 각 열의 값의 총합을 따로 출력합니다
		int colsum[] = new int[arr[0].length];
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length; i++) {
				colsum[j]+=arr[i][j];
			}
		}
		// 5 모든 값의 총합을 따로 출력합니다
		for(int i=0; i<rowsum.length;i++) {
			System.out.printf("%d 행의 총합 : %d\n", i, rowsum[i]);	
		}
		for(int i=0; i<colsum.length;i++) {
		System.out.printf("%d열의 총합 : %d\n", i, colsum[i]);
		}
	}
}
