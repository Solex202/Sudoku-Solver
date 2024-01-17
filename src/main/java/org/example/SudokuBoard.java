package org.example;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<Integer> sudokuRow;

    public SudokuBoard() {
        this.sudokuRow = new ArrayList<>();
    }

    public List<Integer> getSudokuBoard() {
        return sudokuRow;
    }

    public void setSudokuBoard(List<Integer> sudokuRow) {
        this.sudokuRow = sudokuRow;
    }

    public void printSudokuBoard() {
        System.out.println(sudokuRow);
    }
}
