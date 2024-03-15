package Day10;

import java.awt.*;

public class RadioChekboxEx2 {
   public static void main(String[] args) {
      

   Frame f = new Frame("Apeach check");
   Panel p = new Panel();
   
   CheckboxGroup group = new CheckboxGroup();
   Checkbox ck1 = new Checkbox("pipi",group,true);
   Checkbox ck2 = new Checkbox("popo",group,false);
   Checkbox ck3 = new Checkbox("cici",group,false);
   
   p.add(ck1);
   p.add(ck2);
   p.add(ck3);
   
   f.add(p);
   
   f.setSize(300,100);
   f.setVisible(true);
   
   }
}