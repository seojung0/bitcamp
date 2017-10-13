
//package kr.co.bitcamp.java100;

public class Test16_8_test {
    public static void main(String[] ags) {
        for(int i = 1; i < 20; i+= 4) {
            for(int j = 0; j < i; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("&");
            }
            System.out.println();
            
        }
        System.out.println();
        for(int i = 8; i > 0; i -=1) {
            for(int j = 0; j < i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 2; i < 7; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                int result = i*j;
                System.out.printf("%d*%d=%d\n",i,j,result);
            }
        }
        System.out.println("_____________________");
        int i = 2;
        
        while(i < 10) {
           
            int j = 1;
            while(j <= 9) {
                System.out.printf("%d*%d=%d\n",i,j,(i*j));
                j++;
            }
            i++;
        }
        

    }
}



