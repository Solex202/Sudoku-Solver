package org.example;

public class Sudoku {

    SudokuBoard sudokuBoard = new SudokuBoard();

    public void readUserInput(long randomValue) {

        if (randomValue < 0) {
            randomValue = -randomValue;
        }

        SudokuBoard sudokuBoard = new SudokuBoard();
//        List<Integer> sudokuRow = new ArrayList<>();
//        sudokuRow.add((int) randomValue);
        sudokuBoard.getSudokuBoard().add((int) randomValue);

        System.out.println(sudokuBoard.getSudokuBoard()) ;
        sudokuBoard.printSudokuBoard();
    }



    public static void num(String string){
        StringBuilder numberBuilder = new StringBuilder();
        StringBuilder letterBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
                numberBuilder.append(string.charAt(i));
            }else letterBuilder.append(string.charAt(i));
        }
        System.out.println(numberBuilder);
        System.out.println(letterBuilder);

    }




//    public String[] readUserInput(int[][][][] arr) {
//
//        List<List<String>> sudokuRow = new ArrayList<>();
//        System.out.println("Welcome to sudoku");
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                System.out.print("Enter numbers for row " + (j + 1) + ": ");
//
//                List<String> in = new ArrayList<>();
//
//                in.add(Arrays.deepToString(arr[i][j]));
//
//                sudokuRow.add(in);
//                System.out.print(Arrays.deepToString(arr[i][j]) + " \n");
//            }
//
//        }
//        sudokuBoard.setSudokuBoard(sudokuRow);
//        System.out.println(sudokuBoard.getSudokuBoard() + "print ");
//        System.out.println(sudokuRow + "print ");
//
//        return new String[0];
//
//        Inside the loop, display the prompt for the current row number.
//        Utilize the input() function along with list comprehension and the map() function to
//        convert the user input into a list of integers for the current row.
//                Append the obtained row to the Sudoku board (board) list.
//    }
}
