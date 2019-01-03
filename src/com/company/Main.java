package com.company;
import java.util.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int gameEnd = 0;
        int turnCount = 0;
        int row = -1;
        int column = -1;
        int[] boardPos = new int[2];
        boolean cheatDetected = false;
        String board[][] = new String[][] {
                {"[1]","[2]","[3]"},
                {"[4]","[5]","[6]"},
                {"[7]","[8]","[9]"}
        };
        Scanner stringReader = new Scanner(System.in);
        System.out.println("You (X's) are playing Tic Tac Toe against a computer (O's).\n" +
                "Who should go first? Type in \"me\" to go first, else type \"computer\" to let the computer go first.");
        String whoFirst = stringReader.nextLine();
        if (whoFirst.equalsIgnoreCase("me")){
            System.out.println("You are going first.");
        }
        else if (whoFirst.equalsIgnoreCase("computer")){
            turnCount++;
            System.out.println("The computer will go first.");
            //Computer Turn
            System.out.println(TicTacPrint.printBoard(board));
            System.out.println("Waiting for computer...");
            Thread.sleep(1000);
            if (turnCount == 1){
                boardPos = TicTacPrint.firstComputerMove(board);
            }
            else {
                boardPos = TicTacPrint.computerMove(board);
            }
            row = boardPos[0];
            column = boardPos[1];
            board[row][column] = "[O]";
            System.out.println("computer tried to place in " + row + " row, and " + column + " column.");

        }
        else {
            System.out.println("Sorry, I do not understand what you mean.");
            System.exit(0);
        }

        System.out.println("Please type in which position you would like to place your [X] in.\n" +
                "(Ex: '5');");

        System.out.println();

        while (gameEnd == 0) {



            turnCount++;
            cheatDetected = false;
            while(!cheatDetected) {
                //Player Turn
                System.out.println("It's your turn. \n");
                System.out.println(TicTacPrint.printBoard(board));
                int playerPos = stringReader.nextInt();
                boardPos = TicTacPrint.convertIntToBoardPos(playerPos);
                row = boardPos[0];
                column = boardPos[1];
                if (board[row][column].equals("[X]") || board[row][column].equals("[O]")) {
                    System.out.println("You definitely already picked that spot, try again.");
                }
                else {
                    board[row][column] = "[X]";
                    break;
                }
            }
            if (TicTacPrint.checkWin(board).equals("oWin")){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("You lost!");
                System.exit(0);
            }
            if (TicTacPrint.checkWin(board).equals("xWin")){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("You won!");
                System.exit(0);
            }
            if (turnCount == 5){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("It's a tie!");
                System.exit(0);
            }


            //Computer Turn
            System.out.println(TicTacPrint.printBoard(board));
            System.out.println("Waiting for computer...");
            Thread.sleep(1000); //computer is spending time in its complex algorithm :)
            if (turnCount == 1){
                boardPos = TicTacPrint.firstComputerMove(board);
            }
            else {
                boardPos = TicTacPrint.computerMove(board);
            }
            row = boardPos[0];
            column = boardPos[1];
            board[row][column] = "[O]";
           // System.out.println("computer tried to place in " + row + " row, and " + column + " column.");


         //   System.out.println(TicTacPrint.checkWin(board));
            if (TicTacPrint.checkWin(board).equals("oWin")){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("You lost!");
                System.exit(0);
            }
            if (TicTacPrint.checkWin(board).equals("xWin")){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("You won!");
                System.exit(0);
            }
            if (turnCount == 5){
                System.out.println(TicTacPrint.printBoard(board));
                System.out.println("It's a tie!");
                System.exit(0);
            }
            System.out.println("TURNCOUNT " + turnCount);
        }
    }
}
