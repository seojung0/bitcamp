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

public class Appp2 {

    public static void main(String[] args) {
        class Score{
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        Score s1 =  new Score();
        s1.name ="홍길동";
        s1.subjects[0] = 100;
        s1.subjects[1] = 80;
        s1.subjects[2] = 70;
        for(int sub : s1.subjects) {
            s1.sum +=sub;
        }

        Score s2 =  new Score();
        s2.name ="임꺽정";
        s2.subjects[0] = 90;
        s2.subjects[1] = 60;
        s2.subjects[2] = 70;
        for(int sub : s2.subjects) {
            s2.sum +=sub;
        }
        Score s3 =  new Score();
        s3.name ="유관순";
        s3.subjects[0] = 50;
        s3.subjects[1] = 60;
        s3.subjects[2] = 70;
        for(int sub : s3.subjects) {
            s3.sum +=sub;
        }
        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s1.name, s1.subjects[0],s1.subjects[1],s1.subjects[2],s1.sum,s1.aver);
        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s2.name, s2.subjects[0], s2.subjects[1],s2.subjects[2],s2.sum,s2.aver);
        System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                s3.name, s3.subjects[0], s3.subjects[1] ,s3.subjects[2],s3.sum,s3.aver);



    }
}
