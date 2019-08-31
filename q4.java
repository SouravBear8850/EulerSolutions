public class q4 {

  public static void main(String[] args) {
      int i=0,c=0,f=0;
      long prod=1,nnum=0,placeval=100000,dig=0,num=0;
      for(i=999;i>=100;i--)
      {
        for(int j=999;j>=100;j--)
        {
          prod=i*j;
          if(ispalin(prod)==1)
          {
            System.out.println(prod);
           System.exit(0);
          }
      }
  }

}
public static int ispalin(long num)
{
  long temp=0,dig=0,nnum=0;
  temp=num;
  while(temp!=0)
  {
    dig=temp%10;
    temp=temp/10;
    nnum=nnum*10+dig;
  }
  
  if(nnum==num)
  return 1;
  else 
  return 0;
  
}
}
