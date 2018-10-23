/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoepart2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Sabrina
 */
public class TicTacToePart2Test {
    
    public TicTacToePart2Test() {
    }

    /**
     * Test of main method, of class TicTacToePart2.
     */
    @Test
    public void testcreateBoard() {
        //System.out.println("main");
        //String[] args = null;
        //TicTacToePart2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        TicTacToePart2 instance = new TicTacToePart2();
        instance.createBoard();
        assertEquals(9, instance.board[0].length * instance.board[1].length);
    }
    
    @Test
    public void testCurrentPlayer(){
        TicTacToePart2 instance = new TicTacToePart2();
        instance.createBoard();
        assertEquals("X", instance.currentPlayer());
    }
    
    @Test
    public void testChangePlayer(){
        TicTacToePart2 instance = new TicTacToePart2();
        instance.ChangePlayer();
        assertEquals("O", instance.ChangePlayer());
    }
    @Test
    public void testMakeMove(){
        TicTacToePart2 instance = new TicTacToePart2();
        instance.MakeMove();
 //////       assertEquals("O", instance.MakeMove());
    
}
    @Test
    public void testSpaceInUse(){
        TicTacToePart2 instance = new TicTacToePart2();
        instance.SpaceInUse();
 /////       assertEquals("O", instance.SpaceInUse());
    
    }
}

