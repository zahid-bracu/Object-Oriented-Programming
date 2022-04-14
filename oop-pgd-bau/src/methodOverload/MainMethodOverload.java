/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodOverload;

/**
 *
 * @author zahid-bracu
 */
public class MainMethodOverload {
    public static void main(int number){
        System.out.println("Number : "+number);
    }
    public static void main(String [] args){
        MainMethodOverload object=new MainMethodOverload();
        object.main(12);
    }
}
