package Day8;

public class GenericEx01<T> {
   T[] v;
   
   public void set(T[] n) {
      v = n;
   }
   
   public void print() {
      for (T s: v)
         System.out.println(s);
   }

   public static void main(String[] args) {
      GenericEx01<String> t = new GenericEx01<String>();
      String[] as = {"어","피","치"};
      t.set(as);
      t.print();
      
      
      GenericEx01<Integer> y = new GenericEx01<Integer>();
      Integer[] is = {1,2,3};
      y.set(is);
      y.print();
   }
   
}