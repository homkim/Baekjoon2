package c11_브루트포스.p04_체스판;

import java.util.Scanner;

public class Main {

	public static char[][] board;
	public static int min = 64;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,M;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		board = new char[N][M];
		String line = "";
		int i, j;
		for(i = 0; i < N; i++) {
			line = scanner.next();
		    for(j = 0; j < M; j ++) {
		    	board[i][j] = line.charAt(j);
		    }
		}
		for(i = 0; i < N - 7; i++) {
		    for(j = 0; j < M - 7; j ++) {
		    	calcMinPaint(i,j);
		    }
		}
		
		System.out.println(min);
	}

	private static void calcMinPaint(int x, int y) {
		// TODO Auto-generated method stub
		int x2 = x + 8, y2 = y + 8;
		int cnt = 0;
		
		char col = board[x][y];
		for (int i = x; i < x2; i++) {
			for (int j = y; j < y2; j++) {
				if( board[i][j] != col ) cnt++;

				if(col == 'W') col = 'B';
				else col = 'W';
			}
			if(col == 'W') col = 'B';
			else col = 'W';
		}
		
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
		
	}

}
