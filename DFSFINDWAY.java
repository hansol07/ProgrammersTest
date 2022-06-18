package codingTest;

import java.util.Scanner;

public class DfsFindWay {
	static int n ,m, answer=0;
	static int[][] gr;
	static int[] arr;
	public void DFS(int v) {
		if(v==n) {
			answer++;
		}else {
			for(int i=1; i<=n;i++) {
				if(gr[v][i]==1&&arr[i]==0) {
					arr[i]=1;
					DFS(i);
					arr[i]=0;
						
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DfsFindWay df = new DfsFindWay();
		n=sc.nextInt();
		m=sc.nextInt();
		gr = new int[n+1][n+1];
		arr= new int[n+1];
		for(int i = 0 ; i<m;i++) {
			int a= sc.nextInt();
			int b=sc.nextInt();
			gr[a][b]=1;
		}
		arr[1]=1;
		df.DFS(1);
		System.out.println(answer);
	}

}
