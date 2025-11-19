import java.util.*;


public class revese {
    public static void main(String[] args) {
        int a=5;
        
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=a;j++)
            {
                if((i==1 && j==3)||(i==2 && j==3)||(i==3&&j==0)||(i==3&&j==1)||(i==3&&j==2)||(i==3&&j==3)||(i==3&&j==4)||(i==3&&j==5)||(i==3&&j==6)||(i==4 && j==3)||(i==5 && j==3))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
   
    


   