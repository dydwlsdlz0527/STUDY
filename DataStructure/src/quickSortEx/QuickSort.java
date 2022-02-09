package quickSortEx;

import java.io.*;
import java.util.StringTokenizer;

public class QuickSort {
	
	private static void quicksort(int[] arr, int left, int right) {
		if(left<right) {
			//q = �ǹ��� ��ġ
			//�ǹ��� �������� 2���� ����Ʈ�� �����Ѵ�.
			int q = partition(arr, left, right);
			//left���� �ǹ��� �ٷ� �ձ��� ��ȯ ȣ��
			quicksort(arr, left, q-1);
			//�ǹ��� �ٷ� �������� right���� ��ȯ ȣ��
			quicksort(arr, q+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot, temp;
		int low, high;
		//low�� left+1���� ���� ���
		low = left;
		//high�� right���� ���
		high = right+1;
		//�迭�� ù ��° ���� �ǹ����� ��´�.
		pivot = arr[left];
		do {
			do {
				//���� low�� ���� 1������Ų��.
				low++;
				//arr[low]�� �ǹ����� ������ ��� ����
			}while(low<=right&&arr[low]<pivot);
			do {
				//���� high�� ���� ���ҽ�Ų��.
				high--;
				//arr[high]�� �ǹ����� ũ�� ��� high ����
			}while(high>=left&&arr[high]>pivot);
			//low�� high�� �������� ������ arr[low]�� arr[high]�� ���� �ٲ��ش�.
			if(low<high) {
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		//low�� high�� �����ϸ� �ݺ� ����
		}while(low<high);
		//arr[left]�� arr[high]�� ���� �ٲ��ش�.
		temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		//�ǹ��� ��ġ high ��ȯ
		return high;
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//�Է��� ������ ����
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
