package insertionSortEx;

public class InsertionSort {
	
	private static void insertionsort(int[] arr, int n) {
		int key;
		//0 ��° �ε����� �̹� ���ĵ� ���·� ����, 1 ��° �ε������� �����Ѵ�.
		for(int i=1;i<n;i++) {
			//���Ե� ������ i��° �ε����� key������ �����Ѵ�.
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
