package models;

public class PointModel {
    int xPosition;
    int yPosition;
    String stringNotation;

    PointModel(String stringNotation) {
        this.stringNotation = stringNotation;
        this.generateIntergerPositions();
    }

    private void generateIntergerPositions() {
        String[] positionChars = this.stringNotation.split(",");

        this.xPosition = Integer.parseInt(positionChars[0]);
        this.yPosition = Integer.parseInt(positionChars[1]);
    }

    public boolean isEqual(PointModel candidate) {
        return this.xPosition == candidate.xPosition && this.yPosition == candidate.yPosition;
    }
}
