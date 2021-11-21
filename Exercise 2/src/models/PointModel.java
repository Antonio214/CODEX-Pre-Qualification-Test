package models;

public class PointModel {
    int xPosition;
    int yPosition;
    String stringNotation;

    PointModel(String stringNotation) {
        this.stringNotation = stringNotation;
        this.generateIntergerPositions();
    }

    PointModel(Integer xPosition, Integer yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.generateString();
    }

    private void generateIntergerPositions() {
        String[] positionChars = this.stringNotation.split(",");

        this.xPosition = Integer.parseInt(positionChars[0]);
        this.yPosition = Integer.parseInt(positionChars[1]);
    }

    public boolean isEqual(PointModel candidate) {
        return this.xPosition == candidate.xPosition && this.yPosition == candidate.yPosition;
    }

    private void generateString() {
        this.stringNotation = Integer.toString(xPosition) + ";" + Integer.toString(yPosition);
    }
}
