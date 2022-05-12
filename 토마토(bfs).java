package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point2{
	public int x,y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Ex20 {
	static int board[][],dis[][];
	static int[] dx= {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int n,m;
	static Queue<Point2> q = new LinkedList<>();
	public void BFS() {
		while(!q.isEmpty()) {
			Point2 tmp=q.poll();
			for(int i =0;i<4;i++) {
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=0 &&nx<n &&ny>=0&& ny<m &&board[nx][ny]==0) {
					board[nx][ny]=1;
					q.offer(new Point2(nx,ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Ex20 t= new Ex20();
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n= sc.nextInt();
		board= new int[n][m];
		dis = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j =0; j<m;j++) {
				board[i][j]=sc.nextInt();
				if(board[i][j]==1) {
					q.offer(new Point2(i,j));
				}
			}
		}
		
		t.BFS();
		boolean flag= true;
		int answer=0;
		for(int i =0;i<n;i++) {
			for(int j =0; j<m;j++) {
			if(board[i][j]==0)flag =false;
			}
		}
		for(int i =0;i<n;i++) {
			for(int j =0; j<m;j++) {
			answer=Math.max(answer, dis[i][j]);
			}
		}
		System.out.println(answer);
	}

}
