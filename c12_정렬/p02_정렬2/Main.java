package c12_정렬.p02_정렬2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int v : arr)
			sb.append(v).append("\n");
		
		System.out.println(sb);
		
	}

}
