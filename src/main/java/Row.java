import java.util.ArrayList;

public class Row {

    private final int numberOfSquares;

    private final char blankSquare = ' ';

    private ArrayList<Square> squares = new ArrayList<>();

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public Row(int numberOfSquares){
        this.numberOfSquares = numberOfSquares;
        generateSquares();
    }

    private void generateSquares(){

        for(int i = 0; i < numberOfSquares; i++){

            squares.add(new Square(blankSquare));

        }
    }
}
