public class Piece {

    final String RED = "Red";
    final String BLUE = "Blue";
    final String GREEN =  "Green";
    final String YELLOW = "Yellow";
    final String ORANGE = "Orange";
    final String WHITE = "White";
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

    public Piece() {

    }

    public Piece[] createFullPieceArr(Piece[] centerPieceArr,Piece[] edgePieceArr, Piece[] cornerPieceArr) {
        Piece[] fullPieceArr = new Piece[26];
        for (int i = 0; i < centerPieceArr.length; i ++) {
            fullPieceArr[i] = centerPieceArr[i];
        }
        for (int i = centerPieceArr.length; i < edgePieceArr.length + centerPieceArr.length; i++) {
            fullPieceArr[i-1] = edgePieceArr[i-centerPieceArr.length];
        }
        for (int i = centerPieceArr.length + edgePieceArr.length; i < centerPieceArr.length + edgePieceArr.length + centerPieceArr.length; i++) {
            fullPieceArr[i-2] = centerPieceArr[i - centerPieceArr.length - edgePieceArr.length];
        }
        return fullPieceArr;
    }
    //TODO finish method
    //count goes up to 4, checks number of stickers for edge OR (not and) corner pieces and returns string of first color found that doesnt have 4 stickers for that piece type.
    public String getNextColorNeeded(Piece[] pieceArr) {
        int redCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int yellowCount = 0;
        int orangeCount = 0;
        int whiteCount = 0;
        String colorNeeded = "";

        for (Piece piece : pieceArr) {

        }
        return colorNeeded;
    }

}
