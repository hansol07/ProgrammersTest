package test;


public class Ex3 {
static int n;
static int[] ch;
public void DFS(int L) {
	if(L==n+1) {
		String st="";
		for(int i = 1 ; i< ch.length;i++) {
			if(ch[i]==1) {
			st+= i;
			}
		}
		System.out.println(st);
	}else {
		ch[L]=1;
		DFS(L+1);
		ch[L]=0;
		DFS(L+1);
	}
	
}
	public static void main(String[] args) {
		Ex3 T = new Ex3();
		n=3;
		ch= new int[n+1];
		T.DFS(1);
	
	}

}
