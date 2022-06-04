package com.bridglabz;

public class Gambler {
    public static void startGambling() {
        int StartingAmount =100;
        int BetPerAmount  = 1;
        while ( StartingAmount  != 150 || StartingAmount  !=50) {
            int bet_result = (int) (Math.random() * 10) % 2;
            if (bet_result == 0) {
                StartingAmount = BetPerAmount - StartingAmount;
            } else {

                StartingAmount = BetPerAmount + StartingAmount;
            }
            if(StartingAmount  == 150) {
                System.out.println("Won 50% of the stake ");
               break; }
            else if (StartingAmount  == 50)
            {
                System.out.println("Lost 50 % of the stake");
               break; }
        }
    }
    public static void main (String[]args){
        Gambler play = new Gambler();
        play.startGambling();
    }
}

