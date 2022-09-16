
import java.util.*;
public class practical_1 {
    
    public static void main(String[] args) 
    { 
        Geometricobject OC=new circle(); 
        Geometricobject OR = new rectangle();
        TestGeometricObject OT=new TestGeometricObject(); 
        OC.getArea();
        OC.getPerimeter();
        OR.getArea();  
        OR.getPerimeter();
    System.out.println("FOR TRIANGLE "); 
    OT.getArea(4,5,6,7); 
    OT.getPerimeter(4,5,6);
    
    }
    }
    