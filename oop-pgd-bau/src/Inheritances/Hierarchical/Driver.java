/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritances.Hierarchical;

/**
 *
 * @author zahid-bracu
 */
public class Driver {
    public static void main(String [] args){
        Parent objectParent=new Parent();
        objectParent.methodOne();
        
        ChildOne objectChildOne=new ChildOne();
        objectChildOne.methodOne();
        objectChildOne.methodTwo();
        
        
        ChildTwo objectChildTwo=new ChildTwo();
        objectChildTwo.methodOne();
        objectChildTwo.methodTwo();
    }
}
