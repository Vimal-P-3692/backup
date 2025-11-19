import java.util.*;
class Main{
    public static void main(String [] args)
    {
      int  a[]={1,2,3};
      int b[]={4,5,6};
      int n= a.length + b.length;
        int  c[] =new int[n];
        for (int i=0;i<3;i++)
        {
            c[i]=a[i];
            c[i+3]=b[i];
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
        System.err.println();

        int arr[]={4,5,6,32,2,56,7,31,1,32,3,3,};
        int length=arr.length;

        int ood[]=new int[length];
        int eve[] = new int[length];
        int oddpo=0;
        int evepo=0;

        for(int i=0;i<length;i++)
        {
            if(arr[i]%2==0){
                eve[evepo]=arr[i];
                evepo++;

            }
            else{
                ood[oddpo]=arr[i];
                oddpo++;
                
            }
        }
        for(int i=0;i<oddpo;i++)
        {
            System.out.print(ood[i]+" ");
        }
        System.out.println();
        for(int i=0;i<evepo;i++)
        {
            System.out.print(eve[i]+" ");
        }

        
       
    }
}









