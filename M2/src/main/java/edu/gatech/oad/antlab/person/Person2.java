package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Sean Crowley
 * @version 1.1
 */
public class Person2 {

    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) { name = pname; }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        char[] charArr = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            charArr = randomIndex(charArr, input.charAt(i) ,(int)(Math.random()*100)%charArr.length);
        }

        String output = "";

        for(int i = 0; i < input.length(); i++){
            output = output + charArr[i];
        }
        return output;
	}

	private char[] randomIndex(char[] charArr, char character, int index){
        //recursion for the collisions
        index = index%charArr.length;

        if(charArr[index] == '\u0000'){
            charArr[index] = character;
            return charArr;
        }
        else{
            return randomIndex(charArr, character, index+1);
        }
    }

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
