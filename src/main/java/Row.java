import java.util.ArrayList;

public class Row {

    private final int numberOfSquares;

    private ArrayList<Square> rows = new ArrayList<>();

    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public Row(int numberOfSquares){
        this.numberOfSquares = numberOfSquares;
    }
}
