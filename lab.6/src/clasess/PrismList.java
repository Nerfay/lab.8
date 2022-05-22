package clasess;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class PrismList implements Serializable {
    private final List<Prism> prisms;

    public PrismList() {
        prisms = new ArrayList<>();
    }

    public PrismList(List<Prism> prisms) {
        this.prisms = prisms;
    }

    public List<Prism> getPrism() {
        return prisms;
    }

    @Override
    public String toString() {
        return "Prisms " + prisms;
    }

    public boolean add(Prism prism) {
        return prisms.add(prism);
    }

    public void remove(int number) {
        if (number < prisms.size())
            prisms.remove(number);
    }

    public void remove(Prism prism) {
        prisms.remove(prism);
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
}
