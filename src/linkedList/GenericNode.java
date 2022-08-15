package linkedList;

import org.w3c.dom.Node;

/**
 * This class models a Node object which contains different objects. Each
 * node has its internal data (a T) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson
 * @author Michael Elder
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores which can be any type of object
	private Node nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public Node getNode() {
		return this.getNode();
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public Node getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class

