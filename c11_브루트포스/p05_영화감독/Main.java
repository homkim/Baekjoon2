package c11_브루트포스.p05_영화감독;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 666;
		int cnt = 0;
		
		while(cnt != N ) {
			if(check(start)) {
				cnt++;
			}
			start++;
		}
		System.out.println(start - 1);
	}

	private static boolean check(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(count!=3) {
			int a = n%10;
			if(a==6) count++;
			else count = 0;
			
			n/=10;
			if(n==0) break;
			
		}
		
		if(count==3) return true;
		else return false;
	}

}
