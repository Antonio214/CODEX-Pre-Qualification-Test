package models;

public class RectangleModel {
    PointModel botLeftPoint, topLeftPoint, botRigthPoint, topRigthPoint;
    String stringRepresentation;
    PointModel[] edgePoints = new PointModel[4];

    public RectangleModel(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
        this.generateGivenPoints();
        this.generateSecondaryPoints();
        this.generateEdgesPoints();
    }

    // generate botLeft and TopRigth points, this points are provided
    private void generateGivenPoints() {
        String removedParenthesis = this.stringRepresentation.replace("(", "").replace(")", "");
        String[] pointsNotation = removedParenthesis.split(";");

        this.botLeftPoint = new PointModel(pointsNotation[0]);
        this.topRigthPoint = new PointModel(pointsNotation[1]);
    }

    // generate topLeft and botRigth point, this points are inferred
    private void generateSecondaryPoints() {
        this.topLeftPoint = new PointModel(this.botLeftPoint.xPosition, this.topRigthPoint.yPosition);
        this.botRigthPoint = new PointModel(this.topRigthPoint.xPosition, this.botLeftPoint.yPosition);
    }

    private void generateEdgesPoints() {
        this.edgePoints[0] = this.botLeftPoint;
        this.edgePoints[1] = this.topLeftPoint;
        this.edgePoints[2] = this.topRigthPoint;
        this.edgePoints[3] = this.botRigthPoint;
    }

    public PointModel[] listEdgePoints() {
        return this.edgePoints;
    }

    public boolean hasPoint(PointModel candidate) {
        for (PointModel point : edgePoints) {
            if (point.isEqual(candidate)) {
                return true;
            }
        }
        return false;
    }
}
