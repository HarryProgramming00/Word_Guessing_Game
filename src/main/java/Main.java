public class Main {

    public static void main(String[] args){
        Grid grid = new Grid(5, 5);

       DrawGrid drawGrid = new DrawGrid(grid);
       drawGrid.drawTheGrid();
    }
}
