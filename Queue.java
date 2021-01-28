import Stack.Node;

/* Author: Liam Erickson
 * File: Queue.java
 * Date: May 28, 2020
 */

public class Queue<T> {

	private Node first = null; // top of stack
	private Node last = null;
	private int n = 0;

	class Node {
		T value;
		Node next;
	}

	public void enqueue(T value) {
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		if (last == null) {
			last = temp;
			first = temp;
		} else {
			last.next = temp;
			last = temp;
		}
		n++;
	}

	public T dequeue() {
		Node temp = first;
		first = temp.next;
		if (first == null)
			last = null;
		n--;
		return temp.value;
	}

	public T first() {
		return first.value;
	}

	public int count() {
		return n;
	}

	public boolean isEmpty() {
		return (first == null);
	}
	
	public String toString() {
		String s = "" + top.value;
		Node current = top.next;
		while (current != null) {
			s += ", " + current.value;
			current = current.next;
		}
		return s;
}
