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

public class Appp3 {

    public static void main(String[] args) {
        class Score{
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        
       /* Score[] score = new Score[3];
        score[0] = new Score();
        score[1] = new Score();
        score[2] = new Score();
        */
        
        Score[] scores = {new Score(),new Score(),new Score()};
        
       // Score s1 =  new Score();
        scores[0].name ="홍길동";
        scores[0].subjects[0] = 100;
        scores[0].subjects[1] = 80;
        scores[0].subjects[2] = 70;
        for(int sub : scores[0].subjects) {
            scores[0].sum +=sub;
            
        }
        scores[0].aver = scores[0].sum / 3f;

       // Score s2 =  new Score();
        scores[1].name ="임꺽정";
        scores[1].subjects[0] = 90;
        scores[1].subjects[1] = 60;
        scores[1].subjects[2] = 70;
        for(int sub : scores[1].subjects) {
            scores[1].sum +=sub;
        }
        scores[1].aver = scores[1].sum / 3f;
        //Score s3 =  new Score();
        scores[2].name ="유관순";
        scores[2].subjects[0] = 50;
        scores[2].subjects[1] = 60;
        scores[2].subjects[2] = 70;
        for(int sub : scores[2].subjects) {
            scores[2].sum +=sub;
        }
        scores[2].aver = scores[2].sum / 3f;
        for(Score s : scores) {
            System.out.printf("%-4s, %4d,%4d,%4d,%4d,%6.1f\n",
                    s.name,s.subjects[0],s.subjects[1],s.subjects[2],s.sum,s.aver);
        }
        


    }
}
