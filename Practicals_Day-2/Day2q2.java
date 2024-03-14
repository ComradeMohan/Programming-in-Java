class myclass{
    int a ;
    int b;
myclass(){
    this.a=10;
    this.b=15;
  }
  myclass(int a,int b){
    this.a=a;
    this.b=b;
  }
void disp(){
    System.out.println("a="+a+",b= "+b);
 }
}
public class Day2q2 {
    public static void main(String[] args){
        myclass obj1=new myclass();
        obj1.disp();
        myclass obj2=new myclass(20,25);
        obj2.disp();
    }
}
