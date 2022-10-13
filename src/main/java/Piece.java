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

    private int[] piecePosXYZ = (new int[]{pieceX,pieceY,pieceZ});
    private String colorX = "";
    private String colorY = "";
    private String colorZ = "";

    private String[] colorXYZ = (new String[]{colorX,colorY,colorZ});

    public int getZeroCount() {
        int zeroCount = 0; //3 = core, 2 = center, 1 = edge, 0 = corner
        if (pieceX == 0) zeroCount++;
        if (pieceY == 0) zeroCount++;
        if (pieceZ == 0) zeroCount++;
        return zeroCount;
    }



    //TODO cleanup Piece

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

    public int[] getPiecePosXYZ() {
        return piecePosXYZ;
    }

    public int getPiecePosXYZ(int pos) {
        return piecePosXYZ[pos];
    }

    public void setPiecePosXYZ(int[] piecePosXYZ) {
        this.piecePosXYZ = piecePosXYZ;
    }

    public void setPiecePosXYZ(int xyz,int newPos) {
        piecePosXYZ[xyz] = newPos;
    }

    public String[] getColorXYZ() {
        return colorXYZ;
    }

    public String getColorXYZ(int pos) {
        return colorXYZ[pos];
    }

    public void setColorXYZ(int pos, String color) {
        colorXYZ[pos] = color;
    }
}
