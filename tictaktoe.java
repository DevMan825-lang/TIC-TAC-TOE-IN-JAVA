import java.util.*;

public class tictaktoe {
    public static Scanner sc = new Scanner(System.in);
    public static int computerMove;

    public void playervsplayer() {
        // Positions of the board
        // Total 3 rows and 3 colums in our board
        // 1. Player Vs Player
        char p1 = ' ', p2 = ' ', p3 = ' ';
        char p4 = ' ', p5 = ' ', p6 = ' ';
        char p7 = ' ', p8 = ' ', p9 = ' ';

        // char currentPlayer = 'X';
        boolean gameEnds = true;
        char currentPlayer = 'X';

        // This is our main board
        while (gameEnds) {
            System.out.println(p1 + "  | " + p2 + " | " + p3);
            System.out.println("-----------");
            System.out.println(p4 + "  | " + p5 + " | " + p6);
            System.out.println("-----------");
            System.out.println(p7 + "  | " + p8 + " | " + p9);

            System.out.print("Enter your move here( X or O ): ");
            int currentPlayerMove = sc.nextInt();

            // Empty cells
            switch (currentPlayerMove) {
                case 1:
                    if (p1 == ' ')
                        p1 = currentPlayer;
                    else
                        continue;
                    break;

                case 2:
                    if (p2 == ' ')
                        p2 = currentPlayer;
                    else
                        continue;
                    break;

                case 3:
                    if (p3 == ' ')
                        p3 = currentPlayer;
                    else
                        continue;
                    break;

                case 4:
                    if (p4 == ' ')
                        p4 = currentPlayer;
                    else
                        continue;
                    break;

                case 5:
                    if (p5 == ' ')
                        p5 = currentPlayer;
                    else
                        continue;
                    break;

                case 6:
                    if (p6 == ' ')
                        p6 = currentPlayer;
                    else
                        continue;
                    break;

                case 7:
                    if (p7 == ' ')
                        p7 = currentPlayer;
                    else
                        continue;
                    break;

                case 8:
                    if (p8 == ' ')
                        p8 = currentPlayer;
                    else
                        continue;
                    break;

                case 9:
                    if (p9 == ' ')
                        p9 = currentPlayer;
                    else
                        continue;
                    break;

                default:
                    System.out.println("Move doesn't match");
            }

            // game logic and conditions
            if ((p1 == currentPlayer && p2 == currentPlayer && p3 == currentPlayer) ||
                    (p4 == currentPlayer && p5 == currentPlayer && p6 == currentPlayer) ||
                    (p7 == currentPlayer && p8 == currentPlayer && p9 == currentPlayer) ||
                    (p1 == currentPlayer && p4 == currentPlayer && p7 == currentPlayer) ||
                    (p2 == currentPlayer && p5 == currentPlayer && p8 == currentPlayer) ||
                    (p3 == currentPlayer && p6 == currentPlayer && p9 == currentPlayer) ||
                    (p1 == currentPlayer && p5 == currentPlayer && p9 == currentPlayer) ||
                    (p3 == currentPlayer && p5 == currentPlayer && p7 == currentPlayer)) {
                System.out.println("Player : " + currentPlayer + "   Wins...!");
                break;
            }
            // Board is full
            if (p1 != ' ' && p2 != ' ' && p3 != ' ' && p4 != ' ' && p5 != ' ' && p6 != ' ' && p7 != ' ' && p8 != ' '
                    && p9 != ' ') {
                System.out.println("Match is tie...!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public void playervscomputer() {
        // Positions of the board
        // Total 3 rows and 3 colums in our board
        // 2. Player Vs Computer
        char p1 = ' ', p2 = ' ', p3 = ' ';
        char p4 = ' ', p5 = ' ', p6 = ' ';
        char p7 = ' ', p8 = ' ', p9 = ' ';

        // char currentPlayer = 'X';
        boolean gameEnds = true;
        char currentPlayer = 'X';
        char computerPlayer = 'O';

        // This is our main board
        while (gameEnds) {
            System.out.println(p1 + "  | " + p2 + " | " + p3);
            System.out.println("-----------");
            System.out.println(p4 + "  | " + p5 + " | " + p6);
            System.out.println("-----------");
            System.out.println(p7 + "  | " + p8 + " | " + p9);

            System.out.print("Enter Player move here(X): ");
            int currentPlayerMove = sc.nextInt();

            // Empty cells
            switch (currentPlayerMove) {
                case 1:
                    if (p1 == ' ')
                        p1 = currentPlayer;
                    else
                        continue;
                    break;

                case 2:
                    if (p2 == ' ')
                        p2 = currentPlayer;
                    else
                        continue;
                    break;

                case 3:
                    if (p3 == ' ')
                        p3 = currentPlayer;
                    else
                        continue;
                    break;

                case 4:
                    if (p4 == ' ')
                        p4 = currentPlayer;
                    else
                        continue;
                    break;

                case 5:
                    if (p5 == ' ')
                        p5 = currentPlayer;
                    else
                        continue;
                    break;

                case 6:
                    if (p6 == ' ')
                        p6 = currentPlayer;
                    else
                        continue;
                    break;

                case 7:
                    if (p7 == ' ')
                        p7 = currentPlayer;
                    else
                        continue;
                    break;

                case 8:
                    if (p8 == ' ')
                        p8 = currentPlayer;
                    else
                        continue;
                    break;

                case 9:
                    if (p9 == ' ')
                        p9 = currentPlayer;
                    else
                        continue;
                    break;

                default:
                    System.out.println("Move doesn't match");
            }

            // game logic and conditions
            if ((p1 == currentPlayer && p2 == currentPlayer && p3 == currentPlayer) ||
                    (p4 == currentPlayer && p5 == currentPlayer && p6 == currentPlayer) ||
                    (p7 == currentPlayer && p8 == currentPlayer && p9 == currentPlayer) ||
                    (p1 == currentPlayer && p4 == currentPlayer && p7 == currentPlayer) ||
                    (p2 == currentPlayer && p5 == currentPlayer && p8 == currentPlayer) ||
                    (p3 == currentPlayer && p6 == currentPlayer && p9 == currentPlayer) ||
                    (p1 == currentPlayer && p5 == currentPlayer && p9 == currentPlayer) ||
                    (p3 == currentPlayer && p5 == currentPlayer && p7 == currentPlayer)) {
                System.out.println("Player : " + currentPlayer + "   Wins...!");
                break;
            }

            // Board is full
            if (p1 != ' ' && p2 != ' ' && p3 != ' ' && p4 != ' ' && p5 != ' ' && p6 != ' ' && p7 != ' ' && p8 != ' '
                    && p9 != ' ') {
                System.out.println("Match is tie...!");
                break;
            }

            // For computer
            // Empty cells
            Random random = new Random();
            int computerMove = random.nextInt(9) + 1;
            System.out.println("Enter Computer move here(O): " + computerMove);

            switch (computerMove) {
                case 1:
                    if (p1 == ' ')
                        p1 = computerPlayer;
                    else
                        continue;
                    break;

                case 2:
                    if (p2 == ' ')
                        p2 = computerPlayer;
                    else
                        continue;
                    break;

                case 3:
                    if (p3 == ' ')
                        p3 = computerPlayer;
                    else
                        continue;
                    break;

                case 4:
                    if (p4 == ' ')
                        p4 = computerPlayer;
                    else
                        continue;
                    break;

                case 5:
                    if (p5 == ' ')
                        p5 = computerPlayer;
                    else
                        continue;
                    break;

                case 6:
                    if (p6 == ' ')
                        p6 = computerPlayer;
                    else
                        continue;
                    break;

                case 7:
                    if (p7 == ' ')
                        p7 = computerPlayer;
                    else
                        continue;
                    break;

                case 8:
                    if (p8 == ' ')
                        p8 = computerPlayer;
                    else
                        continue;
                    break;

                case 9:
                    if (p9 == ' ')
                        p9 = computerPlayer;
                    else
                        continue;
                    break;

                default:
                    System.out.println("Move doesn't match");
            }

            // game logic and conditions
            if ((p1 == computerPlayer && p2 == computerPlayer && p3 == computerPlayer) ||
                    (p4 == computerPlayer && p5 == computerPlayer && p6 == computerPlayer) ||
                    (p7 == computerPlayer && p8 == computerPlayer && p9 == computerPlayer) ||
                    (p1 == computerPlayer && p4 == computerPlayer && p7 == computerPlayer) ||
                    (p2 == computerPlayer && p5 == computerPlayer && p8 == computerPlayer) ||
                    (p3 == computerPlayer && p6 == computerPlayer && p9 == computerPlayer) ||
                    (p1 == computerPlayer && p5 == computerPlayer && p9 == computerPlayer) ||
                    (p3 == computerPlayer && p5 == computerPlayer && p7 == computerPlayer)) {
                System.out.println("Player : " + computerPlayer + "   Wins...!");
                break;
            }

            // Board is full
            if (p1 != ' ' && p2 != ' ' && p3 != ' ' && p4 != ' ' && p5 != ' ' && p6 != ' ' && p7 != ' ' && p8 != ' '
                    && p9 != ' ') {
                System.out.println("Match is tie...!");
                break;
            }
            // currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public static void main(String[] args) {
        tictaktoe myMethodObj = new tictaktoe();
        int choose;
        do {
            System.out.println("-- Tic Tac Toe --");
            System.out.println("1. Player vs Player ");
            System.out.println("2. Player vs Computer");
            System.out.println("3. Exit ");
            System.out.print("Choose your option : ");
            choose = sc.nextInt();
            // System.out.println();
            // System.out.println();
            switch (choose) {
                case 1:
                    System.out.println("You choose : (1. Player Vs Player)");
                    myMethodObj.playervsplayer();
                    break;
                case 2:
                    System.out.println("You choose : (2. Player Vs Computer)");
                    myMethodObj.playervscomputer();
                    break;
                case 3:
                    System.out.println("Thank you for playing our game....");
                    break;
                default:
                    System.out.println("Option doesn't match");
            }
        } while (choose != 3);
    }
}
