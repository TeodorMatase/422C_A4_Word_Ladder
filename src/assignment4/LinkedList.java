/**
 * @author Teo Matase
 * @author Royce Li
 * List class used for Solution List
 */

package assignment4;

public class LinkedList {
	
	private class Node{
		public String word;
		public Node nextNode;
		public Node previousNode;
		
		public Node(String word, Node nextNode, Node previousNode){
			this.word = word;
			this.nextNode = nextNode;
			this.previousNode = previousNode;
		}
		
		public Node(String word){
			this.word = word;
			this.nextNode = null;
			this.previousNode = null;
		}
	}
	
	public Node startNode;
	public Node endNode;
	public int length;
	
    /* @param start The starting word in the word ladder.
    * @param end The ending word in the word ladder.
    * Creates a linkedList with the starting and ending word
    */
	public LinkedList(String start, String end){
		this.startNode = new Node(start);
		this.endNode = new Node(end);
		this.startNode.nextNode = this.endNode;
		this.endNode.previousNode = startNode;
		this.length = 2;
	}
	
    /* @param x Adds a 
    */
	public void add(String x){
		if(search(x) == false){
			Node temp = startNode;
			for(int i = 1; i < length - 1; i++){
				temp = temp.nextNode;
			}
			Node NewNode = new Node(x,temp.nextNode,temp);
			length++;
		}
	}
	
	//Removes a word from the list
	public void remove(String x){
		Node temp = startNode;
		while(temp != null){
			if(temp.word.equals(x)){
				Node nxt = temp.nextNode;
				Node prv = temp.previousNode;
				nxt.previousNode = prv;
				prv.nextNode = nxt;
				length--;
				return;
			}
			else{
				temp = temp.nextNode;
			}
		}
		
	}
	
	//Checks if word is in list
	public boolean search(String x){
		Node temp = startNode;
		while(temp != null){
			if(temp.word.equals(x)){
				return true;
			}
			else{
				temp = temp.nextNode;
			}
		}
		return false;
	}
	
	//Prints the List to console
	public void print(){
		System.out.println("**********\n");
		Node temp = startNode;
		while(temp != null){
			System.out.println(temp.word+" ");
			temp = temp.nextNode;
		}
		System.out.println("**********\n");
	}
	
}
