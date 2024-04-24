/*
 * 이 프로그램은 StringBuffer 클래스를 이용하여 사용자로부터 영문(스페이스 포함)을 입력받고,
 * 글자 하나만 랜덤하게 선택해서 다른 글자로 수정하는 프로그램입니다.
 * 프로그램은 무한 반복되다가 exit라는 문자열이 입력되면 종료 됩니다.
 */

 import java.util.Scanner; ; // (문제1) 다음 코드를 실행하기 위한 Scanner class를 import해 주세요.

 public class Midterm {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         while((scanner.nextInt()) != 0) { // (문제2) 무한루프를 실행할 수 있는 조건절을 입력하세요.
             System.out.print(">>");			
             String s = scanner.nextLine(); 
             StringBuffer sb = new StringBuffer();  // (문제3) StringBuffer 객체 sb 생성할 수 있게 코드를 완성해 주세요.
             if(sb.toString().equals("exit")) { // (문제4) exit가 입력됬는지 확인하는 조건절을 완성해 주세요.
                 System.out.println("프로그램을 종료합니다.");	
                 break;
             }
             int index = (int)(Math.random()*s.length());
             while(true) {
                 int i = (int)(Math.random()*26);
                 char c = (char)('a' + i); 
                 if(sb.charAt(index) !=c ) { // (문제5) StringBuffer 속의 문자와 삽입하는 문자가 다른지를 확인하는 조건절을 완성해 주세요.
                     sb.replace(index, index+1, Character.toString(c)); 
                     break; 
                 }
             }
             System.out.println(sb);
         }
         scanner.close();
     }
 }