package codingTest;

import java.util.Scanner;

public class DfsBadook {
static int n,c,answer= Integer.MIN_VALUE;
static int[] badook;
	public void DFS(int l , int sum) {
		if(sum>c)return;
		if(l==n) {
				answer=Math.max(answer,sum);
			
		
		}else {
			DFS(l+1,sum+badook[l]);
			DFS(l+1,sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		n=sc.nextInt();
		badook= new int[n];
		for(int i =0 ; i<n;i++) {
			int a=sc.nextInt();
			badook[i]=a;
		}
		DfsBadook df = new DfsBadook();
		df.DFS(0,0);
		System.out.println(answer);

	}

}
