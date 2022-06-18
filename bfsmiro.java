package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Po {
	public int x;
	public int y;
	Po(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class BfsMiro {
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	static int[][] board, dis;
	
	public void BFS(int x, int y) {
		Queue<Po> q = new LinkedList<>();
		q.offer(new Po(x,y));
		board[x][y]=1;
		while(!q.isEmpty()) {
			Po p = q.poll();
			for(int i =0;i<4;i++) {
				int nx=p.x+dx[i];
				int ny=p.y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
					board[nx][ny]=1;
					q.offer(new Po(nx,ny));
					dis[nx][ny]=dis[p.x][p.y]+1;
					System.out.println(dis[nx][ny]);
					System.out.println("q: "+q.size());
					
				}
			}
		}
	}
	public static void main(String[] args) {
		BfsMiro df= new BfsMiro();
		Scanner sc = new Scanner(System.in);
		board= new int[8][8];
		dis= new int[8][8];
		for(int i =1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		
		df.BFS(1,1);
		System.out.println(dis[7][7]);
	}

}
