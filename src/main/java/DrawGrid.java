public class DrawGrid {

    private Grid grid;

    private char rowLine = '_';
    private char columnLine = '|';

    public DrawGrid(Grid grid){
        this.grid = grid;
    }

    public void drawTheGrid() {

        String drawnGrid = "";

        for (Row tempRow : grid.getRows()) {

            for (int i = 0; i < grid.getNumberOfSquares(); i++) {

                drawnGrid = drawnGrid + rowLine;
                drawnGrid = drawnGrid + rowLine;
            }

            drawnGrid = drawnGrid + "\n";

            for (Square tempSquare : tempRow.getSquares()) {
                drawnGrid = drawnGrid + columnLine;
                drawnGrid = drawnGrid + tempSquare.getLetter();

            }
            drawnGrid = drawnGrid + "\n";
        }

        System.out.println(drawnGrid);

    }
}










