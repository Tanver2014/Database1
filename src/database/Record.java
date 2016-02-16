/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

/**
 *
 * @author 1410453
 */
public class Record {
     //
  // Fields
  //

  private int columnNumber;
  private int numberOfRow;
  
  //
  // Constructors
  //
  public Record () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of columnNumber
   * @param newVar the new value of columnNumber
   */
  private void setColumnNumber (int newVar) {
    columnNumber = newVar;
  }

  /**
   * Get the value of columnNumber
   * @return the value of columnNumber
   */
  private int getColumnNumber () {
    return columnNumber;
  }

  /**
   * Set the value of numberOfRow
   * @param newVar the new value of numberOfRow
   */
  private void setNumberOfRow (int newVar) {
    numberOfRow = newVar;
  }

  /**
   * Get the value of numberOfRow
   * @return the value of numberOfRow
   */
  private int getNumberOfRow () {
    return numberOfRow;
  }

  //
  // Other methods
  //

  /**
   * @param        number
   */
  public void setColumn(int number)
  {
  }


  /**
   */
  public void getColumn()
  {
  }


  /**
   * @param        number
   */
  public void setRow(int number)
  {
  }


  /**
   * @return       int
   */
  public int getRow()
  {
      return 0;
  }


}

