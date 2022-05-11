package test;

import java.util.Scanner;

public class Ex11 {
	static String answer = "No";
	static int n, total = 0;
	boolean flag = false;
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if(sum>total/2)return;
		if(L==n) {
			if(total/2 ==sum) {
				answer="Yes";
				flag=true;
			}
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	public static void main(String[] args) {
		Ex11 t= new Ex11();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i= 0 ; i<n;i++) {
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
		t.DFS(0, 0, arr);
		System.out.println(answer);
	}

}
