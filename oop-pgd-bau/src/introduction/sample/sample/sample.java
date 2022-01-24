/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.sample.sample;

/**
 *
 * @author zahid-bracu
 */
import java.util.*;
public class sample {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your ID");
        int id=scan.nextInt();
        
        System.out.println("Enter your secret key");
        char xy=scan.next().charAt(0);
        
        System.out.println("Enter your name");
        String name=scan.nextLine();
        
        System.out.println("Enter your cgpa");
        float cgpa=scan.nextFloat();
        
        
        System.out.println("My name is "+name);
        System.out.println("My cgpa is "+cgpa);
        System.out.println("My id is "+id);
        System.out.println("My secret key is "+xy);
        
        
    }
    
}
