package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsFindCow {
	static int me, cow;
	static int count;
	static int[] arr = {1,-1, 5};
	static int[] num = new int[10001];
	Queue<Integer> q = new LinkedList<>();
	public int BFS(int loca , int cow) {
		q.offer(loca);
		num[loca]=1;
		int l =0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i =0; i<len;i++) {
				int x= q.poll();
				
				for(int j=0; j<arr.length;j++) {
					int nx = x +arr[j];
					if(nx==cow) {
					return l+1;
					}
					if(nx>=1 && nx<=10000 && num[nx]==0) {
						num[nx]=1;
						q.offer(nx);
					}
				}
			}
			l++;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		cow = sc.nextInt();
		BfsFindCow bf = new BfsFindCow();
	
		System.out.println(	bf.BFS(me,cow));
	}

}
