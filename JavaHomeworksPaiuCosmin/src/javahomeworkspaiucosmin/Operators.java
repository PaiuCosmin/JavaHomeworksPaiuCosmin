package javahomeworkspaiucosmin;

public class Operators {
    public static void main (String[] args){
    int i, j, k;
        j = 654;
        k = 34567;
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("\n Arithmetic Operators");
        /*examples of arithmetic operators
        *it works also for short, long, double
        */
        i =  (j + k);
        System.out.println("j + k =" + i);
        i = (j - k);
        System.out.println("j - k =" + i);
        i = (j / k);
        System.out.println("j / k =" + i);
        i = (j * k);
        System.out.println("j * k =" + i);
        i = (j % k);
        System.out.println("j % k =" + i);
        i=j--;
        System.out.println("j = " + j + " and i = " + i);
        i=j++;
        System.out.println("j = " + j + " and i = " + i);
        
        //the relational operators
        System.out.println("\n Relational Operators");
    boolean egalitate = j==k;
        System.out.println("j equals to k? " + egalitate);
        egalitate = j!=k;
        System.out.println("j not equal to k? " + egalitate);
        egalitate = j>k;
        System.out.println("j greater than k? " + egalitate);
        egalitate = j<k;
        System.out.println("j less than k? " + egalitate);
        egalitate = j<=k;
        System.out.println("j less than or equal to k? " + egalitate);
        egalitate = j>=k;
        System.out.println("j grater than or equal to k? " + egalitate);
        
        //the bitwise operators
        System.out.println("\n Bitwise Operators");
      int a = 50;
      int b = 12;
      int c = 0;

      c = a & b;     
      System.out.println("a & b = " + c );
      c = a | b;      
      System.out.println("a | b = " + c );
      c = a ^ b;       
      System.out.println("a ^ b = " + c );
      c = ~a;          
      System.out.println("~a = " + c );
      c = a << 2;      
      System.out.println("a << 2 = " + c );
      c = a >> 2;     
      System.out.println("a >> 2  = " + c );
      c = a >>> 2;     
      System.out.println("a >>> 2 = " + c );    
     
       
    }
}