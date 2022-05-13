package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Body implements Comparable<Body>{
	public int h,w;
	Body(int h, int w ){
		this.h=h;
		this.w=w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
		
	}
	
}
public class Ex23 {
	public int solution(ArrayList<Body> arr , int n) {
		int cnt=1;
		Collections.sort(arr);
		int max= arr.get(0).w;
		for(int i =1 ; i<n;i++) {
			if(arr.get(i).w>max) {
				cnt++;
				max=arr.get(i).w;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Ex23 t= new Ex23();
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		ArrayList<Body> arr =new ArrayList<Body>();
		for(int i =0;i<n;i++) {
			int h=sc.nextInt();
			int w= sc.nextInt();
			arr.add(new Body(h,w));
		}
		System.out.println(t.solution(arr, n));
	}

}
