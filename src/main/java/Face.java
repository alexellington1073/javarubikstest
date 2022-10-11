public class Face {

    private String faceColor = "";
    private Piece[][] face = new Piece[3][3];
    private String aboveFace = "";
    private String belowFace = "";
    private String leftFace = "";
    private String rightFace = "";


    public Face(String faceColor) {
        this.faceColor = faceColor;
        if (faceColor.equals("Red")) {
            aboveFace = "White";
            belowFace = "Yellow";
            leftFace = "Green";
            rightFace = "Blue";
        }
        if (faceColor.equals("Blue")) {
            aboveFace = "Yellow";
            belowFace = "White";
            leftFace = "Red";
            rightFace = "Orange";
        }
        if (faceColor.equals("Green")) {
            aboveFace = "White";
            belowFace = "Yellow";
            leftFace = "Orange";
            rightFace = "Red";
        }
        if (faceColor.equals("Yellow")) {
            aboveFace = "Red";
            belowFace = "Orange";
            leftFace = "Green";
            rightFace = "Blue";
        }
        if (faceColor.equals("Orange")) {
            aboveFace = "Yellow";
            belowFace = "White";
            leftFace = "Blue";
            rightFace = "Green";
        }
        if (faceColor.equals("White")) {
            aboveFace = "Orange";
            belowFace = "Red";
            leftFace = "Green";
            rightFace = "Blue";
        }
    }





    public Piece[][] getFace() {
        return face;
    }

    public void setFace(Piece[][] face) {
        this.face = face;
    }

    public String getFaceColor() {
        return faceColor;
    }

    public void setFaceColor(String faceColor) {
        this.faceColor = faceColor;
    }

    public String getAboveFace() {
        return aboveFace;
    }

    public String getBelowFace() {
        return belowFace;
    }

    public String getLeftFace() {
        return leftFace;
    }

    public String getRightFace() {
        return rightFace;
    }
}
