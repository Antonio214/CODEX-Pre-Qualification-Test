import models.RectangleModel;
import modules.IntersectionVerifier;

public class App {
    public static void main(String[] args) throws Exception {
        RectangleModel rectA = new RectangleModel("(0,0;1,1)");
        IntersectionVerifier verifier = new IntersectionVerifier();

        System.out.println(verifier.verify(rectA, rectA));
    }
}
