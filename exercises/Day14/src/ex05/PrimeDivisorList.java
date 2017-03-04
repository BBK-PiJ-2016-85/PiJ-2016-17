package ex05;

public interface PrimeDivisorList {

    /**
    * @param Integer to be added to the list
	* adding null @throws a NullPointerException
	* adding a non-prime @throws an IllegalArgumentException
	*/

    void add(Integer i) throws NullPointerException, IllegalArgumentException;

    /**
     * Remove an item from the list
     * @param x The Integer to be removed from the list
     */
    Integer remove(Integer x);

    /**
     * @ return a fancy string based on the list
     *
     * [ 2 * 3^2 * 7 = 126 ]
     *
     * for for a list containing one 2, two 3, and one 7.
     *
	 */

    @Override
    String toString();
}
