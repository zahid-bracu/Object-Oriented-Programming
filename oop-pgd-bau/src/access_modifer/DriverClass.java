/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_modifer;

/**
 *
 * @author zahid-bracu
 */
public class DriverClass {
    public static void main(String [] args){
        MainClass object=new MainClass();
        object.publicMethod();
        object.protectedMethod();
        object.setInfo("Zahid", 15101122);
        String Name=object.getName();
        int Roll=object.getRoll();
        System.out.println("My Name is "+Name+" And My Roll is "+Roll);
 
        ChildClass objectTwo=new ChildClass();
        objectTwo.childClassMethod();
    }
}
