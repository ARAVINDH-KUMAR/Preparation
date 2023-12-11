package practice;

import java.util.*;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int [] num = {3,4,5,2,3,1,4,5,3,4,3,1};
		findDuplicate(num);

	}
	
	static void findDuplicate(int [] num) {
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		int result [] = new int[num.length];
		for(int element : num) {
			if(!unique.add(element)) {
				duplicate.add(element);
			}
		}
		System.out.println("Using hashset -----------------------------------");
		System.out.println(duplicate);
		System.out.println("Using legacy flow -------------------------------");
		for(int i =0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					result[i] = num[i];
					num[j]= 00;
				}
			}
		}
		Arrays.sort(result);
		for(int element : result) {
			if(element != 00) {
				System.out.print(element + " ");
			}
		}
	}

}

