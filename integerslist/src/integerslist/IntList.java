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
	
	private class Knoop {
		int element;
		Knoop volgende; 
		Knoop(int element, Knoop volgende){
			this.element = element; 
			this.volgende = volgende;
		}
	}
	/*
	 * Kijkt na dat het aantal knopen in de gelinkte lijstj precies
	 * gelijk is aan 'lengte( en geeft de knopen terug in een array. 
	 * Deze methode moet je niet zelf kunnen toepassen. 
	 */
	private Knoop[] getKnopen() {
		Knoop[] result = new Knoop[lengte];
		Knoop k = eerste;
		for (int i = 0; i < lengte; i ++) {
			if (k == null)
				return null;
			result[i] = k;
			k = k.volgende;
		}
		if (k != null)
			return null;
		return result;
	}
	private int lengte;
	/**
	 * @invar | 0<= lengte 
	 * @invar | getKnopen()!=null
	 * @representationObject | getKnopen()
	 */
	private Knoop eerste;
	
	/**
	 * @post | result != null
	 * @creates | result 
	 */
	public int[] getElementen(){
		int[] result = new int[lengte];
		Knoop k = eerste;
		for (int i = 0; i < lengte; i ++) {
			result[i] = k.element;
			k = k.volgende;
		}
		return result;
	}
	
	/**
	 * post | result == getElementen().length
	 */
	public int getLengte(){
		return lengte;
	}
	/**
	 * @pre | 0 <= index && index < getLengte()
	 * @post | result == getElementen()[index]
	 */
	public int getElement(int index) {
		Knoop k = eerste;
		while (index > 0) {
			index--;
			k = k.volgende;
		}
		return k.element;
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
		if (lengte==0)
			eerste = new Knoop(element, null);
		else {
			Knoop k = eerste;
			while (k.volgende != null)
				k = k.volgende;
			k.volgende = new Knoop(element,null);
		}
		lengte++;
	}
	
	/**
	 * @pre | 0< getLengte()
	 * @mutates | this 
	 * @post| getLengte() == old(getLengte())-1
	 * @post| Arrays.equals(getElementen(),0, getLengte(),old(getElementen()),0, getLengte())
	 */
	public void removeLast() {
		if (lengte == 1)
			eerste = null;
		else {
			Knoop k = eerste;
			while (k.volgende.volgende != null)
				k = k.volgende;
			k.volgende = null;
		}
		lengte--;
	}
	
}
