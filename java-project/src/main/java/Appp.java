// ver 02
// -학생 한 명의 성적 점수를 출력하라!
// -이름, 국어, 영어, 수학, 총점, 평균
//  예)
//  이름:홍길동
//  국어:100
//  영어:100
//  수학:100
//  총점:300
//  평균:100.0
// ver 01
//- 표준 출력 장치로 인사문구 출력하기

public class Appp {

    public static void main(String[] args) {
        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        Score s1 =  new Score();
        s1.name ="홍길동";
        s1.kor =100;
        s1.eng =90;
        s1.math =80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum /3f;

        Score s2 =  new Score();
        s2.name ="임꺽정";
        s2.kor =90;
        s2.eng =80;
        s2.math =70;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum /3f;
        Score s3 =  new Score();
        s3.name ="유관순";
        s3.kor =80;
        s3.eng =70;
        s3.math =60;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.aver = s3.sum /3f;

        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s1.name, s1.kor, s1.eng ,s1.math,s1.sum,s1.aver);
        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s2.name, s2.kor, s2.eng ,s2.math,s2.sum,s2.aver);
        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s3.name, s3.kor, s3.eng ,s3.math,s3.sum,s3.aver);



    }
}
