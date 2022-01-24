/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zahid-bracu
 */
public class MethodExample {
    String name="Zahid";
    double cgpa=3.60;
    int roll=420;
    
    // custom method
    public void myInfo(){
        System.out.println("My Name : "+name+" & My Roll : "+roll+" , and my CGPA is : "+cgpa+" .");
        
    }
    
    //main method
    public static void main(String [] args){
       MethodExample myObj=new MethodExample();
       myObj.myInfo();
       myObj.cgpa=3.70;
       myObj.myInfo();
    }
}
