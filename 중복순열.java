package test;

import java.util.Scanner;

public class Ex14 {
	static int m,n;
	static int[] pm;
	public void DFS(int L) {
		if(L==m) {
			for(int  a : pm) {
				System.out.print(a+" ");
			}
				System.out.println();
		}else {
			for(int i = 1 ; i<=n;i++) {
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		Ex14 t= new Ex14();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		pm= new int[m];
		t.DFS(0);
		

	}

}
