package aList;

public class aLinkedList {
	
	int nodes;
	aNode node0;
	aNode node1;
	aNode node2;
	aNode node3;
	aNode node4;
	
	
	public void add(aNode nNode) {
		
	}
	public String toString() {
		if(nodes == 1) {
			return String.valueOf(node0);
		} else if(nodes == 2){
			return String.valueOf(node0) + ", " + String.valueOf(node1);
		} else if(nodes == 3) {
			return String.valueOf(node0) + ", " + String.valueOf(node1) + ", " + String.valueOf(node2);
		} else if(nodes == 4) {
			return String.valueOf(node0) + ", " + String.valueOf(node1) + ", " + String.valueOf(node2) + ", " +  String.valueOf(node3);
		} else {
			return String.valueOf(node0) + ", " + String.valueOf(node1) + ", " + String.valueOf(node2) + ", " + String.valueOf(node3) + ", " + String.valueOf(node4);
		}
		
	}
	
	public int getLength() {
		return nodes;
	}
	
	public aLinkedList (int a) {
		nodes = 1;
		node0 = new aNode(a);
	}
	public aLinkedList (int a, int b) {
		nodes = 2;
		node0 = new aNode(a);
		node1 = new aNode(b);
		
		node0.next = node1;
	}
	public aLinkedList (int a, int b, int c) {
		nodes = 3;
		node0 = new aNode(a);
		node1 = new aNode(b);
		node2 = new aNode(c);
	}
	public aLinkedList (int a, int b, int c, int d) {
		nodes = 4;
		node0 = new aNode(a);
		node1 = new aNode(b);
		node2 = new aNode(c);
		node3 = new aNode(d);
	}
	public aLinkedList (int a, int b, int c, int d, int e) {
		nodes = 5;
		node0 = new aNode(a);
		node1 = new aNode(b);
		node2 = new aNode(c);
		node3 = new aNode(d);
		node4 = new aNode(e);
	}
}
