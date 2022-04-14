/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritances.Single;

/**
 *
 * @author zahid-bracu
 */
public class Driver {
    public static void main(String [] args){
        Parent objectParent=new Parent();
        objectParent.methodOne();
        
        Child objectChild=new Child();
        objectChild.methodOne();
        objectChild.methodTwo();
        objectChild.methodThree();
        
        
        Parent objectChildParent=new Child();
        objectChildParent.methodOne();
        objectChildParent.methodTwo();
        objectChildParent.methodThree();
    }
}
