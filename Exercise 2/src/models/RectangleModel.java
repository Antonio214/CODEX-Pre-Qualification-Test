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
        this.botLeftPoint = new PointModel("0,0");
        this.topRigthPoint = new PointModel("1,1");
    }

    // generate topLeft and botRigth point, this points are inferred
    private void generateSecondaryPoints() {
        this.topLeftPoint = new PointModel("0,1");
        this.botRigthPoint = new PointModel("1,0");
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
