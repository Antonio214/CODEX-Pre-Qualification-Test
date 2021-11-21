import java.io.BufferedReader;
import java.io.InputStreamReader;

import models.RectangleModel;
import modules.IntersectionVerifier;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insira dois retângulos no formato (x1,y1;x2,y2):");
        System.out.println("Retângulo A: ");
        String recAString = reader.readLine();
        System.out.println("Retângulo B: ");
        String recBString = reader.readLine();

        RectangleModel rectA = new RectangleModel(recAString);
        RectangleModel rectB = new RectangleModel(recBString);
        IntersectionVerifier verifier = new IntersectionVerifier();

        System.out.println(verifier.verify(rectA, rectB));
    }
}
