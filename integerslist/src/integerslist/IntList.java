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
	 * @invar | elementen != null
	 * 
	 * @representationObject
	 */
	private int[] elementen;
	
	/**
	 * @post | result != null
	 * @creates | result 
	 */
	public int[] getElementen(){
		return elementen.clone();
	}
	
	/**
	 * post | result == getElementen().length
	 */
	public int getLengte(){
		return elementen.length;
	}
	/**
	 * @pre | 0 <= index && index < getLengte()
	 * @post | result == getElementen()[index]
	 */
	public int getElement(int index) {
		return elementen[index];
	}
	/**
	 * @post | getLengte() ==0
	 */
	public IntList() {
		elementen = new int[] {};
	}
	
	/**
	 * @mutates | this
	 * @post | getLengte()==old(getLengte()+1)
	 * @post | Arrays.equals(getElementen(),0,old(getLengte()),old(getElementen()),0,old(getLengte()))
	 * @post | getElement(old(getLengte()))==element 
	 */
	public void add(int element) {
		int[] newElementen = new int[elementen.length + 1];
		System.arraycopy(elementen, 0, newElementen, 0, elementen.length);
		newElementen[elementen.length]=element;
		elementen = newElementen;
	}
	
	/**
	 * @pre | 0< getLengte()
	 * @mutates | this 
	 * @post| getLengte() == old(getLengte())-1
	 * @post| Arrays.equals(getElementen(),0, getLengte(),old(getElementen()),0, getLengte())
	 */
	public void removeLast() {
		int [] newElementen = new int[elementen.length-1];
		System.arraycopy(elementen, 0, newElementen, 0, newElementen.length);
		elementen = newElementen;
	}
	
}
