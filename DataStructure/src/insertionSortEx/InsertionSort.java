package insertionSortEx;

public class InsertionSort {
	
	private static void insertionsort(int[] arr, int n) {
		int key;
		//0 번째 인덱스는 이미 정렬된 상태로 보고, 1 번째 인덱스부터 시작한다.
		for(int i=1;i<n;i++) {
			//삽입될 숫자인 i번째 인덱스를 key변수에 대입한다.
			key = arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 1, 2, 7};
		int size = arr.length;
		insertionsort(arr,size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
