package mergeSortEx;

public class MergeSort {
	
	private static void mergesort(int[] arr, int left, int right) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			//가운데를 기준으로 앞쪽 배열 정렬
			mergesort(arr, left, mid);
			//가운데를 기준으로 뒤쪽 배열 정렬
			mergesort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	//합병
	private static void merge(int[] arr, int left, int mid, int right) {
		//왼쪽 배열에 대한 인덱스
		int i = left;
		//오른쪽 배열에 대한 인덱스
		int j = mid+1;
		//정렬될 배열에 대한 인덱스
		int k = left;
		//정렬될 배열
		int[] sorted = new int[8];
		//분할 정렬된 배열 합병
		while(i<=mid&&j<=right) {
			if(arr[i]<=arr[j]) {
				sorted[k++] = arr[i++];
			}else {
				sorted[k++]	= arr[j++];
			}
		}
		//배열에 남아있는 값 복사
		if(i>mid) {
			for(int l=j;l<=right;l++) {
				sorted[k++] = arr[l];
			}
		//배열에 남아있는 값 복사
		}else {
			for(int l=i;l<=mid;l++) {
				sorted[k++] = arr[l];
			}
		}
		//정렬할 배열 sorted의 리스트를 기존의 배열에 복사
		for(int l=left;l<=right;l++) {
			arr[l] = sorted[l];
		}
	}

	public static void main(String[] args) {
		int[] arr = {8, 1, 5, 4, 6, 3, 2, 7};
		mergesort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
