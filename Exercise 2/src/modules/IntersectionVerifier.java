package modules;

import constants.Messages;
import models.PointModel;
import models.RectangleModel;

public class IntersectionVerifier {

    // if one of rect B point is inside rect A than they intersect
    // or if they share a common edge point they intersect
    public String verify(RectangleModel rectA, RectangleModel rectB) {
        PointModel[] pointsOfB = rectB.listEdgePoints();

        for (PointModel point : pointsOfB) {
            if (rectA.hasPoint(point)) {
                return Messages.INTERSECT_MESSAGE;
            }
        }

        return Messages.DONT_INTERSECT_MESSAGE;
    }
}
