/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Destructor;

/**
 *
 * @author zahid-bracu
 */
public class DestructorExample{  
  protected void finalize(){
      System.out.println("Object is being Destroyed");
  }
  
  public static void main(String [] args){
      DestructorExample object = new DestructorExample();
      object.finalize();
      object=null;
      System.gc();
  }
} 
