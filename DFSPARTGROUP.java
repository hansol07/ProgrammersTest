package codingTest;

import java.util.Scanner;

public class DfsPartGroup {
	static int n;
	static int[] arr;
	public void DFS(int l) {
		if(l==n+1) {
		for(int i=1;i<=n;i++) {
			if(arr[i]==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		}else {
			arr[l]=1;
			DFS(l+1);
			arr[l]=0;
			DFS(l+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr= new int[n+1];
	
		DfsPartGroup gr = new DfsPartGroup();
		gr.DFS(1);
	}

}
