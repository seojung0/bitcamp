class  Test03 {
  public  static  void  main ( String [] args ) {
   System.out.println ( " 안녕하세요 " );
  }
}
/* 분리
>ajvac -d [.class 파일을 저장할 폴더][소스파일명]
md bin >javac -d bin -encoding utf8 Test03.java
다른 폴더에 있는 클래스 실핼하기 java -classpath [.class 파일이 있는폴더 ]클래스명
java -cp class 폴더 파일명 
운영체제에 .classpath 를 사용하여 .class 파일이 있는 경로를 지정할 필요가없다.
>set CLASSPATH=클래스파일이 있는 폴더

