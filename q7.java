public class q7
{
  public static boolean isPrime(int p)
  {
    boolean isprime=false;
    if(p==2)
    {
      isprime=true;
    }
    for(int i=2;i<p;i++)
    {
      if(p%i!=0){
      isprime=true;
      }
      else
      {
        isprime=false;
        break;
      }
    }
    return isprime;
  }
  public static void main(String[] args)
  {
    int counter=0;
    int x=2;
    while(counter < 10001)
    {
      if(isPrime(x)){
        counter++;
      } x++;
    }
    System.out.println(x-1);
  }
}
