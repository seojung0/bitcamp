// ver 04

//여러명의 성적을 저장하고 다음과 같이 출력하라!

//출력내용
// 홍길동, 100  90  80  270  90.0
// 임꺽정,  80  80  80  240  80.0
// 유관순, 100 100 100  300 100.0

public class  App2 {
   
    public static void main(String[] args) {
        String[] names ={"홍길동","임꺽정","유관순"};
        int[] arr1={100,80,100};
        int[] arr2={90,80,100};
        int[] arr3={80,80,100};
        for(int i=0;i< names.length; i++)
        {
            int sum;
            sum = arr1[i]+arr2[i]+arr3[i];
            float aver = sum / 3.0f;
            System.out.printf("%-4s,%4d,%4d,%4d,%4d,%6.1f\n",names[i],arr1[i],arr2[i],
            arr3[i],sum,aver);

            
        
        

        }

    }
}
