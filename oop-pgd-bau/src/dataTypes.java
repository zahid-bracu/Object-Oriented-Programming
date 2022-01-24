/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zahid-bracu
 */
import java.util.Scanner;
public class dataTypes {
    public static void main(String [] args){
        int roll=10;
        String name="Zahidur Rahman";
        double cgpa=3.60;
        
        Scanner pk=new Scanner(System.in);
        
        int myRoll;
        System.out.println("Please Enter Your Roll");
        myRoll=pk.nextInt();
        
        
        String myName;
        System.out.println("Please Enter Your Name");
        myName=pk.next();
        
        
        double myCgpa;
        System.out.println("Please Enter Your CGPA");
        myCgpa=pk.nextDouble();
        
        
        
        System.out.println("My Name is "+myName+" , my roll is "+myRoll+" , my CGPA is "+myCgpa);
        
    
    }
}
