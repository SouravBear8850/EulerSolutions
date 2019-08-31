public class q7 {

  public static void main(String[] args) {
    long i,num=0;
    long c=4,count=0;
    for(i=11 ;i<=100000;i=i+2)
    {count=0;
      for(long j=3;j<=i/2;j=j+2)
      {
        if(i%j==0)
        { count++;
        }
        
      }
      if(count==0)
      c++;
      
      if(c==10001)
     {
        System.out.println(num);
       break;
     }
     }
  }
  

}
