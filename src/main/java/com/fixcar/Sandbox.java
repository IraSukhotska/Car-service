package main.java.com.fixcar;

import main.java.com.fixcar.comparator.VwTypeComparator;
import main.java.com.fixcar.model.Vw;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        Vw[] vags = {
                new Vw(Vw.classA),
                new Vw(Vw.classB),
                new Vw(Vw.classB),
                new Vw(Vw.classC),
                new Vw(Vw.classD),
        };

        Arrays.sort(vags, new VwTypeComparator());

        for (Vw vw : vags) {
            System.out.println(vw.getType());
        }
    }
}
