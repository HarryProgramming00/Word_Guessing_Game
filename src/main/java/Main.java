public class Main {

    public static void main(String[] args){
       Grid grid = gameSetUp();
       drawGrid(grid);
       playGame(grid);
       drawGrid(grid);
    }

    static private Grid gameSetUp(){
        return new Grid(5, 5);
    }

    static private void drawGrid(Grid grid){

        DrawGrid drawGrid = new DrawGrid(grid);
        drawGrid.drawTheGrid();
    }

    static private void playGame(Grid grid){

       String wordInputed = UserInput.getWord();
        grid.enterWord(wordInputed);

    }
}
