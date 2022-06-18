package codingTest;

import java.util.Scanner;

public class DfsPortion {
	static int n,m;
	static int[] combi;
	public void DFS(int l , int s) {
		if(l==m) {
			for(int x : combi) {
				System.out.print(x + " ");
				
			}
			System.out.println();
		}else {
			for(int i =s ; i<=n;i++) {
				combi[l]=i;
				DFS(l+1,i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi=new int[m];
		DfsPortion df = new DfsPortion();
		df.DFS(0, 1);
	}

}
