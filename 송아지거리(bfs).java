package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Ex5 {
	int[] time = {1,-1, 5};
	int[] ch ;
	Queue<Integer> q = new LinkedList<>();
	public int BFS(int s , int e) {
		ch = new int[10001];
		ch[s] = 1;
		q.offer(s);
		int L = 0;
		while(!q.isEmpty()) {
			int len =q.size();
			for(int i = 0 ; i<len;i++) {
				int x = q.poll();
				if(x==e) {
					return L;
				}
				for(int j = 0 ;j< time.length;j++) {
					int nx=x+time[j];
					if(nx>=1 && nx<=10000 && ch[nx]==0	) {
						ch[nx]=1;
						q.offer(nx);
					}
				}
				
			}
			L++;
		}
		return 0 ;
	}

	public static void main(String[] args) {
		Ex5 tree = new Ex5();
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int e = sc.nextInt();
		System.out.println(tree.BFS(s, e));
	}

}
