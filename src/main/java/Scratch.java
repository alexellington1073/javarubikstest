public class Scratch {

    public static void main(String[] args) {
        Piece p = new Piece();
        CenterPiece cep = new CenterPiece();
        EdgePiece edp = new EdgePiece();
        CornerPiece cop = new CornerPiece();
        p.createFullPieceArr(cep.createCenterPieces(),edp.createEdgePieces(),cop.createCornerPieces());

    }

}
