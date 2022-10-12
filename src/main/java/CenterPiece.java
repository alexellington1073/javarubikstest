public class CenterPiece extends Piece {

    private String colorX = "";


    public CenterPiece(){}

//    @Override
    public boolean isCorner() {
        return false;
    }

    public CenterPiece(String colorX) {
        this.colorX = colorX;
    }

    public CenterPiece[] createCenterPieces() {
        CenterPiece[] centerPieceArr = new CenterPiece[6];
        int count = 0;
        for (Colors color : Colors.values()) {
            CenterPiece cp = new CenterPiece();
            cp.setColorX(String.valueOf(color));
            centerPieceArr[count] = cp;
            count++;
        }
        return centerPieceArr;
    }


    public String getColorX() {
        return colorX;
    }

    public void setColorX(String color) {
        this.colorX = color;
    }

}
