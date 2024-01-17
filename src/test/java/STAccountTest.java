import org.example.STAccount;
import org.example.Sudoku;
import org.example.SudokuBoard;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class STAccountTest {

    STAccount stAccount = new STAccount();
    SudokuBoard sudokuBoard = new SudokuBoard();
    Sudoku sudoku = new Sudoku();


    @Test
    public void testComputeArithmetic_example1(){
        String result = stAccount.computeArithmetic("011000001457");
        assertEquals("0110000014579", result);
    }

    @Test
    public void testComputeArithmetic_example2(){
        String result = stAccount.computeArithmetic("000000022");
        assertEquals("0000000220", result);
    }

    @Test
    public void testSudoku(){
//        int [] [] arr1 = {{4, 8, 9}, {3, 1 ,5}, {2, 6, 7}};
//        int [] [] arr2 = {{1, 6, 2}, {4, 9 ,7}, {3, 5, 8}};
//        int [] [] arr3 = {{3, 5, 7}, {2, 8 ,6}, {9, 1, 4}};
//        int [] [] arr4 = {{8, 9, 5}, {6, 3 ,1}, {4, 7, 2}};
//        int [] [] arr5 = {{6, 2, 1}, {7, 4 ,8}, {5, 9, 3}};
//        int [] [] arr6 = {{7, 4, 3}, {5, 2 ,9}, {1, 8, 6}};
//        int [] [] arr7 = {{9, 1, 4}, {8, 7 ,3}, {6, 2, 5}};
//        int [] [] arr8 = {{2, 7, 6}, {1, 5 ,4}, {8, 3, 9}};
//        int [] [] arr9 = {{5, 3, 8}, {9, 6 ,2}, {7, 4, 1}};
//
//        int [][][][] sudArr = {{arr1, arr2, arr3}, {arr4, arr5, arr6}, {arr7, arr8, arr9}};

        SecureRandom secureRandom = new SecureRandom();

        System.out.println("Welcome to sudoku");
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter numbers for row " + (i + 1) + ": ");
            long randomValue = secureRandom.nextLong() % 900000000L + 100000000L;
            sudoku.readUserInput(randomValue);
        }
    }

    @Test
    public void print(){
//        sudokuBoard.printSudokuBoard();
    }

    @Test
    public void print_sudoku_board(){

        testSudoku();


    }

}
