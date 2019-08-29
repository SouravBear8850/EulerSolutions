public class q3 {

public static void main(String args[])
{
    Long num=600851475143L;
    int k;
    for (k = 2; k <= num; k++)
     { if (num % k== 0) 
        { 
          num=num/ k;
          k--; 
       
        }
    }    
    System.out.println(k);
    
  }
}
