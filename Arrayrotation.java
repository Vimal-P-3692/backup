import java.util.*;
public class Arrayrotation 
{
    
    public static void main(String []args)
    {
      int[] arr= {1,2,3,4,5};
int n=arr.length;
      int k=1;
k=k%n;
for(int i=0;i<n;i++){
    System.out.print(arr[(i+k)%n]+" ");
    // this for anti-clockwise rotation
    // for clockwise rotation, use (i-k+n)%n
          }

          

          
    }
}



