import java.util.Scanner;

public class findOddEven {

	public static void main(String[] args) {
		int[] arr = {5,7,12,3,4,9,0};
		int left=0;
		int right = arr.length-1;
		while(left<right) {
			while(arr[left]%2 == 0)
				left++;
			while(arr[right]%2 !=0) 
				right--;
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}
