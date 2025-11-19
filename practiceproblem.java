import java.lang.*;
public class practiceproblem {
    


    public static void main(String [] args)
    {
        String a= "ffaareewwwh";
        
        
        for(int i=0;i<a.length();i++)
        {
            char ch= a.charAt(i);
            if(a.indexOf(ch)==a.lastIndexOf(ch))
            {
                System.out.println("The first non-repeating character is: " + ch);
                break;
            }
        }
    }
}
