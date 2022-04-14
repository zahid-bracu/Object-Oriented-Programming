/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectInitialization;

/**
 *
 * @author zahid-bracu
 */
public class ReferenceVariable {
    int roll;
    String name;
    public void Test(){
        System.out.println("My name is "+name+" and my roll is "+roll);
    }
    
    public static void main(String [] args){
        ReferenceVariable myObject=new ReferenceVariable();
        myObject.roll=120;
        myObject.name="Zahid";
        myObject.Test();
    }
}
