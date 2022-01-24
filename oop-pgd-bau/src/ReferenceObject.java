/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zahid-bracu
 */
public class ReferenceObject {
    String message="Dark & Evil time till ahead";
    int year=2022;
    
    public void Info(){
        System.out.println("My Message is in the year of  "+year+" "+message);
    }
    
    public static void main(String [] args){
        ReferenceObject myObj1=new ReferenceObject();
        ReferenceObject myObj2=myObj1; //refernce 
        myObj2.year=2011;
        myObj1.Info();
        
    }
}
