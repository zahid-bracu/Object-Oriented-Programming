/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author zahid-bracu
 */
public class Constructor {
    int roll;
    String name;
    public Constructor(){
        System.out.println("This is Default Contstuctor");
    }
    public Constructor(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    public void getInfo(){
        System.out.println("My name "+name);
        System.out.println("My ID "+roll);
    }
    
    public static void main(String [] args){
        Constructor myObjectOne=new  Constructor();
        Constructor myObjectTwo=new  Constructor(120,"Zahid");
        myObjectTwo.getInfo();
         
    }
}
