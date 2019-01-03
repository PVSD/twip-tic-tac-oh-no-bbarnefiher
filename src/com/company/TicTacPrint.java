package com.company;

/**
 * Created by bb222 on 12/17/18.
 */
public class TicTacPrint {
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
        if (c[0][0].equals("[X]") && c[1][1].equals("[5]")){
            boardPos[0] = 1;
            boardPos[1] = 1;
        }
        else if (c[0][0].equals("[1]")){
            boardPos[0] = 0;
            boardPos[1] = 0;
        }
        return boardPos;
    }
    static int horizCount = 0;
    public static int[] computerMove(String[][] c){





        return boardPos;
    }


  /*  public static String checkWin(String[][] d){
        for (int i = 0; i < ; i++) {
            
        }
        else {
            return "no";
        }
    }*/
}
