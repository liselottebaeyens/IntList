/**
 * 
 */
package integerslist;

import java.util.Arrays;

/**
 * Elke instantie stelt een reeks int-waarden voor. 
 * 
 * 
 */
public class IntList {
	
	/**
	 * @post | result != null
	 * @creates | result 
	 */
	public int[] getElementen(){
		throw new RuntimeException("Not Yet Implemented");
	}
	
	/**
	 * post | result == getElementen().length
	 */
	public int getLengte(){
		throw new RuntimeException("Not Yet Implemented");
	}
	/**
	 * @pre | 0 <= index && index < getLengte()
	 * @post | result == getElementen()[index]
	 */
	public int getElement(int index) {
		throw new RuntimeException("Not Yet Implemented");
	}
	/**
	 * @post | getLengte() ==0
	 */
	public IntList() {
		throw new RuntimeException("Not Yet Implemented");
	}
	
	/**
	 * @mutates | this
	 * @post | getLengte()==old(getLengte()+1)
	 * @post | Arrays.equals(getElementen(),0,old(getLengte()),old(getElementen()),0,old(getLengte()))
	 * @post | getElement(old(getLengte()))==element 
	 */
	public void add(int element) {
		throw new RuntimeException("Not Yet Implemented");
	}
	
	/**
	 * @pre | 0< getLengte()
	 * @mutates | this 
	 * @post| getLengte() == old(getLengte())-1
	 * @post| Arrays.equals(getElementen(),0, getLengte(),old(getElementen()),0, getLengte())
	 */
	public void removeLast() {
		throw new RuntimeException("Not Yet Implemented"); 
	}
	
}
