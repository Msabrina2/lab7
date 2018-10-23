/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoepart2;

/**
 *
 * @author Sabrina
 */
public class TicTacToePart2 {

    public String[][] board;
    public String player1;
    public String player2;
    public String currentPlayer;
    public String ChangePlayer;
    public String MakeMove;
    public String SpaceInUse;
    
    
    public void createBoard(){
        board = new String[3][3];
        player1="X";
        player2="O";
        currentPlayer = player1;
    }
    
    public String currentPlayer(){
        return currentPlayer;
    }
    
    public String ChangePlayer(){
        return ChangePlayer;
    } 
    
    public String MakeMove(){
    return MakeMove;
    }
    
    public String SpaceInUse(){
    return SpaceInUse;
}
}
