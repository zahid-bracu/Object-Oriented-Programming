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
public class UsingContstuctor {
    int roll;
    String name;
    UsingContstuctor(int roll, String name){
        this.name=name;
        this.roll=roll;
    }
    public void getInfo(){
        System.out.println("My name is "+name+" and my roll is "+roll);
    }
    
    public static void main(String [] args){
        UsingContstuctor myObject=new UsingContstuctor(120,"Zahid");
        myObject.getInfo();
         
    }
}
