package c12_정렬.p04_통계;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = -4000;
		int min = 4000;
		int median = 5000;
		int mode = 5000;
		
		for(int i = 0; i < N; i++) {
			int v = sc.nextInt();
			sum = sum + v;
			arr[v + 4000]++;
			
			if(v > max) max = v;
			if(v < min) min = v;
		}
		
		int count = 0;
		int mode_max = 0;
		boolean flag = false;
		
		for(int i = min + 4000;  i <= max + 4000; i++) {
			if(arr[i] > 0) {
				if( count < (N + 1)/2 ) {
					count += arr[i];
					median = i - 4000;
				}
				
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				}
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
			
		}
		System.out.println( (int)Math.round( (double)sum / N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);	
		
	}

}
