/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1410453
 */
public class Table implements Serializable {
    //
    // Fields
    //

    private int tableid;
    private String name;
    public int id;
    public String firstname;

    //
    // Constructors
    //
    public Table(String name) {
        this.name = name;

    }

    ;   
    public void insert(Integer id, String firstname){
        this.firstname=firstname;
        this.id=id;
        System.out.println("record inserted");
    }
    public int getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    private String getName() {
        return name;
    }
    public void setName(String firstName){
        this.firstname=firstName;
    }

    public void selectTable(String name) {
        
    }

    public void deleteTable(String name) {
    }
    
    
   

}
