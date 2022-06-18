package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Poi{
	int x,y;
	Poi(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class BfsTomato {
	static int n,m;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	static int[][] board, dis;
	static Queue<Poi> q = new LinkedList<>();
	public void BFS() {
		while(!q.isEmpty()) {
			Poi p = q.poll();
			for(int i=0;i<4;i++) {
				int nx= p.x+dx[i];
				int ny =p.y+dy[i];
				if(nx>=0 && nx<=3 && ny>=0 && ny<=5 && board[nx][ny]==0) {
				board[nx][ny]=1;
				q.offer(new Poi(nx,ny));
				dis[nx][ny]= dis[p.x][p.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BfsTomato bf = new BfsTomato();
	n= sc.nextInt();
	m= sc.nextInt();
	board=new int[m][n];
	dis=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j= 0 ; j<n;j++) {
			int a=sc.nextInt();
			board[i][j]=a;
			if(board[i][j]==1) {
				q.offer(new Poi(i,j));
			}
		}
	}

	bf.BFS();	
	boolean flag =true;
	for(int i=0;i<m;i++) {
		for(int j= 0 ; j<n;j++) {
			if(board[i][j]==0)flag=false;
		}
	}
	int answer =0;
	if(flag) {
		for(int i=0;i<m;i++) {
			for(int j= 0 ; j<n;j++) {
				answer=Math.max(answer,dis[i][j]);
			}
		}
	}
	System.out.println(answer);

	}

}
