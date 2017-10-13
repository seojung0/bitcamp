//package kr.co.bitcamp.java100;

public class Test16_2 {
    public static void main(String[] ags) {
        int age = 20;

        if (age <= 19) System.out.println("미성년");else System.out.println("성년");

        age = 17;
        if(age <= 19)
            System.out.println("미성년");
        else
            System.out.println("성년");
        age = 57;
        if(age > 65)
            System.out.println("노인");
        else
            System.out.println("aa");
        System.out.println("---------------------------------");

        age = 27;
        if (age <= 19) 
            System.out.println("미성년입니다.");
        System.out.println("청소년 할인을 받을 수 있습니다.");

        System.out.println("---------------------------------");

        age = 27;
        if (age <= 19) { 
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인을 받을 수 있습니다.");
        }
        System.out.println("---------------------------------");
        age = 14;
        if (age <= 19) 
            if(age > 13)
                System.out.println("청소년");
        System.out.println("---------------------------------");
        age = 27;
        if (age <= 19)
            if(age > 13)
                System.out.println("청소년");
            else
                System.out.println("성년");
        System.out.println("---------------------------------");

        age = 27;
        if (age <= 19) {
            if(age > 13)
                System.out.println("청소년");
        }
        else
            System.out.println("성년");
        System.out.println("---------------------------------");
        age = 13;
        if (age <= 19)
            if(age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이");
        System.out.println("---------------------------------");
        age = 23;
        if (age <= 19)
            if(age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이");
        else
            System.out.println("성년입니다.");
        System.out.println("---------------------------------");
        age = 72;
        if (age <= 19) {
            if(age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이");
        }
        else {
            if(age < 65)
                System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");
        }
        System.out.println("---------------------------------");
        age = 72;
        if (age < 8)
            System.out.println("유아");
        else
            if (age < 14)
                System.out.println("어린이");
            else
                if (age < 20)
                    System.out.println("청소년");
                else
                    if (age < 65)
                        System.out.println("성년");
                    else
                        System.out.println("노인");
        System.out.println("---------------------------------");
        age = 72;
        if (age < 8)
            System.out.println("유아");
        else if (age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if (age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");
        System.out.println("---------------------------------");
        age = 72;
        if (age < 8) {
            System.out.println("유아");
        }else if (age < 14) {
            System.out.println("어린이");
        }else if (age < 20) {
            System.out.println("청소년");
        }else if (age < 65) {
            System.out.println("성년");
        }else {
            System.out.println("노인");
        }
        System.out.println("---------------------------------");
        
        for(int i = 2; i < 10; i++) {
            for(int a = 1; a < 10; a++) {
                int result = i*a;
                if(i == a) {
                    continue;
                }
                System.out.printf("%d*%d=%d\n",i,a,result);
            }
        }
        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("@");
               
            }
            System.out.println();
        }
     
            }
    }



