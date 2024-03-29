import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int numberOfRows;
    private final int numberOfSquares;

    private ArrayList<Row> rows = new ArrayList<>();

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public Grid(int numberOfRows, int numberOfSquares){
        this.numberOfRows = numberOfRows;
        this.numberOfSquares = numberOfSquares;
        generateRows();
    }

    private void generateRows(){

        for(int i = 0; i < numberOfRows; i++){

            rows.add(new Row(numberOfSquares));

        }
    }
}
