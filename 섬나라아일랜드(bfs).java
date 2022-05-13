package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Ex22 {
	static int[] dx= {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	Queue<Point> q = new LinkedList<>();
	static int n ;
	static int answer;
	public void BFS(int x, int y, int[][] board) {
		q.add(new Point(x,y));
		while(!q.isEmpty()) {
			Point pos = q.poll();
			for(int i = 0 ; i<8;i++) {
				int nx= pos.x+dx[i];
				int ny = pos.y+ dy[i];
				if(nx>=0 && nx<n && ny>=0 &&ny<n && board[nx][ny]==1) {
					board[nx][ny]=0;
					q.add(new Point(nx,ny));
				}
			}
		}
		
	}
	public  void solution(int[][] board) {
		for(int i =0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					answer++;
					board[i][j]=0;
					BFS(i,j,board);
				}
			}
		}
	}
	public static void main(String[] args) {
		Ex22 t= new Ex22();
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int[][] arr = new int [n][n];
		for(int i =0;i<n;i++) {
			for(int j =0; j<n;j++) {
				arr[i][j]=sc.nextInt();
			
			}
		}
		t.solution(arr);
		System.out.println(answer);

	}

}
