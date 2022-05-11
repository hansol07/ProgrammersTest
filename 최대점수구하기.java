package test;

import java.util.Scanner;
	class Pro {
		int time;
		int score;
		public Pro( int score,int time) {
			this.time=time;
			this.score=score;
		}
	}
public class Ex13 {
	static int n,m , score=Integer.MIN_VALUE;
	public void DFS(int L,int sum,int time,Pro[] arr) {
		if(time>m)return;
		if(L==n) {
			score= Math.max(score,sum);
		}else {
			DFS(L+1,sum+arr[L].score,time+arr[L].time,arr);
			DFS(L+1,sum,time,arr);
		}
	}
	public static void main(String[] args) {
		Ex13 t= new Ex13();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		Pro[] arr = new Pro[n];
		for(int i =0; i<n;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			arr[i]= new Pro(a,b);
		}
		t.DFS(0, 0, 0, arr);
		System.out.println(score);
	}

}
