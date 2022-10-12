public class CornerPiece extends Piece {

    private String colorX = "";
    private String colorY = "";
    private String colorZ = "";


    public CornerPiece(String colorX, String colorY, String colorZ) {
        this.colorX = colorX;
        this.colorY = colorY;
        this.colorZ = colorZ;
    }

    public CornerPiece() {

    }


    public String getColorX() {
        return colorX;
    }

    public void setColorX(String colorX) {
        this.colorX = colorX;
    }

    public String getColorY() {
        return colorY;
    }

    public void setColorY(String colorY) {
        this.colorY = colorY;
    }

    public String getColorZ() {
        return colorZ;
    }

    public void setColorZ(String colorZ) {
        this.colorZ = colorZ;
    }

    //TODO use getNextColorNeeded to populate colors
    public CornerPiece[] createCornerPieces() {
        CornerPiece[] cornerPieceArr = new CornerPiece[8];
        for (int i = 0; i < 8; i ++) {
            CornerPiece cp = new CornerPiece();
            cornerPieceArr[i] = cp;
        }
        return cornerPieceArr;
    }

    @Override
    public boolean isCenterPiece() {
        return false;
    }

    @Override
    public boolean isEdgePiece() {
        return false;
    }

    @Override
    public boolean isCornerPiece(){
        return true;
    }
}
