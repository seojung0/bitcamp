
public class  App6 {
   
    public static void main(String[] args) {
        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

            void compute(){
                sum = kor+eng+math;
                aver = sum/3.0f;
                }
            }
            Score[] scores = new Score[4];
            scores[0] = new Score();
            scores[1] = new Score();
            scores[2] = new Score();
            scores[3] = new Score();

            scores[0].name= "홍길동";
            scores[0].kor= 10;
            scores[0].eng= 20;
            scores[0].math= 30;
            scores[0].compute();

            scores[1].name= "임꺽정";
            scores[1].kor= 20;
            scores[1].eng= 30;
            scores[1].math= 40;
            scores[1].compute();

            scores[2].name= "유관순";
            scores[2].kor= 30;
            scores[2].eng= 40;
            scores[2].math= 50;
            scores[2].compute();

            scores[3].name= "서정혁";
            scores[3].kor= 40;
            scores[3].eng= 50;
            scores[3].math= 60;
            scores[3].compute();

            for(int i = 0; i< scores.length; i++){
                System.out.printf("%s %d %d %d %d %f \n"
                ,scores[i].name,scores[i].kor,scores[i].eng,scores[i].math,
                scores[i].sum,scores[i].aver);

            }
         
        
    }
}