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

    public int getPieceZ() {
        return pieceZ;
    }

    public void setPieceZ(int pieceZ) {
        this.pieceZ = pieceZ;
    }
    logan shelton
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

    public int[][] getCornerPositions() {

    }
//    private Piece[] fullPieceArr = new Piece[26];
//    private String colorX = "";
//    private String colorY = "";
//    private String colorZ = "";
//
//    public Piece(String colorX) {
//        this.colorX = colorX;
//    }
//
//    public Piece(String colorX, String colorY){
//        this.colorX = colorX;
//        this.colorY = colorY;
//    }
//
//    public Piece(String colorX, String colorY, String colorZ) {
//        this.colorX = colorX;
//        this.colorY = colorY;
//        this.colorZ = colorZ;
//    }
//
//    public Piece() {
//
//    }
//
//
//
//    public abstract boolean isCorner();
//    public String getColorY() {
//        return colorY;
//    }
//
//    public void setColorY(String colorY) {
//        this.colorY = colorY;
//    }
//
//    public String getColorZ() {
//        return colorZ;
//    }
//
//    public void setColorZ(String colorZ) {
//        this.colorZ = colorZ;
//    }
//
//    public void setColorX(String colorX) {
//        this.colorX = colorX;
//    }
//
//    public String getColorX() {
//        return colorX;
//    }
}
