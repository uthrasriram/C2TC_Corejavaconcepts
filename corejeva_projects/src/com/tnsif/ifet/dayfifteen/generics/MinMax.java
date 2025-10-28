//Program to demonstrate generic interface
package com.tnsif.ifet.dayfifteen.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

