
package array6hafizaexercise;

import java.util.Scanner;

public class Array6Hafizaexercise {
    private static Kart [][] cards = new Kart[4][4];

    public static void main(String[] args) {
        
       cards[0][0] = new Kart ('E');
       cards[0][1] = new Kart ('A');
       cards[0][2] = new Kart ('B');
       cards[0][3] = new Kart ('F');
       cards[1][0] = new Kart ('G');
       cards[1][1] = new Kart ('A');
       cards[1][2] = new Kart ('D');
       cards[1][3] = new Kart ('H');
       cards[2][0] = new Kart ('F');
       cards[2][1] = new Kart ('C');
       cards[2][2] = new Kart ('D');
       cards[2][3] = new Kart ('H');
       cards[3][0] = new Kart ('E');
       cards[3][1] = new Kart ('G');
       cards[3][2] = new Kart ('B');
       cards[3][3] = new Kart ('C');
        
        //GameBoard();
        
        while (GameOver()== false) {   
            GameBoard();
            MakeGuess();
        }
    }
    public static void GameBoard (){
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("___________________");
            for (int j = 0 ; j < 4 ; j++){
                if (cards [i][j].isGuess()){
                    System.out.print(" |" + cards [i][j].getVariable() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("___________________");
    }
    
    public static boolean GameOver (){
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 4 ; j++){
                if (cards[i][j].isGuess() == false) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void MakeGuess (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Guess (Use Space Between Numbers): ");
        int i1= scanner.nextInt();
        int j1= scanner.nextInt();
        cards[i1][j1].setGuess(true);
        GameBoard();
        System.out.print("Enter Second Guess (Use Space Between Numbers): ");
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
        if (cards[i1][j1].getVariable() == cards[i2][j2].getVariable()){
            System.out.println("Congrats :)");
            cards[i2][j2].setGuess(true);
        }
        else{
            System.out.println("Wrong Guess :(");
            cards[i1][j1].setGuess(false);
        }
    }
    
    
    
    
}
