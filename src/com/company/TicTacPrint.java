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
                        "-------------" + "\n" +
                        a[0][1] + " | " + a[1][1] + " | " + a[2][1] + "\n" +
                        "-------------" + "\n" +
                        a[0][2] + " | " + a[1][2] + " | " + a[2][2] + "\n"
                ;


    }
}
