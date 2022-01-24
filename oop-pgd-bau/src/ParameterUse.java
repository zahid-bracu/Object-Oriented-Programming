/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zahid-bracu
 */
public class ParameterUse {
    public int Sum(int x, int y){
        int result=x+y;
        return result;
    }
    
    public static void main(String [] args){
        ParameterUse object=new ParameterUse();
        int SumResult=object.Sum(10,20);
        System.out.println(SumResult);
    }
}
