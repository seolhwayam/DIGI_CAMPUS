public class StringExam {
   public static void main(String[] args) {
      String str1 = new String("Superman");
      String str2 = new String("Superman");
      
      if(str1 == str2) {
         System.out.println("같아용");
      } else {
         System.out.println("달라용");
      }
      
      
      if(str1.equals(str2)) {
         System.out.println("같아용");
      } else {
         System.out.println("달라용");
      }
   }
}
/*결과값
>>>>>>>>>>>>>>>>>>>>>>>>>> 
달라용 //
객체의 ==는 주소값을 비교하기때문임.
같아용

문자열은 값을 바꿀 수 없다

 * */
