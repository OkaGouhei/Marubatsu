import java.util.Scanner;

public class Marubatsu{
  public static void main(String[] args){
    String[][] array;
    array = new String[3][3];
    for(int i = 0;i < 3;i++ ){
      for(int j = 0;j < 3;j++ ){
        array[i][j] = " ";
      }
     }
    for(int i = 0;i < 3;i++ ){
      for(int j = 0;j < 3;j++ ){
        System.out.print(array[i][j]);
        if(j==2){
          continue;
        }
        System.out.print(" |");
      }
      System.out.println();
    }
    String x = "*";
    String y = "@";
    boolean repeat = true;
    int m = 0;
    Scanner scan = new Scanner(System.in);
    while(repeat){
      String a;
      if (m%2==0){
        a = x;
      } else {
        a = y;
      }
      System.out.println(a + "の番です");

      System.out.println("たて");
      int number1 = scan.nextInt();

      if(number1 <0|number1>2){
        System.out.println("もう一度数字を入れ直してください");
        continue;
      }
      System.out.println("よこ");
      int number2 = scan.nextInt();
      if(number2 <0|number2>2){
        System.out.println("もう一度数字を入れ直してください");
        continue;
      }
      if (array[number1][number2] != " "){
        System.out.println("すでに石が置いてあります。もう一度入力してください");
        continue;
      }
      array[number1][number2] = a;
      for(int i = 0;i< 3;i++ ){
        for(int j = 0;j < 3;j++ ){
          System.out.print(array[i][j]);
          if(j==2){
            continue;
          }
          System.out.print(" |");
        }
        System.out.println();
      }
      if((array[0][0]==a&&array[0][1]==a&& array[0][2]==a )||(array[1][0] == a&&array[1][1]==a&&array[1][2]==a )||(array[2][0]==a&&array[2][1]==a&&array[2][2]==a )){
        System.out.println(a + "の勝ちです。");
        break;
      }
      if((array[0][0]==a && array[1][0]==a && array[2][0]==a )||(array[0][1]==a && array[1][1]==a && array[2][1]==a )||(array[0][2]==a && array[1][2]==a && array[2][2]==a )){
        System.out.println(a + "の勝ちです。");
        break;
      }
      if(array[0][0]==a && array[1][1]==a && array[2][2]==a){
        System.out.println(a + "の勝ちです。");
        break;
      }
      if(array[0][2]==a && array[1][1]==a && array[2][0]==a){
        System.out.println(a + "の勝ちです。");
        break;
      }
      repeat = false;
      for(int i = 0;i < 3;i++ ){
        for(int j = 0;j < 3;j++ ){
          if (array[i][j] == " "){
            repeat = true;
          }
        }
      }
      if (!repeat){
        System.out.println("あいこです。");
      }
      m++;
    }
  }
}
