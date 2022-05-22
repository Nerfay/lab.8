package clasess;

import clasess.Square;

import java.util.Arrays;

public class Squares {
    private Square[] squares;

    public Squares(int length) {
        this.squares = new Square[length];
    }

    public Squares() {
        squares = new Square[0];
    }

    public Square[] getSquares() {
        return squares;
    }

    public void add(Square square) {
        int n = 0;
        for (Square square1 : squares) {
            if (square1 == null) {
                break;
            } else {
                n++;
            }
        }
        squares[n] = square;
    }

    public float getMaxSquare() {
        float maxSquare = 0;
        for (Square square : squares) {
            if(square.getSquareOfSquare()> maxSquare) {
                maxSquare = square.getSquareOfSquare();
            }
        }
        return maxSquare;
    }


    @Override
    public String toString() {
        String result = "Square :" + System.lineSeparator();
        for (Square square : squares) {
            result += square + System.lineSeparator();
        }
        return result;
    }
}