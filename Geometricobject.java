// this program is prepared by 21ce105_patelvraj
// Create an abstract class GeometricObject as the superclass for Circle and Rectangle. 
//GeometricObject models common features of geometric objects. 
//Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. 
//Since you can compute areas and perimeters for all geometric objects, 
//so define the getArea() and getPerimeter() methods in the GeometricObject class. 
//Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, 
//compare area of both and display results. 
//Design of all classes are given in the
//following UML diagram.
// GITHUB LINK :

import java.util.*;
abstract class Geometricobject
{
abstract void getArea(); abstract void getPerimeter();
}
class circle extends Geometricobject
{
Scanner sc=new Scanner(System.in); 
float radius;	
void getArea()
{
System.out.println("Enter radius of circle :"); 
radius=sc.nextInt();
System.out.println("Area ofcircle: "+3.14*radius*radius);
}
void getPerimeter()
{

System.out.println("perimeter of circle:"+2*3.14*radius);
} 
} 
class rectangle extends Geometricobject
{
Scanner sc=new Scanner(System.in);	
int l,b; 
void getArea()
{
System.out.println("Enter length and breadth of rectangle ");	
l=sc.nextInt(); 
b=sc.nextInt();
System.out.println("Area of rectangle: "+l*b);
}
void getPerimeter()
{

System.out.println("Perimeter of rectangle : "+2*(l+b));

} 
}
class TestGeometricObject
{
void getArea(int a, int b, int c,int d)
{
int s1=a;	
int s2=b;	
int s3=c; 
int h1= d;
System.out.println("Area of triangle is :"+ 0.5*s2*h1);
}
void getPerimeter(int p, int q, int r)
{
    int a=p;	
    int b=q;	
    int c=r; 
    System.out.println("Perimeter of triangle is :"+a+b+c);
    }
    }
    
    