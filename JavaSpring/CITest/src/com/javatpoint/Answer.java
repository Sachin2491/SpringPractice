/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

/**
 *
 * @author Creative
 */
public class Answer {
    
private int id;  
private String name;  
private String by;  
  
public Answer() {}  
public Answer(int id, String name, String by) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.by = by;  
}  
  
public String toString(){  
    return id+" "+name+" "+by;  
}  
}
