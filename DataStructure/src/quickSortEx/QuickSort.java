package quickSortEx;

import java.io.*;
import java.util.StringTokenizer;

public class QuickSort {
	
	private static void quicksort(int[] arr, int left, int right) {
		if(left<right) {
			//q = 피벗의 위치
			//피벗을 기준으로 2개의 리스트로 분할한다.
			int q = partition(arr, left, right);
			//left에서 피벗의 바로 앞까지 순환 호출
			quicksort(arr, left, q-1);
			//피벗의 바로 다음부터 right까지 순환 호출
			quicksort(arr, q+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot, temp;
		int low, high;
		//low는 left+1에서 먼저 출발
		low = left;
		//high는 right에서 출발
		high = right+1;
		//배열의 첫 번째 값을 피벗으로 삼는다.
		pivot = arr[left];
		do {
			do {
				//먼저 low의 값을 1증가시킨다.
				low++;
				//arr[low]가 피벗보다 작으면 계속 증가
			}while(low<=right&&arr[low]<pivot);
			do {
				//먼저 high의 값을 감소시킨다.
				high--;
				//arr[high]가 피벗보다 크면 계속 high 감소
			}while(high>=left&&arr[high]>pivot);
			//low와 high가 교차하지 않으면 arr[low]와 arr[high]의 값을 바꿔준다.
			if(low<high) {
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		//low와 high가 교차하면 반복 종료
		}while(low<high);
		//arr[left]와 arr[high]의 값을 바꿔준다.
		temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		//피벗의 위치 high 반환
		return high;
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//입력할 숫자의 개수
		int n = 9;
		int[] arr = new int[n];
		try {
			String number = br.readLine();
			StringTokenizer st = new StringTokenizer(number);
			for(int i=0;i<arr.length;i++) {
				arr[i] = Integer.parseInt(st.nextToken()); 
			}
			quicksort(arr,0,n-1);
			for(int i=0;i<arr.length;i++) {
				bw.write(String.valueOf(arr[i]+" "));
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
