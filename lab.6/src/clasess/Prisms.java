package clasess;

import java.util.Arrays;

public class Prisms {
    private Prism[] prisms;

    public Prisms(int length) {
        this.prisms = new Prism[length];
    }

    public Prisms() {
        prisms = new Prism[0];
    }

    public Prism[] getPrisms() {
        return prisms;
    }

    public void add(Prism prism) {
        int n = 0;
        for (Prism prisms1 : prisms) {
            if (prisms1 == null) {
                break;
            } else {
                n++;
            }
            if (n==prisms.length){
                return;
            }
        }
        prisms[n] = prism;
    }

    public float getMaxDiagonal() {
        float maxDiagonal = 0;
        for (Prism prism : prisms) {
            if(prism.getDiagonal()>maxDiagonal) {
                maxDiagonal = prism.getDiagonal();
            }
        }
        return maxDiagonal;
    }

    public String toString() {
        String result = "Prisms :" + System.lineSeparator();
        for (Prism prism : prisms) {
            result += prism + System.lineSeparator();
        }
        return result;
    }
}
