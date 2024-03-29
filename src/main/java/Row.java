import java.util.ArrayList;

public class Row {

    private final int numberOfSquares;

    private final char blankSquare = ' ';

    private int rowNumber;

    private String rowWord;

    private ArrayList<Square> squares = new ArrayList<>();

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public int getRowNumber(){
        return rowNumber;
    }

    public String getRowWord() {
        return rowWord;
    }

    public void setRowWord(String rowWord) {
        this.rowWord = rowWord;
    }

    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public Row(int numberOfSquares, int rowNumber){
        this.numberOfSquares = numberOfSquares;
        this.rowNumber = rowNumber;
        generateSquares();
    }

    private void generateSquares(){

        for(int i = 0; i < numberOfSquares; i++){

            squares.add(new Square(blankSquare, i + 1));

        }
    }

}
