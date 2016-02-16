/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1410453
 */
public class Updatethetable {

    public void updateTable(String databasename, String tableObject, Integer id, String firstname) {
        Table t1 = new Table(tableObject);
        File filename = new File(databasename);

        if (filename.exists()) {

            ArrayList<Table> al = new ArrayList<>();
            
           

            FileInputStream fis = null;
            ObjectInputStream in = null;
            try {

                fis = new FileInputStream(filename);
                in = new ObjectInputStream(fis);
                al = (ArrayList) in.readObject();
                in.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            if (al.contains(t1.id)) {
                //al.set(id, firstname);
//                FileOutputStream fos = null;
//                ObjectOutputStream out = null;
//                try {
//                    
//                    
//                    fos = new FileOutputStream(filename);
//                    out = new ObjectOutputStream(fos);
//                    out.writeObject(al);
//                    out.close();
//                    System.out.println("Table created");
//
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }

            } else {
                System.out.println("There are no information with this id");
            }

        } else {
            System.out.println("File does not exist");
        }

    }
}
