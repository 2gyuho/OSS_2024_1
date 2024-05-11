package Chapter2;

import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("철수 >> ");
        String player1 = scanner.next();
        System.out.print("영희 >> ");
        String player2 = scanner.next();

        if (player1.equals("가위")) {
            if (player2.equals("가위")) {
                System.out.println("비겼습니다.");
            } else if (player2.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            } else {
                System.out.println("철수가 이겼습니다.");
            }
        } else if (player1.equals("바위")){
            if (player2.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (player2.equals("바위")) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("영희가 이겼습니다.");
            }
        } else {
            if (player2.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            } else if (player2.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
        }
    }
}
