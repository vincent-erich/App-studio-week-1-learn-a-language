public class Iffy {
  private int anIntProp = 42;
  public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

  public void callSomeMethods() {
    // add statements here to exercise the other methods ...
    // Question 2.
    warnIfNegative(-1);
    warnIfNegative(0);
    warnIfNegative(1);
    // The problem with the method 'warnIfNegative' (before modification) is that
    // the print statement (the warning) is not inside the body of the if-statement. 
    // Therefore, the warning is always printed, regardless of the value of the
    // integer parameter.

    // Question 4.
    resetIfNegative();
    System.out.println(anIntProp);
    System.out.println();
    // The problem with the method 'resetIfNegative' (before modification) is that
    // the reset statement (anIntProp = 0) is not inside the body of the if-statement.
    // Therefore, 'anIntProp' is always set to zero, regardless of the value of 'anIntProp'.

    // Question 7.
    System.out.println(isInRange(5,10,1));
    System.out.println(isInRange(1,10,1));
    System.out.println(isInRange(10,10,1));
    System.out.println(isInRange(11,10,1));
    System.out.println(isInRange(0,10,1));
    System.out.println();

    // Question 8.
    System.out.println(isInRangeIfLess(5,10,1));
    System.out.println(isInRangeIfLess(1,10,1));
    System.out.println(isInRangeIfLess(10,10,1));
    System.out.println(isInRangeIfLess(11,10,1));
    System.out.println(isInRangeIfLess(0,10,1));
    System.out.println();

    // Question 9.
    System.out.println(isInRange(5,10,1));
    System.out.println(isInRange(1,10,1));
    System.out.println(isInRange(10,10,1));
    System.out.println(isInRange(11,10,1));
    System.out.println(isInRange(0,10,1));
    System.out.println(isInRange(0,1,10));
    System.out.println(isInRange(0,1,1));
    System.out.println();
  }

  /**
   * Print out a warning if the value is negative
   * otherwise don't do anything.
   */
  public void warnIfNegative(int theValue) {
    // Question 3.
    if (theValue < 0) {
      System.out.println("Caution - negative value given (" + theValue + ")");
    }
  }
  
  /**
   * Print out a warning if the value of anIntProp is negative
   * and also set the value to zero.
   * Otherwise don't do anything.
   */
  public void resetIfNegative() {
    // Question 5.
    if(anIntProp < 0) {
      System.out.println("Caution - negative value given (" + anIntProp + ")");
      anIntProp = 0;
    }
  }

  /**
   * return true if value is between upperBound and LowerBound
   * (or equal to either bound) otherwise return false.
   */
  public boolean isInRange(int value, int upperBound, int lowerBound) {
    // Question 6 + 9.
    if (upperBound <= lowerBound) {
      System.out.println("Caution - upper bound is less than or equal to lower bound");
      return false;
    }
    else if (value >= lowerBound && value <= upperBound) {
      return true;
    } 
    else {
      return false;
    }
  }

  public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
    // Question 8.
    return (value >= lowerBound && value <= upperBound);
  }

}
