//# 콘솔창으로 출력하기

package bitcamp.java100;
public class Test10_2{
    public static void main(String[] args) {

        //자바에서 도구를 프로그래밍 할 때 도구를 사용하는방법
        //방법1) 도구함.기능명
        //방법2) 도구함.객체명.기능명
        //방법3) 객체명.기능명

        // System=도구함=class
        // out=객체(object)=실체(instance)
        // print(ln)=라인=기능
        //"Hello"=매개 변수(parameter). 기능을 수행하기 위해 전달하는 조건.
        System.out.println("Hello!");
            //도구함에 있는 기능 바로 이용하기
        //-어떤 기능은 인스턴스가 있어야만 사용가능 하다.
        //-어떤 기능은 클래스만 있으면 사용가능하다.
            long currMillis = System.currentTimeMillis();
            System.out.println(currMillis);
    }  
}
