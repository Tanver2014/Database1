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
public class ParentTable {

  private int primaryKey;
  

  public ParentTable () { };
  
 
  private void setPrimaryKey (int newVar) {
    primaryKey = newVar;
  }


  private int getPrimaryKey () {
    return primaryKey;
  }

}


