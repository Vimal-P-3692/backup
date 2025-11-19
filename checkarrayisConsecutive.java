import java.util.*;
class Main{
    public static void main(String []args){
        
        int []arr={1,7,3,4,5};
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2!=0&&arr[i+1]%2==0)||(arr[i]%2==0&&arr[i+1]%2!=0))
            {
                check=true;
                
            }
            else{
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       
        
    }
}