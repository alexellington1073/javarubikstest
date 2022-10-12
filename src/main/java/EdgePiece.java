public class EdgePiece extends Piece {

    private String colorX = "";
    private String colorY = "";




    public EdgePiece(String colorX, String colorY) {
        this.colorX = colorX;
        this.colorY = colorY;
    }

    public EdgePiece() {

    }

//    @Override
    public boolean isCorner() {
        return false;
    }

    //TODO use getNextColorNeeded to populate colors
    public EdgePiece[] createEdgePieces() {
        EdgePiece[] edgePieceArr = new EdgePiece[12];
        for(int i = 0; i < edgePieceArr.length; i++) {
            EdgePiece ep = new EdgePiece();


            edgePieceArr[i] = ep;
            }
        return edgePieceArr;
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

}
