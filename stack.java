import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack <Integer> s = new Stack<>();
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        
        for(int i=0;i<n;i++)
        s.push(inp.nextInt());
        
        System.out.println("Top Element : "+s.peek());
        
        int x = inp.nextInt();
        
        if(s.contains(x))
        System.out.println("Element is found at position : "+s.search(x));
        
        else 
        System.out.println("Element not found");
        
    }
}