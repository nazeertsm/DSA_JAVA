package MiscEg;
import java.math.BigInteger;

public class Big_Integer {

         void BigInt(){

             BigInteger A = new BigInteger("16");
             BigInteger B = new BigInteger("156");
             BigInteger C = A.add(B);
             //A.subtract(B);
             //A.multiply(B);
             System.out.println(C);

             int cmp= A.compareTo(B);
             if (cmp>0){
                 System.out.println("A is Greater");

             } else if (cmp<0) {
                 System.out.println("B is Greater");
                 
             }
             else
                 System.out.println("A and B are Equal");
         }




    public static void main (String[] args) {

             Big_Integer BI = new Big_Integer();
             BI.BigInt();

    }

}