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
public class MyDatabase {


    private String name;

    public MyDatabase() {
        
        // displayPersonDetails(getPersonDetails());
    }

    



    public void CreateTable(String name) {
        
        String filename = name;
        Table t1= new Table("table1");
        t1.insert(11, "tanver");
        
        Table t2= new Table("table2");
        t2.insert(12, "noman");
        
        
        List l= new ArrayList();
        l.add(t1);
        l.add(t2);
        
        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(l);
            out.close();
            System.out.println("Table created");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }


    public void DropDatabase(String name) {
        try{
    		
    		File file = new File(name);
        	
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    		
    	}
    }
    
   public static void displayPersonDetails(ArrayList<Table> a1) {
        for (Table t : a1) {
            System.out.println(
                    "id ->" + t.id
                    + " Firstname -> " + t.firstname
                    
            );
        }
    }

    public static ArrayList<Table> getPersonDetails() {

        String filename = "table.txt";

        ArrayList<Table> arrlist = new ArrayList<>();

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {

            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            arrlist = (ArrayList) in.readObject();
            in.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("ArrayList<PersonDetails> Size:" + arrlist.size());
        System.out.println();
        return arrlist;
    }

}
