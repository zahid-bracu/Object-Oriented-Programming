 
//class
public class ClassAndObject {
    
    String name="Zahid";
    double cgpa=3.60;
    int roll=420;
    
    // custom method
    public void myInfo(){
        System.out.println("My Name : "+name+" & My Roll : "+roll+" , and my CGPA is : "+cgpa+" .");
        
    }
    
    //main method
    public static void main(String [] args){
       ClassAndObject myObj=new ClassAndObject();
       myObj.myInfo();
       myObj.cgpa=3.70;
       myObj.myInfo();
    }
}
