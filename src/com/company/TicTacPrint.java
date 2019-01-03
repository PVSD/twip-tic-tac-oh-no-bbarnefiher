package com.company;

import java.util.Random;

/**
 * Created by bb222 on 12/17/18.
 */
public class TicTacPrint {
    static Random rd = new Random();
    public TicTacPrint(){

    }
    public static String printBoard(String[][] a){


        return
                        a[0][0] + " | " + a[1][0] + " | " + a[2][0] + "\n" +
                        "----------------" + "\n" +
                        a[0][1] + " | " + a[1][1] + " | " + a[2][1] + "\n" +
                        "----------------" + "\n" +
                        a[0][2] + " | " + a[1][2] + " | " + a[2][2] + "\n"
                ;


    }

    static int boardPos[] = new int[2];
    public static int[] convertIntToBoardPos(int b){
        if (b == 1){
            boardPos[0] = 0; //columns
            boardPos[1] = 0; //rows
        }
        else if (b == 2){
            boardPos[0] = 0;
            boardPos[1] = 1;
        }
        else if (b == 3){
            boardPos[0] = 0;
            boardPos[1] = 2;
        }
        else if (b == 4){
            boardPos[0] = 1;
            boardPos[1] = 0;
        }
        else if (b == 5){
            boardPos[0] = 1;
            boardPos[1] = 1;
        }
        else if (b == 6){
            boardPos[0] = 1;
            boardPos[1] = 2;
        }
        else if (b == 7){
            boardPos[0] = 2;
            boardPos[1] = 0;
        }
        else if (b == 8){
            boardPos[0] = 2;
            boardPos[1] = 1;
        }
        else if (b == 9){
            boardPos[0] = 2;
            boardPos[1] = 2;
        }
        return boardPos;
    }


    public static int[] firstComputerMove(String[][] c) {
        //Computer prioritizes first move in top left, if its taken it will go middle
        if ((c[0][0].equals("[X]") || c[2][0].equals("[X]") || c[0][2].equals("[X]") || c[2][2].equals("[X]")) && c[1][1].equals("[5]")){
            boardPos[0] = 1;
            boardPos[1] = 1;
        }
        else if (c[0][0].equals("[1]")){
            boardPos[0] = 0;
            boardPos[1] = 0;
        }
        return boardPos;
    }
    static int x = 0;
    static int y = 0;
    static int testCount = 0;
    public static int[] computerMove(String[][] c){
        while(true){
            testCount++;
            y = rd.nextInt(3);
            x = rd.nextInt(3);

            if (!((c[x][y].equals("[X]")) || (c[x][y].equals("[O]")))){
                boardPos[0] = x;
                boardPos[1] = y;
                break;
            }

        }




        return boardPos;
    }

    static int xCount = 0;
    static int oCount = 0;
    static int turnCount = 0;
    public static String checkWin(String[][] d){
        turnCount++;
        xCount = 0;
        for (int i = 0; i < 9; i++) { //Check horizontal wins
            if (i % 3 == 0){
                xCount = 0;
            }
            if (d[i/3][i%3].equals("[X]")){
                xCount++;


                if (xCount == 3){
                    return "xWin";
                }
            }
        }
        xCount = 0;
        for (int i = 0; i < 9; i++) { //Check vertical wins
            if (i % 3 == 0){
                xCount = 0;
            }
            if (d[i%3][i/3].equals("[X]")){
                xCount++;


                if (xCount == 3){
                    return "xWin";
                }
            }
        }
        if (d[0][0].equals("[X]") && d[1][1].equals("[X]") && d[2][2].equals("[X]") || d[2][0].equals("[X]") && d[1][1].equals("[X]") && d[0][2].equals("[X]")){ //Check diagonal wins
            return "xWin";
        }

        /////////////////// O COMPUTER PART
        oCount = 0;
        for (int i = 0; i < 9; i++) { //Check horizontal wins
            if (i % 3 == 0){
                oCount = 0;
            }
            if (d[i/3][i%3].equals("[O]")){
                oCount++;


                if (oCount == 3){
                    return "oWin";
                }
            }
        }
        oCount = 0;
        for (int i = 0; i < 9; i++) { //Check vertical wins
            if (i % 3 == 0){
                oCount = 0;
            }
            if (d[i%3][i/3].equals("[O]")){
                oCount++;


                if (oCount == 3){
                    return "oWin";
                }
            }
        }
        if (d[0][0].equals("[O]") && d[1][1].equals("[O]") && d[2][2].equals("[O]") || d[2][0].equals("[O]") && d[1][1].equals("[O]") && d[0][2].equals("[O]")){ //Check diagonal wins
            return "oWin";
        }
        ////////////if tie
       // if (turnCount == 9){
        //    return "tie";
       // }

        return "undecided";
    }
}
