
import java.util.*;
public class loops
{
    public static void main(String[]agrs)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean p=true;
        for(int i=1;i<=N/2;i++)
        {
            if(N%i==0)
            {
                p=false;
                break;
            }
        }
        if(p)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("not Prime");
        }
    }
}

