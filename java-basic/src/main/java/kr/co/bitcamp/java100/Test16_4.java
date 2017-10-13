//package kr.co.bitcamp.java100;

public class Test16_4 {
    public static void main(String[] ags) {
        int i = 0;
        while (i < 5)
            System.out.println(i++);
        System.out.println("_______________________");
        i = 0;
        while (i < 5) {
            System.out.print("=>");
            System.out.println(i);
            i++;
        }
        System.out.println("_______________________");
        i = 5;
        while (i >= 1) {

            int count =(5 - i)/2 ;
            while(count > 0) {
                System.out.print(" ");
                count--;
            }
            count =1;
            while(count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i-= 2;
        }
        i = 0;
        while (i < 5) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("_______________________");
        i = 0;
        while (i < 5) {
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("_______________________");
        i = 2;
        while(i<=9) {
            int j = 1;
            while(j <= 9) {
                System.out.printf("%d*%d=%d\n",i,j,(i*j));
                j++;
                
            }
            i++;
        }
        i = 987654321;
        while(i > 0 ) {
            System.out.printf("%d", i % 10);
            i/=10;
            
            
        }
        System.out.println("_______________________");
        i = 4884325;
        int[] cnt = new int[10];
        int count = 0;
        int x = 0;
        while(i > 0) {
            cnt[i % 10]++;
            i/=10;
        }
        while(count < cnt.length) {
            System.out.printf("%d = %d \n",x,cnt[x]);
            x++;
            count++;
        }
        System.out.println("_______________________");
        int b = 1;
        i = 2;
        //int result = i* b;
        while(i < 9) {
            i++;
            while(b < 9) {
                b++;
                System.out.printf("%d*%d=%d\n",i,b,(i*b));
            }
            
        }
    
        
        

    }

}

