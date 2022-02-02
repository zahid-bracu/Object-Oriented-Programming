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
public class MainClass {
    
    private String myName;
    private int myRoll;
    
    public void publicMethod(){
        System.out.println("This is Public Method");
    }
    
    private void privateMethod(){
        System.out.println("This is Public Method");
    }
    
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    
    public void setInfo(String myName, int myRoll){
        this.myName=myName;
        this.myRoll=myRoll;
    }
    
    
    public String getName(){
        return myName;
    }
    
    public int getRoll(){
        return myRoll;
    }
}
