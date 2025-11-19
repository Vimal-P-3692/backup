class Addition{
    int a=12;
    int b=12;
    int c=a+b;
    public void display(){
        System.out.println(c);
    }
}
class Main{
    public static void main(String [] args){
        Addition d=new Addition();
        d.display();
    }
}