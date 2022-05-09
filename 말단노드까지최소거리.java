package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 class Node3 {
	int data;
	Node3 rt,lt;
	public Node3(int val) {
		data=val;
		lt=rt=null;
	}
}
public class Ex6 {
	Node root;
	int[] ch ;
	
	public int BFS(Node root) {
	Queue<Node> q  = new LinkedList<>();
	q.offer(root);
	int L= 0 ;
	while (!q.isEmpty()) {
		int len = q.size();
		for(int i = 0 ; i<len;i++) {
			Node cur = q.poll();
			if(cur.lt== null &&cur.rt==null) {
				return L;
			}
			if(cur.lt!=null) {
				q.offer(cur.lt);
			}if(cur.rt!=null) {
				q.offer(cur.rt);
			}
		}
		L++;
	}
	return 0;
	}

	public static void main(String[] args) {
		Ex6 tree = new Ex6();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt= new Node(3);
		tree.root.lt.lt=new Node(4);
		tree.root.lt.rt=new Node(5);
		System.out.println(tree.BFS(tree.root));
	}

}
