package practice;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int index = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(index);
	}

}
