import java.util.Random;
import java.util.Scanner;

public class kazuate {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int TargetNumber = rand.nextInt(90) + 10;
        int upper, InputNumber = 0, times = 0;
        boolean judge = false;

        upper = 5;

        while ((times < upper) && (judge == false)){
          do {
            System.out.println("\n2桁の正の整数を予想して入力:");
            InputNumber = scanner.nextInt();
          } while ((InputNumber < 10) && (100 <= InputNumber));
          judge = judge(TargetNumber,InputNumber);
          times++;
        }
        
        if (judge == false){
          System.out.println("\n入力回数が上限に達しました。(" + upper + "回)");
          System.out.println("Answer:" + TargetNumber);
          System.out.println("またの挑戦をお待ちしています。");
        }

        scanner.close();

        return;
    }

    public static boolean judge(int target, int input){
      if (target == input){
        System.out.println("当たり！\n");
        return true;
      } else {
        if (target < input){
          System.out.println("\n設定値より大きいです。");
          if ((input-target) >= 20){
            System.out.println("設定値と20以上の差があります。");
          }
          return false;
        } else {
          System.out.println("\n設定値より小さいです。");
          if ((target-input) >= 20){
            System.out.println("設定値と20以上の差があります。");
          }
          return false;
        }
      }
    }

}