package practice;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		int sum = 0;
		
		for(int i = 1; i<=a; i++) {
			sum += i;
		}
		sc.close();
		
		System.out.println(sum);
	}

}