package zaidimas;

import java.util.Scanner;

public class Zaidimas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rock \n2. Scissors \n3. Paper \n0. The end");

        int userChoice = 0;
        int compChoice = 0;
        int winCount = 0;
        int lossCount = 0;
        int drawCount = 0;
        int gameCount = 0;
        int uRock = 0;
        int uScissors = 0;
        int uPaper = 0;
        int cRock = 0;
        int cScissors = 0;
        int cPaper = 0;

        while (true) {
            System.out.print("Enter number: \n");
            userChoice = sc.nextInt();
            if (userChoice == 0) {
                break;
            }
            if (userChoice < 1 || userChoice > 3) {
                continue;
            }

            gameCount++;
            System.out.println("User choice: " + userChoice);
            compChoice = (int) (Math.random() * 3) + 1;
            System.out.println("Computer choice: " + compChoice);

            if (userChoice == 1) {
                uRock++;
                if (compChoice == 2) {
                    cScissors++;
                    winCount++;
                    System.out.println("User win\n");
                    continue;
                }
                if (compChoice == 3) {
                    cPaper++;
                    lossCount++;
                    System.out.println("Computer win\n");
                    continue;
                }
                if (compChoice == 1) {
                    cRock++;
                    drawCount++;
                    System.out.println("Draw\n");
                    continue;
                }
            }

            if (userChoice == 2) {
                uScissors++;
                if (compChoice == 1) {
                    cRock++;
                    lossCount++;
                    System.out.println("Computer win\n");
                    continue;
                }
                if (compChoice == 3) {
                    cPaper++;
                    winCount++;
                    System.out.println("User win\n");
                    continue;
                }
                if (compChoice == 2) {
                    cScissors++;
                    drawCount++;
                    System.out.println("Draw\n");
                    continue;
                }
            }

            if (userChoice == 3) {
                uPaper++;
                if (compChoice == 2) {
                    cScissors++;
                    lossCount++;
                    System.out.println("Computer win\n");
                    continue;
                }
                if (compChoice == 1) {
                    cRock++;
                    winCount++;
                    System.out.println("User win\n");
                    continue;
                }
                if (compChoice == 3) {
                    cPaper++;
                    drawCount++;
                    System.out.println("Draw\n");
                    continue;
                }
            }
        }
        System.out.println("Game count: " + gameCount + "\nUser wins: " + winCount + "\nComputer wins: " + lossCount + "\nDraw count: " + drawCount);
        System.out.println("User choice: \nRock: " + uRock + "\n" + ((double) uRock / gameCount));
        System.out.println("Scissors: " + uScissors + "\n" + ((double) uScissors / gameCount));
        System.out.println("Paper: " + uPaper + "\n" + ((double) uPaper / gameCount));
        System.out.println("Computer choice: \nRock: " + cRock + "\n" + ((double) cRock / gameCount));
        System.out.println("Scissors: " + cScissors + "\n" + ((double) cScissors / gameCount));
        System.out.println("Paper: " + cPaper + "\n" + ((double) cPaper / gameCount));

    }
}
