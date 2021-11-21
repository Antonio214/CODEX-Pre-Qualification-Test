import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import constants.Messages;
import models.RectangleModel;
import modules.IntersectionVerifier;

public class TestRectIntersect {
    @Test
    public void shouldInformTwoRectsDontIntersect() {
        System.out.println("This should inform that rect (0,0;1,1) and rect (2,2;3,3) dont intersect");

        RectangleModel rectA = new RectangleModel("(0,0;1,1)");
        RectangleModel rectB = new RectangleModel("(2,2;3,3)");

        IntersectionVerifier verifier = new IntersectionVerifier();
        String resultMessage = verifier.verify(rectA, rectB);

        Assertions.assertEquals(Messages.DONT_INTERSECT_MESSAGE, resultMessage);
    }
}
