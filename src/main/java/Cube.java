import java.util.ArrayList;
import java.util.List;

public class Cube {

    public Cube() {
    }

    public Piece[] createFullPieceArr(Piece[] centerPieceArr, Piece[] edgePieceArr, Piece[] cornerPieceArr) {
        Piece[] fullPieceArr = new Piece[26];
        for (int i = 0; i < centerPieceArr.length; i++) {
            fullPieceArr[i] = centerPieceArr[i];
        }
        for (int i = centerPieceArr.length; i < edgePieceArr.length + centerPieceArr.length; i++) {
            fullPieceArr[i] = edgePieceArr[i - centerPieceArr.length];
        }
        for (int i = centerPieceArr.length + edgePieceArr.length; i < centerPieceArr.length + edgePieceArr.length + cornerPieceArr.length; i++) {
            fullPieceArr[i] = cornerPieceArr[i - centerPieceArr.length - edgePieceArr.length];
        }
        return fullPieceArr;
    }

    public Piece[] setPieces() {

        Piece[] fullCube = new Piece[26];
        int count = 0;


            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    for (int z = -1; z <= 1; z++) {
//                        while (count != 26) {
                        int zeroCount = 0;
                        if (x == 0) zeroCount++;
                        if (y == 0) zeroCount++;
                        if (z == 0) zeroCount++;

                        switch (zeroCount) {
                            case 0:
                                CornerPiece corner = new CornerPiece();
                                corner.setPieceX(x);
                                corner.setPieceY(y);
                                corner.setPieceZ(z);
                                fullCube[count] = corner;
                                count++;
                                break;
                            case 1:
                                EdgePiece edge = new EdgePiece();
                                edge.setPieceX(x);
                                edge.setPieceY(y);
                                edge.setPieceZ(z);
                                fullCube[count] = edge;
                                count++;
                                break;
                            case 2:
                                CenterPiece center = new CenterPiece();
                                center.setPieceX(x);
                                center.setPieceY(y);
                                center.setPieceZ(z);
                                fullCube[count] = center;
                                count++;
                                break;
                            case 3:
                                break;
                        }

//                    if (x == 0 && y == 0 && z == 0) continue; //no piece in the core
//
//                    if ((y == -1 || y == 1) && (x != 0 && z != 0)) { // set corners
//                        CornerPiece cornerPiece = new CornerPiece();
//                        cornerPiece.setPieceX(x);
//                        cornerPiece.setPieceY(y);
//                        cornerPiece.setPieceZ(z);
//                        fullCube[cornerCount] = cornerPiece;
//                        cornerCount++;
//                    } else if ((y == 0 && ((x != 0 && z == 0) || (x == 0 && z != 0))) // middle layer cases
//                            || (y != 0 && (x == 0 && z == 0)) //upper and lower layer cases
//                    ) {
//                        CenterPiece centerPiece = new CenterPiece();
//                        centerPiece.setPieceX(x);
//                        centerPiece.setPieceY(y);
//                        centerPiece.setPieceZ(z);
//                        fullCube[centerCount + cornerCount] = centerPiece;
//                        centerCount++;
//                    } else {
//                        EdgePiece edgePiece = new EdgePiece();
//                        edgePiece.setPieceX(x);
//                        edgePiece.setPieceY(y);
//                        edgePiece.setPieceZ(z);
//                        fullCube[edgeCount+centerCount+cornerCount] = edgePiece;
//                        edgeCount++;
//                    }


                    }
                }
            }

        return fullCube;
    }


    public void applyStickers(Piece[] fullCube) {

        for (Piece piece : fullCube) {
            if (piece.getPieceY() == -1) piece.setColorY("White");
            if (piece.getPieceY() == 1) piece.setColorY("Yellow");
            if (piece.getPieceX() == -1) piece.setColorX("Red");
            if (piece.getPieceX() == 1) piece.setColorX("Orange");
            if (piece.getPieceZ() == -1) piece.setColorZ("Blue");
            if (piece.getPieceZ() == 1) piece.setColorZ("Green");
        }

    }

    public void rotateSide(String xyz, int position, boolean isClockwise) {

    }
}

