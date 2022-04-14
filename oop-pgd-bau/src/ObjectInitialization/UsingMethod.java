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
public class UsingMethod {
    int roll;
    String name;
    public void setInfo(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    public void getInfo(){
        System.out.println("My name is "+name+" and my roll is "+roll);
    }
    
    public static void main(String [] args){
        UsingMethod myObject=new UsingMethod();
        myObject.setInfo(120, "Zahid");
        myObject.getInfo();
         
    }
}
