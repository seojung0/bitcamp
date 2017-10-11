//package kr.co.bitcamp.java100;

public class Test15_11_3 {
      public static void main(String[] ags) {
          int  p1 = 0;
          p1 = 0b0_111_101_101;
          
          final int DIRECTRY   = 0*0200;//0b0010_0000_0000;
          final int OWNER_READ = 0*0100;//0b0001_0000_0000;
          final int OWNER_WRITE= 0*0080;//0b0000_1000_0000;
          final int OWNER_EXE  = 0*0040;//0b0000_0100_0000;
          final int GROUP_READ = 0*0020;//0b0000_0010_0000;
          final int GROUP_WRITE= 0*0010;//0b0000_0001_0000;
          final int GROUP_EXE  = 0*0008;//0b0000_0000_1000;
          final int OTHER_READ = 0*0004;//0b0000_0000_0100;
          final int OTHER_WRITE= 0*0002;//0b0000_0000_0010;
          final int OTHER_EXE  = 0*0001;//0b0000_0000_0001;
          
          
          
          System.out.print((p1 &DIRECTRY)== DIRECTRY?"d": "_");
          System.out.print((p1 &OWNER_READ)== OWNER_READ?"r": "_");
          System.out.print((p1 &OWNER_WRITE)== OWNER_WRITE?"w": "_");
          System.out.print((p1 &OWNER_EXE)== OWNER_EXE?"x": "_");
          System.out.print((p1 &GROUP_READ)== GROUP_READ?"r": "_");
          System.out.print((p1 &GROUP_WRITE)== GROUP_WRITE?"w": "_");
          System.out.print((p1 &GROUP_EXE)== GROUP_EXE?"x": "_");
          System.out.print((p1 &OTHER_READ)== OTHER_READ?"r": "_");
          System.out.print((p1 &OTHER_WRITE)== OTHER_WRITE?"w": "_");
          System.out.print((p1 &OTHER_EXE)== OTHER_EXE?"x": "_");
          



      }

      }
    
 