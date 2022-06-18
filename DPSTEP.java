package codingTest;

import java.util.Scanner;

public class DpStep {
	static int[] dy;
	static int n;
	public int solution(int n) {
		dy[1]=1;
		dy[2]=2;
		for(int i=3;i<=n;i++) {
			dy[i]= dy[i-2]+dy[i-1];
		}
		return dy[n];
	}
	public static void main(String[] args) {
		DpStep dp = new DpStep();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dy=new int[n+1];
		System.out.println(dp.solution(n));
	}

}
