import java.util.*; 
public class Practical_2 {
    public static void main(String[] args) 
    { 
        Vector<String> s = new Vector<>(); 
        defaultmethod d = new defaultmethod(); 
        s.add(d.ip());
    s.add(d.isc());
    s.add(d.ip());
    s.add(d.isc());
    s.add(d.ip());
    
    d.show();
    for (int i = 0; i < s.size(); i++)
    { 
        System.out.println(s.get(i));
    }
    
    }
    }