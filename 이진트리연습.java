package test;

 class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data=val;
		lt=rt=null;
	}
}
public class Ex2 {

	Node root;
	public void DFS(Node root) {
		if(root==null) return;
		else {
			  // 전위순회   System.out.print(root.data+ " ");
			DFS(root.lt);     
			System.out.print(root.data+ " ");// 중위순회
			DFS(root.rt);
			//후위순회   System.out.print(root.data+ " ");
		}
	}

	public static void main(String[] args) {
		Ex2 tree = new Ex2();
		tree.root= new Node(1);
		tree.root.lt= new Node(2);
		tree.root.rt= new Node(3);
		tree.root.lt.lt= new Node(4);
		tree.root.lt.rt= new Node(5);
		tree.root.rt.lt= new Node(6);
		tree.root.rt.rt= new Node(7);
		tree.DFS(tree.root);
	}

}
