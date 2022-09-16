// this program is prepared by 21ce105_patelvraj
//Write a program that illustrates the significance of interface default method.
// GITHUB LINK :
interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  

