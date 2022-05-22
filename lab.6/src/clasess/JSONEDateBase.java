package clasess;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class JSONEDateBase {

    public static void serializeSquareJSONE (SquareList squareList) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/JSONEDateBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() +"sq.json"), squareList);
    }

    public static void serializePrismJSONE (PrismList prismList) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/JSONEDateBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() +"pr.json"), prismList);
    }

    public static SquareList deserializeSquareJSONE() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/JSONEDateBase").listFiles())[Objects.requireNonNull(new File("./src/JSONEDateBase").listFiles()).length-1], SquareList.class);
    }

    public static PrismList deserializePrismJSONE() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/JSONEDateBase").listFiles())[Objects.requireNonNull(new File("./src/JSONEDateBase").listFiles()).length-2], PrismList.class);
    }

}