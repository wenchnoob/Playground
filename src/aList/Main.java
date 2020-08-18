package aList;

public class Main {

	public static void main(String[] args) {
		
		aNode a = new aNode(5);
		System.out.println(a);
		
		aLinkedList list = new aLinkedList(10);
		System.out.println(list);
		
		aLinkedList list1 = new aLinkedList(345, 12);
		System.out.println(list1);
		
		aLinkedList list2 = new aLinkedList(121, 12, 55);
		System.out.println(list2);
		
		aLinkedList list3 = new aLinkedList(100, 54, 1002);
		System.out.println(list3);

	}

}
