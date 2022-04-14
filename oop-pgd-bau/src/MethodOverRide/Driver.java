/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverRide;

/**
 *
 * @author zahid-bracu
 */
public class Driver {
    public static void main(String [] args){
        Parent ObjectP=new Parent();
        Child ObjectC=new Child();
        ObjectP.ShowInfo();
        ObjectC.ShowInfo();
        ObjectC.CheckInfo();
        ObjectC.CheckInfo("My Name");
        
 
    }
}
