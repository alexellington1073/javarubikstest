import java.util.List;

public class Face {

    private String faceFinalColor = "";
    private Piece[][] face = new Piece[3][3];
    private String aboveFace = "";
    private String belowFace = "";
    private String leftFace = "";
    private String rightFace = "";


    public Face(String facecolor) {
        faceFinalColor = facecolor;
        if (faceFinalColor.equals("Red")) {
            aboveFace = "White";
            belowFace = "Yellow";
            leftFace = "Green";
            rightFace = "Blue";
        }
        if (faceFinalColor.equals("Blue")) {
            aboveFace = "Yellow";
            belowFace = "White";
            leftFace = "Red";
            rightFace = "Orange";
        }
        if (faceFinalColor.equals("Green")) {
            aboveFace = "White";
            belowFace = "Yellow";
            leftFace = "Orange";
            rightFace = "Red";
        }
        if (faceFinalColor.equals("Yellow")) {
            aboveFace = "Red";
            belowFace = "Orange";
            leftFace = "Green";
            rightFace = "Blue";
        }
        if (faceFinalColor.equals("Orange")) {
            aboveFace = "Yellow";
            belowFace = "White";
            leftFace = "Blue";
            rightFace = "Green";
        }
        if (faceFinalColor.equals("White")) {
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

    public String getFaceFinalColor() {
        return faceFinalColor;
    }

    public void setFaceFinalColor(String faceFinalColor) {
        this.faceFinalColor = faceFinalColor;
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
