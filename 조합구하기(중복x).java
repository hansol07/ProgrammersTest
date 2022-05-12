package test;

import java.util.Scanner;

public class Ex17 {
	static int m,n;
	static int[] ch,pm;
	public void DFS(int L, int[] arr,int s) {
		if(L==m) {
			for(int x : pm) {
				System.out.print(x+ " ");
			}
			System.out.println();
		}else {
			for(int i = s ; i<n; i++) {
				if(ch[i]==1)continue;
				ch[i]=1;
				pm[L] = arr[i];
				DFS(L+1,arr,i+1);
				ch[i]=0;
				
			}
			
				
		}
	}
	public static void main(String[] args) {
		Ex17 t= new Ex17();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] arr= new int [n];
		ch= new int [n];
		pm= new int[m];
		for(int i =1; i<=n;i++) {
			arr[i-1]=i;
		}
		t.DFS(0, arr,0);
	}

}
