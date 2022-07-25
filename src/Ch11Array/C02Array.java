package Ch11Array;

import java.util.Scanner;

public class C02Array {
	
	public static void main(String[] args) {
		
		// ---------------------------------------
		// 문제
		// ---------------------------------------
		// 1 배열의 크기를 입력받습니다
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		// 2 크기만큼 점수를 키보드로부터 입력받아 배열에 차례대로 저장합니다
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"]=");
			arr[i]=sc.nextInt();
		}
		
		// 3 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
		
		double evg = 0.0;
		int max=arr[0], min=arr[0], sum=0;
		
		//합구하기
		for(int i : arr)
		{
			sum += i; //누적
		}
		// 4 배열 안의 저장된 점수 중에 가장 큰 값과 가장 작은 값을 출력해봅니다
		//max,min 구하기
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]){
				max=arr[i];
			}
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ (double)(sum)/arr.length);
		System.out.println("최대 : "+ max + "최소 : "+ min);
		
		
		
	
		
				
		
		// ---------------------------------------
		// 문제
		// ---------------------------------------
//		int arr[] = {10,20,30,15,4};
//		sort(arr);
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
//	}
//	public static void sort(int[] ar) {
//		
//		//배열을 정렬합니다
//		//버블/선택/삽입//기수/병합/퀵.. 아무거나 정렬 로직 사용해봅시다
//		//선택 정렬 사용(왼쪽 요소부터 차례대로 정렬되는 방식)
//		for(int i=0; i<ar.length-1; i++) // 
//		{
//			for(int j=i+1; j<ar.length; j++)
//			{
//				if(ar[i]>ar[j])
//				{
//					int tmp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = tmp;
//				}
//			}
//		}
	}

}
