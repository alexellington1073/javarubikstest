public class Scratch {

    public static void main(String[] args) throws CubeException {
        CubeException ce = new CubeException();
        Cube c = new Cube();
//        CenterPiece cep = new CenterPiece();
//        EdgePiece edp = new EdgePiece();
//        CornerPiece cop = new CornerPiece();
//        CenterPiece[] centerPieceArr = cep.createCenterPieces();
//        EdgePiece[] edgePieceArr = edp.createEdgePieces();
//        CornerPiece[] cornerPieceArr = cop.createCornerPieces();
//        Piece[] fullPieceArr = c.createFullPieceArr(cornerPieceArr,centerPieceArr,edgePieceArr);


        Piece[] fullCube = c.setPieces();
        c.applyStickers(fullCube);
        System.out.println("test");
//        ce.duplicatePositionCheck(fullCube);
        c.rotateSide("x",-1,false,fullCube);
        c.printCube(fullCube);
        System.out.println("test");
    }

}
