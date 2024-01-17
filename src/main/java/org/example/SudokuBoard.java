package org.example;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private Block[] blocks ;

    public SudokuBoard(){
        blocks = new Block[8];
    }
    public Block[] getBlocks() {
        return blocks;
    }

    public void setBlocks(Block[] block) {
        this.blocks = block;
    }


//    private List<Integer> sudokuRow;


//    public void printSudokuBoard() {
//        System.out.println(sudokuRow);
//    }
}
