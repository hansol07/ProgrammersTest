package codingTest;

import java.util.Scanner;

public class DfsMaxScore {
	static int n,t,answer= Integer.MIN_VALUE;
	static int[][] gr ;
	public void DFS(int l,int score,int time) {
		if(time>t)return;
		if(l==n) {
			answer=Math.max(score, answer);
	
		}else {
			DFS(l+1,score+gr[l][0],time+gr[l][1]);
			DFS(l+1,score,time);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DfsMaxScore df= new DfsMaxScore();
		n=sc.nextInt();
		t=sc.nextInt();
		gr=new int[n+1][2];
		for(int i =0;i<n;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			gr[i][0]=a;
			gr[i][1]=b;
		}
		df.DFS(0, 0, 0);
		System.out.println(answer);
	}

}
