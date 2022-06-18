package codingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsShortDistance {
	static int n,m;
		static ArrayList<ArrayList<Integer>> gr;
		static int[] arr, dis;
		public void BFS(int v) {
			Queue<Integer> q = new LinkedList<>();
			arr[v]=1;
			dis[v]=0;
			q.offer(v);
			int l =0;
			while(!q.isEmpty()) {
				int p = q.poll();
				for(int nv : gr.get(p)) {
					if(arr[nv]==0 ) {
						arr[nv]=1;
						q.offer(nv);
						dis[nv]=dis[p]+1;
					}
				}
			}
		}
	public static void main(String[] args) {
		BfsShortDistance bf = new BfsShortDistance();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		gr = new ArrayList<ArrayList<Integer>>();
		for(int i =0 ;i<=n ;i++) {
			gr.add(new ArrayList<Integer>());
		}
		arr= new int[n+1];
		dis = new int[n+1];
		for(int i = 0 ; i<m;i++) {
			int a =sc.nextInt();
			int b=sc.nextInt();
			gr.get(a).add(b);
		}
		bf.BFS(1);
		
		for(int i =2 ; i<=n;i++) {
			System.out.println(i+" : " +dis[i]);
		}
	}

}
