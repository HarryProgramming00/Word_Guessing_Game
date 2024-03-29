import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int numberOfRows;
    private final int numberOfSquares;
    private int numberOfWordsInputed = 0;

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

            rows.add(new Row(numberOfSquares, i+1));

        }
    }

    public void enterWord(String word){
        for(Row tempRow : rows){
            if(tempRow.getRowNumber() == (numberOfWordsInputed + 1)){
                tempRow.setRowWord(word);

                for(Square tempSquare : tempRow.getSquares()){
                    tempSquare.setLetter(word.charAt(tempSquare.getSquareNumber() - 1));
                }
            }
            break;
        }
    }
}
