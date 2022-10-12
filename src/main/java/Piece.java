public abstract class Piece {

    final String RED = "Red";
    final String BLUE = "Blue";
    final String GREEN =  "Green";
    final String YELLOW = "Yellow";
    final String ORANGE = "Orange";
    final String WHITE = "White";
    private int pieceX = 0;
    private int pieceY = 0;
    private int pieceZ = 0;
    private String colorX = "";
    private String colorY = "";
    private String colorZ = "";


    public int getPieceZ() {
        return pieceZ;
    }

    public void setPieceZ(int pieceZ) {
        this.pieceZ = pieceZ;
    }

    public int getPieceY() {
        return pieceY;
    }

    public void setPieceY(int pieceY) {
        this.pieceY = pieceY;
    }

    public int getPieceX() {
        return pieceX;
    }

    public void setPieceX(int pieceX) {
        this.pieceX = pieceX;
    }

    public abstract boolean isCenterPiece();
    public abstract boolean isEdgePiece();
    public abstract boolean isCornerPiece();

    public String getColorZ() {
        return colorZ;
    }

    public void setColorZ(String colorZ) {
        this.colorZ = colorZ;
    }

    public String getColorY() {
        return colorY;
    }

    public void setColorY(String colorY) {
        this.colorY = colorY;
    }

    public String getColorX() {
        return colorX;
    }

    public void setColorX(String colorX) {
        this.colorX = colorX;
    }
}
