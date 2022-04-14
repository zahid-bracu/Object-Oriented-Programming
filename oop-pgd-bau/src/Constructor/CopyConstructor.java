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
public class CopyConstructor {
    String name;
    int roll;
    CopyConstructor(){
        System.out.println("This is Default");
    }
    CopyConstructor(CopyConstructor copyconstructor){
        this.name=copyconstructor.name;
        this.roll=copyconstructor.roll;
    }
    public void getInfo(){
        System.out.println("My name is "+name+"My Roll is "+roll);
    }
    
    public static void main(String [] args){
         CopyConstructor myObjectOne=new CopyConstructor();
         myObjectOne.name="Spooky";
         myObjectOne.roll=120;
         
         CopyConstructor myObjectTwo=new CopyConstructor(myObjectOne);
         myObjectTwo.getInfo();
    }
}
