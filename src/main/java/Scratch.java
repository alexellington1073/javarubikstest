public class Scratch {

    public static void main(String[] args) {
        Cube c = new Cube();
        CenterPiece cep = new CenterPiece();
        EdgePiece edp = new EdgePiece();
        CornerPiece cop = new CornerPiece();
        CenterPiece[] centerPieceArr = cep.createCenterPieces();
        EdgePiece[] edgePieceArr = edp.createEdgePieces();
        CornerPiece[] cornerPieceArr = cop.createCornerPieces();
        Piece[] fullPieceArr = c.createFullPieceArr(centerPieceArr,edgePieceArr,cornerPieceArr);

//        c.popColors(cornerPieceArr);
        System.out.println(cornerPieceArr);
    }

}
