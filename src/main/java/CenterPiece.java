public class CenterPiece extends Piece {

    private String colorX = "";


    public CenterPiece(){}
    public CenterPiece(String colorX) {
        this.colorX = colorX;
    }

    public CenterPiece[] createCenterPieces() {
        CenterPiece[] centerPieceArr = new CenterPiece[6];
        for (int i = 0; i < Colors.values().length; i++) {
            Colors[] colorValues = Colors.values();
            centerPieceArr[i] = new CenterPiece(colorValues[i].toString());
        } return centerPieceArr;
    }


    public String getColor() {
        return colorX;
    }

    public void setColor(String color) {
        this.colorX = color;
    }

}
