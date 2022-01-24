/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zahid-bracu
 */
public class MethodReturnValue {
    public int customMethod(){
        int x=10*2;
        return x;
    }
    
    public static void main(String [] args){
        MethodReturnValue object=new MethodReturnValue();
        int value=object.customMethod();
        System.out.println(value);
    
    }
}
