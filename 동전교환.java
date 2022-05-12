package test;

import java.util.Scanner;

public class Ex15 {
	static int n,m,total=Integer.MAX_VALUE;
	static int[] arr;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>m) return;
		if(sum==m) {
		total=Math.min(L, sum);
		}else {
			for(int i= 0 ; i<arr.length;i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
	}
	public static void main(String[] args) {
		Ex15 t= new Ex15();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		arr= new int [n];
		for(int i = 0 ; i<n;i++) {
			arr[i]= sc.nextInt();
		}
		m=sc.nextInt();
		t.DFS(0, 0, arr);
		System.out.println(total);
	}

}
