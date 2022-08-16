/**
 * TestLinkedList class creates three different linked lists of integers, doubles, and strings.
 */
package main;
import linkedList.GenericNode;
import java.util.LinkedList;
import org.w3c.dom.Node;
import linkedList.GenericLinkedList;

public class TestLinkedList {

	public static <T> void main(String[] args) {
		
		GenericNode<T> tempnode;
		GenericLinkedList<T> myList=new GenericLinkedList<T>();
		
		GenericNode<T> aNode=new GenericNode<T>();
		aNode.setData((T) "Element 1");//couldn't figure out what to put here to print the list of objects
		myList.addNode(aNode);
		aNode = new GenericNode<T>();
		aNode.setData((T) "Element 2");//couldn't figure out what to put here to print the list of objects
		myList.addNode(aNode);
		
		tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		GenericNode<Integer> intList = new GenericNode<Integer>();
			intList.setData(1);
			intList.setData(2);
		GenericNode<Double> doubList = new GenericNode<Double>();
			doubList.setData(3.75);
			doubList.setData(11.259);
		GenericNode<String> strList = new GenericNode<String>();
			strList.setData("Mark");
			strList.setData("Sam");
		System.out.println(intList);
		System.out.println(doubList);
		System.out.println(strList);
		System.out.println();
	}//end main
	
}//end class