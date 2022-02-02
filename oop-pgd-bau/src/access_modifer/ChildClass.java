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
public class ChildClass extends MainClass {
    public void childClassMethod(){
        System.out.println("Child Class Method");
        publicMethod();
        protectedMethod();
    }
}
