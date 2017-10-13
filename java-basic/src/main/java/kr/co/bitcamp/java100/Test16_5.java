
//package kr.co.bitcamp.java100;

public class Test16_5 {
  public static void main(String[] ags) {
      for(int i = 0; i < 5; i++)
          System.out.println(i);
      System.out.println("__________________________");
      for(int i=0,j=0; i < 5; i++ ,j+=2)
          System.out.printf("%d,%d\n",i,j);
      System.out.println("__________________________");
      int sum=0;
      for(int i =0; i <= 10; i++)
          sum += i;
      System.out.println(sum);
      System.out.println("__________________________");
      for(int i = 1; i <= 10; i++) {
          if(i==5)
              break;

          System.out.println("=>");
          System.out.println(i);

      }
      for(int i =1; i<=10; i++ ) {
          if(i==5)
              continue;
          System.out.println(i);
      }
      int i = 0;
      for(; i< 5; i++) {
          System.out.println(i);
      }
      System.out.println("__________________________");
      System.out.println(i);
      System.out.println(i);
      System.out.println("__________________________");
      i = 0;
      for(; i < 5;) {
          System.out.println(i);
          i++;
      }
      System.out.println("__________________________");
      i = 0;
      for(;;) {
          System.out.println(i);
          i++;
          if(i==5)
              break;
      }
      System.out.println("__________________________");
      String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
      for(int index= 0; index < names.length; index++) {
          System.out.println(names[index]);
          
      }
      label1:
      for(int a =1; a <= 5; a++) {
          for(int b = 0; b<a; b++) {
              System.out.print("*");
              if (b==2)
                  break label1;
          }
          System.out.println();
      }
      System.out.println();
      

  }

}



