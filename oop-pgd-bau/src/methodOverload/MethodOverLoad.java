
package methodOverload;
public class MethodOverLoad {
    public void Test(){
        System.out.println("Test With No Return No Arguments");
    }
    public void Test(int number){
        System.out.println("Test With No Return Integer Parameter single");
    }  
    public void Test(String name){
        System.out.println("Test With No Return String Parameter single");   
    }
    
    
    public void Test(String name, int number){
        System.out.println("Test With No Return Double Parameter");   
    }
    
    public static void main(String [] args){
        MethodOverLoad object=new MethodOverLoad();
        object.Test();
        object.Test(12);
        object.Test("Check");
        object.Test("Check",12);
    }
 }
