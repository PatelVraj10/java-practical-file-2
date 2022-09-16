// this program is prepared by 21ce105_patelvraj
//Write a program to create a default method in an interface IPrinter. 
//Create an interface IPrinter and IScanner. You can assume variables and methods for both interfaces. 
//Create a concrete class to implement both the interfaces.
//Create 5 objects of the class, store it in Vector and display          
//the result of the vector
// GITHUB LINK :
import java.util.Vector; 
interface iprinter
{
String ip(); 
default void show()
{
System.out.println("Default iprinter");
}
}
interface iscanner
{ 
    String isc();
    default void show()
{
System.out.println("Default testinterface2");
}
}
class defaultmethod implements iprinter,iscanner 
{ @Override
public String ip() 
{ 
    return "iprinter";
}

@Override
public String isc() { 
    return "iscanner";
}		public void show() 
{ 
    iprinter.super.show();
iscanner.super.show();

} 
}

