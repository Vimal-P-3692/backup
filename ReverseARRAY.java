public class ReverseARRAY {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int new1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            new1[i]=arr[arr.length-1-i
            ];
        }

        for(int i=0;i<new1.length;i++)
        {
            System.out.print(new1[i]);
        }
    }
}
