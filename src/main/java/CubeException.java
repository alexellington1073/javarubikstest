public class CubeException extends Exception{

    public CubeException(){super();}
    public CubeException(String message){super(message);}
    public CubeException(String message, Exception cause){super(message,cause);}

    public void duplicatePositionCheck(Piece[] fullPieceArr) throws CubeException {

        for (int i = 0; i < fullPieceArr.length; i++) {
            for (int j = 0; j < fullPieceArr.length; j++) {
                Piece currentPiece = fullPieceArr[i];
                Piece checkPiece = fullPieceArr[j];
                if (i == j) continue;
                if ((checkPiece.getPieceX() == currentPiece.getPieceX()) && (checkPiece.getPieceY() == currentPiece.getPieceY()) && (checkPiece.getPieceZ() == currentPiece.getPieceZ())) {
                    throw new CubeException(currentPiece + " and " + checkPiece + " are in the same position");
                }
            }
        }

    }

    public void validCornerPositions(Piece[] cornerPieceArr) throws CubeException {

        for (Piece corner : cornerPieceArr) {
            if (corner.getPieceX() == 0 || corner.getPieceY() == 0 || corner.getPieceZ() == 0) {
                throw new CubeException("Corner out of place at: " + corner.getPieceX() + "X " + corner.getPieceY() + "Y " + corner.getPieceZ() + "Z");
            }
        }
    }



}
