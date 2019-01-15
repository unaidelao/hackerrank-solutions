/**
 * Java Inheritance 1.
 * 
 * Using inheritance, one class can acquire the properties of others.
 * 
 * This means that a Bird object has all the properties that an Animal object has, as well as some
 * additional unique properties.
 * 
 * You must add a sing method to the Bird class, then modify the main method accordingly so
 * that the code prints the following lines:
 *     I am walking
 *     I am flying
 *     I am singing
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {

   public static void main(String args[]) {

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	}
}