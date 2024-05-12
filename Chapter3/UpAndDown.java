package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int card = rand.nextInt(100);
        int count = 1;
        int input;

        System.out.println("수를 결정하였습니다. 맞추어 보세요");
        System.out.println("0-99");
        System.out.print(count + ">>");

        input = scan.nextInt(); // 첫 번째 입력 받기

        while (input != card) {
            if (input > card) {
                System.out.println("더 낮게");
            } else {
                System.out.println("더 높게");
            }
            count++;
            System.out.print(count + ">>");
            input = scan.nextInt(); // 다음 입력 받기
        }

        System.out.println("맞았습니다.");
    }
}
