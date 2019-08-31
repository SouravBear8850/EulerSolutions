public class q2 {

  public static void main(String[] args) {
    long firstno = 0, secno = 1, result = 2;
    long sum = 0;
    while (secno < 4000000) {
      result = firstno + secno;
      firstno = secno;
      secno = result;
      if (secno % 2 == 0) {
        sum = sum + secno;
      }
    }
    System.out.println(sum);
  }
}
