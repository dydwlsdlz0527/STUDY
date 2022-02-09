package mergeSortEx;

public class MergeSort {
	
	private static void mergesort(int[] arr, int left, int right) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			//����� �������� ���� �迭 ����
			mergesort(arr, left, mid);
			//����� �������� ���� �迭 ����
			mergesort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	//�պ�
	private static void merge(int[] arr, int left, int mid, int right) {
		//���� �迭�� ���� �ε���
		int i = left;
		//������ �迭�� ���� �ε���
		int j = mid+1;
		//���ĵ� �迭�� ���� �ε���
		int k = left;
		//���ĵ� �迭
		int[] sorted = new int[8];
		//���� ���ĵ� �迭 �պ�
		while(i<=mid&&j<=right) {
			if(arr[i]<=arr[j]) {
				sorted[k++] = arr[i++];
			}else {
				sorted[k++]	= arr[j++];
			}
		}
		//�迭�� �����ִ� �� ����
		if(i>mid) {
			for(int l=j;l<=right;l++) {
				sorted[k++] = arr[l];
			}
		//�迭�� �����ִ� �� ����
		}else {
			for(int l=i;l<=mid;l++) {
				sorted[k++] = arr[l];
			}
		}
		//������ �迭 sorted�� ����Ʈ�� ������ �迭�� ����
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
