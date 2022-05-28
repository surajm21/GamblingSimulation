package com.bridglabz;

public class Gambler {

    public static void startGambling(){
        int StartingAmount = 100;
        int BetPerAmount = 1;
        int BetResult = (int) Math.floor(Math.random() * 10) % 2 ;
            if ( BetResult == BetPerAmount){

                System.out.println("win");
            }
            else
                System.out.println("loos");
    }

    public static void main(String[] args) {
        startGambling();
    }
}
