/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zahid-bracu
 */
public class Constructors {
    Constructors(){
        System.out.println("Default Constructors");
    }
    
    Constructors(int number){
        System.out.println("My Parameterized Constructor value : "+number);
    }
    
    public static void main(String [] args){
        Constructors object=new Constructors();
        Constructors objectOne=new Constructors(420);
        
    }
}
