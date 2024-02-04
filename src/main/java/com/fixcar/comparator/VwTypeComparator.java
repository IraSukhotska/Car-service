package main.java.com.fixcar.comparator;
import main.java.com.fixcar.model.Vw;
import java.util.Comparator;

public class VwTypeComparator implements Comparator<Vw> {

    @Override
    public int compare(Vw vw1, Vw vw2) {
        return convertType(vw1.getType()) - convertType(vw2.getType());
    }

    private static int convertType (String type) {
        return switch (type) {
            case Vw.classA -> 1;
            case Vw.classB -> 2;
            case Vw.classC -> 3;
            case Vw.classD -> 4;
            case Vw.SUV -> 5;
            case Vw.Comerc -> 6;
            default -> 0;
        };
    }
}
