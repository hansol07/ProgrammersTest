package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Pointing{
	int x,y;
	Pointing(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class BfsIsland {
	static int n;
	static int[][] board;
	static int[] dx= {-1,-1,0,1,1,1,0,-1};
	static int[] dy= {0,1,1,1,0,-1,-1,-1};
	static int count = 0 ;
	public void BFS(int x, int y) {
			Queue<Pointing> q = new LinkedList<>();
			q.offer(new Pointing(x,y));
			while(!q.isEmpty()) {
				Pointing p = q.poll();
				for(int i=0;i<8;i++) {
					int nx = p.x+dx[i];
					int ny = p.y+dy[i];
					if(nx >=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
						board[nx][ny]=0;
						q.offer(new Pointing(nx,ny));
					}
				}
			}
	
	}
	public void Solution(int[][] board) {
		for(int i = 0 ; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					board[i][j]=0;
					count++;
					BFS(i,j);
			
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BfsIsland df= new BfsIsland();
		n=sc.nextInt();
		board= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j = 0 ; j<n;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		df.Solution(board);
		System.out.println(count);
	}

}
