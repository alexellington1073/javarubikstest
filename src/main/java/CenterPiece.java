public class CenterPiece extends Piece {

    private String colorX = "";


    public CenterPiece(String colorX) {
        this.colorX = colorX;
    }


    public String getColor() {
        return colorX;
    }

    public void setColor(String color) {
        this.colorX = color;
    }

}
