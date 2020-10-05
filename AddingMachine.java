package cse360assignment02;
/** 
 * this is the adding machine package
 * 
 * @author abid
 *
 */
public class AddingMachine {
  private int total;
  StringBuffer past;
  /** 
   * this makes total equal to zero
   * 
   * @author abid
   *
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    past = new StringBuffer("0");
  }
  /** 
   * this returns the total
   * 
   * @author abid
   *
   */
  public int getTotal () {
    return total;
  }
  /** 
   * this adds a value
   * @ param value
   * @author abid
   *
   */
  public void add (int value) {
	  total = total +value;
	  past.append(" + " + value);
  }
  /** 
   * this subtracts a value
   * @ param value
   * @author abid
   *
   */
  public void subtract (int value) {
	  total = total - value;
	  past.append(" - " +value); 
	  
  }
  /** 
   * this prints the history
   * 
   * @author abid
   *
   */
  public String toString () {
    return past.toString();
  }
  /** 
   * this clears the history
   * 
   * @author abid
   *
   */
  public void clear() {
	  for (int i=0;i<10;i++) {
		  past.append("a");
	  }
	  past.delete(0,past.length());
	  past.append("0");
  }
  
  
}