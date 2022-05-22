package clasess;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class DateBase {
    public static void serializeSquare(SquareList squareList) {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/DateBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".sq");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(squareList);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void serializePrism(PrismList prismList) {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/DateBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".pr");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(prismList);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static SquareList deserializeSquare() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DateBase").listFiles())[Objects.requireNonNull(new File("./src/DateBase").listFiles()).length - 1]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SquareList squareList = (SquareList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return squareList;
    }

    public static PrismList deserializePrism() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DateBase").listFiles())[Objects.requireNonNull(new File("./src/DateBase").listFiles()).length - 2]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        PrismList prismList = (PrismList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return prismList;
    }
}