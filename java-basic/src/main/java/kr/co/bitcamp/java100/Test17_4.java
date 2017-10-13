
//package kr.co.bitcamp.java100;

public class Test17_4 {
    static void m1(int... values ) {
        System.out.printf("아큐먼트의 개수: %d\n",values.length);
        for(int v : values) {
            System.out.println(v);
        }
        System.out.println("__________________");
    }
    static void m3(String name,int age,int... values) {}
    //static void m4(String name,int... values,int age) {}
    
    //static void m2 (int... values, int...age ) {
       // System.out.printf("%s(%d)님 반갑습니다.\n",name,age);
    //}
    static void sum(int... values) {
        int s = 0;
        for(int v : values) {
            s +=v;
        }
        System.out.printf("합계: %d\n",s);
    }
    public static void main(String[] ags) {
        m1();
        m1(100);
        m1(100,23);
        m1(100,23,41);
        int i = 60;
        sum();
        sum(10);
        sum(i,20,50);
        sum(10,50,60,80);
        
       
    }
}



