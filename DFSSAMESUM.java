package codingTest;


import java.util.Scanner;

public class DfsSameSum {
	static int n ,total=0;
	
	boolean flag = false;
	static String answer = "no";
	public void DFS(int l,int sum,int[] check) {
		if(flag)return;
		if(sum>total/2)return;
		if(l==n) {
			if((total-sum) == sum) {
				flag=true;
				answer="yes";
				
			}}else {
		
				DFS(l+1, sum+check[l],check);
				
				DFS(l+1 , sum,check);
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] check;
		check=new int[n];
		for(int i =0 ; i<n;i++) {
			int a=sc.nextInt();
			check[i]=a;
			total +=a;
		}
	
		DfsSameSum df= new DfsSameSum();
			df.DFS(0, 0,check);
		
		System.out.println(answer);
	}

}
