// this program is prepared by 21ce105_patelvraj
//WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interfaces. 
//1,2 Interface P12 extends both P1 and P2.
//Each interface declares one method and one constant. 
//Create one class that implements P12. By using the object of the class invokes each of its method and displays constant.
// GITHUB LINK :
interface P
{	
    int vP=2;	
    void methodP();
}
interface P1 extends P
{	
    int vP1=3;	
    void methodP1();
}
interface P2 extends P
{	
    int vP2=4;	
    void methodP2();
}
interface P12 extends P1,P2
{	
    int vP12=5;	
    void methodP12();
}
class InterfaceInheritance implements P12
{
public void methodP()
{
System.out.println("Interface method P called-");
}
public void methodP1()
{
System.out.println("Interface method P1 called-");
}
public void methodP2()
{
System.out.println("Interface method P2 called-");
}
public void methodP12()
{
System.out.println("Interface method called-");
}
}

