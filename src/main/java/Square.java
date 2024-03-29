public class Square {

    private char letter;


    private final int squareNumber;
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public Square(char letter, int squareNumber){
        this.letter = letter;
        this.squareNumber = squareNumber;

    }
}
