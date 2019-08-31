public class q7 {

  public static void main(String[] args) {
    long i;
    long c=1;
    for(i=3 ;i<=100000;i=i+2)
     {
       if(isprime(i)==1)
       c++;
       if(c==10001)
       {
       System.out.println(i);
      break;
      }
     }
}
public static int isprime(long n)
{
  int c=0;
  for(int i=3;i<(n/2);i=i+3)
  {
    if(n%i==0)
    {
      c++;
      
    }
  }
  if(c==0)
  return 1;
  else 
  return 0;
  }
  }
