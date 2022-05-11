package test;

import java.util.Scanner;

public class Ex12 {
	static int n, w ,total=Integer.MIN_VALUE;

	public void DFS(int L, int sum ,int[] arr) {
		if(sum>w)return;
		if(L==n) {
			total=Math.max(total, sum);
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		
		}
	}
	public static void main(String[] args) {
		Ex12 t= new Ex12();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		w=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		t.DFS(0, 0, arr);
		System.out.println(total);
	}

}
