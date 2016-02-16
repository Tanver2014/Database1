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
public class ChildTable {
  //
    // Fields
    //

    private int primaryKey;
    private int foreignKey;

  //
    // Constructors
    //
    public ChildTable() {
    }

    ;
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of primaryKey
   * @param newVar the new value of primaryKey
   */
  private void setPrimaryKey(int newVar) {
        primaryKey = newVar;
    }

    /**
     * Get the value of primaryKey
     *
     * @return the value of primaryKey
     */
    private int getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Set the value of foreignKey
     *
     * @param newVar the new value of foreignKey
     */
    private void setForeignKey(int newVar) {
        foreignKey = newVar;
    }

    /**
     * Get the value of foreignKey
     *
     * @return the value of foreignKey
     */
    private int getForeignKey() {
        return foreignKey;
    }

  //
    // Other methods
    //
}
