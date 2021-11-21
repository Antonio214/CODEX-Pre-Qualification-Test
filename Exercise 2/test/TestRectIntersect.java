import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import constants.Messages;
import models.RectangleModel;
import modules.IntersectionVerifier;

public class TestRectIntersect {
    RectangleModel rectA = new RectangleModel("(0,0;1,1)");
    RectangleModel rectB = new RectangleModel("(2,2;3,3)");
    RectangleModel rectC = new RectangleModel("(1,1;3,3)");
    RectangleModel rectD = new RectangleModel("(0,0;2,2)");

    RectangleModel eRectA = new RectangleModel("(3,5;11,11)");
    RectangleModel eRectB = new RectangleModel("(7,2;13,7)");
    RectangleModel eRectC = new RectangleModel("(11,11;15,13)");

    IntersectionVerifier verifier = new IntersectionVerifier();

    @Test
    public void shouldInformTwoRectsDontIntersect() {
        System.out.println("This should inform that rect (0,0;1,1) and rect (2,2;3,3) dont intersect");
        String resultMessage = verifier.verify(rectA, rectB);

        Assertions.assertEquals(Messages.DONT_INTERSECT_MESSAGE, resultMessage);
    }

    @Test
    public void shouldInformSameRectIntersect() {
        System.out.println("This should inform that rect (0,0;1,1) and rect (0,0;1,1) intersect");
        String resultMessage = verifier.verify(rectA, rectA);

        Assertions.assertEquals(Messages.INTERSECT_MESSAGE, resultMessage);
    }

    @Test
    public void shouldInformSameEdgeRectIntersect() {
        System.out.println("This should inform that rect (0,0;1,1) and rect (1,1;3,3) intersect");
        String resultMessage = verifier.verify(rectA, rectC);

        Assertions.assertEquals(Messages.INTERSECT_MESSAGE, resultMessage);
    }

    @Test
    public void shouldInformRectIntersect() {
        System.out.println("This should inform that rect (0,0;2,2) and rect (1,1;3,3) intersect");
        String resultMessage = verifier.verify(rectC, rectD);

        Assertions.assertEquals(Messages.INTERSECT_MESSAGE, resultMessage);
    }

    @Test
    public void shouldPassExample() {
        System.out.println("This should replicate the tests from example");

        Assertions.assertEquals(Messages.INTERSECT_MESSAGE, verifier.verify(eRectA, eRectB));
        Assertions.assertEquals(Messages.INTERSECT_MESSAGE, verifier.verify(eRectA, eRectC));
        Assertions.assertEquals(Messages.DONT_INTERSECT_MESSAGE, verifier.verify(eRectB, eRectC));
    }
}
