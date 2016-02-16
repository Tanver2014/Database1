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
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDatabase m= new MyDatabase();
        
        m.CreateTable("table.txt");
        //m.DropDatabase("table.txt");
        Updatethetable up= new Updatethetable();
        up.updateTable("table.txt","table1", 0, "Rita");
    }
    
}
