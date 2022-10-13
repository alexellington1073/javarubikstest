import java.util.Arrays;

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
                    int[] xyz = new int[]{x, y, z};
                    int zeroCount = 0;
                    if (x == 0) zeroCount++;
                    if (y == 0) zeroCount++;
                    if (z == 0) zeroCount++;

                    switch (zeroCount) {
                        case 0:
                            CornerPiece corner = new CornerPiece();
                            corner.setPiecePosXYZ(xyz);

//                            corner.setPieceX(x);
//                            corner.setPieceY(y);
//                            corner.setPieceZ(z);
                            fullCube[count] = corner;
                            count++;
                            break;
                        case 1:
                            EdgePiece edge = new EdgePiece();
                            edge.setPiecePosXYZ(xyz);

//                            edge.setPieceX(x);
//                            edge.setPieceY(y);
//                            edge.setPieceZ(z);
                            fullCube[count] = edge;
                            count++;
                            break;
                        case 2:
                            CenterPiece center = new CenterPiece();
                            center.setPiecePosXYZ(xyz);

//                            center.setPieceX(x);
//                            center.setPieceY(y);
//                            center.setPieceZ(z);
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
            if (piece.getPiecePosXYZ(1) == -1) piece.setColorXYZ(1, "White");
//                piece.setColorY("White");
            if (piece.getPiecePosXYZ(1) == 1) piece.setColorXYZ(1, "Yellow");
//                piece.setColorY("Yellow");
            if (piece.getPiecePosXYZ(0) == -1) piece.setColorXYZ(0, "Red");
//                piece.setColorX("Red");
            if (piece.getPiecePosXYZ(0) == 1) piece.setColorXYZ(0, "Orange");
//                piece.setColorX("Orange");
            if (piece.getPiecePosXYZ(2) == -1) piece.setColorXYZ(2, "Green");
//                piece.setColorZ("Green");
            if (piece.getPiecePosXYZ(2) == 1) piece.setColorXYZ(2, "Blue");
//                piece.setColorZ("Blue");
        }

    }


    public void rotateSide(String xyz, int position, boolean isClockwise, Piece[] fullCube) {
        final int X = 0;
        final int Y = 1;
        final int Z = 2;
        int rotationAxis = -1;
        int swapAxis1 = -1;
        int swapAxis2 = -1;
        if (xyz.equals("x")) {
            rotationAxis = X;
            swapAxis1 = Y;
            swapAxis2 = Z;
        }
        // dont know if y & z swap axes are in the right order or if it even matters
        if (xyz.equals("y")) {
            rotationAxis = Y;
            swapAxis1 = X;
            swapAxis2 = Z;
        }
        if (xyz.equals("z")) {
            rotationAxis = Z;
            swapAxis1 = Y;
            swapAxis2 = X;
        }

        if (!isClockwise) {
            int store = swapAxis1;
            swapAxis1 = swapAxis2;
            swapAxis2 = store;

        }


        // x, -1, false
        // swap y and z in all equations for clockwise

        // corner1 [-1,-1,-1]   V <-  if y = z, y * -1
        //corner2 [-1, 1,-1]    V  |  if y != z, set z equal to y
        //corner3 [-1, 1, 1]    V  |
        //corner4 [-1,-1, 1]    ---

        // edge1 [-1,0,-1]      if y or z is not zero, change to zero (this step is always done, on top of next steps)
        // edge2 [-1,1,0]       if y is not zero, move to z
        // edge3 [-1,0,1]       if z is not zero, move to y, * -1
        // edge4 [-1,-1,0]

        //swap1 = z
        //swap2 = y

        for (Piece piece : fullCube) {
            if (piece.getPiecePosXYZ()[rotationAxis] == position) {

                //swap colors of 2 other axes
                String colorSwap = piece.getColorXYZ()[swapAxis1];
                piece.setColorXYZ(swapAxis1, piece.getColorXYZ(swapAxis2));
                piece.setColorXYZ(swapAxis2, colorSwap);


                if (piece.getZeroCount() == 0) {
                    if (piece.getPiecePosXYZ(swapAxis1) == piece.getPiecePosXYZ(swapAxis2)) {
                        piece.setPiecePosXYZ(swapAxis2, piece.getPiecePosXYZ(swapAxis2) * -1); //swapAxis too confusing
                    } else piece.setPiecePosXYZ(swapAxis1, piece.getPiecePosXYZ(swapAxis2));
                } else if (piece.getZeroCount() == 1) {
                    int storeSwap1 = piece.getPiecePosXYZ(swapAxis1);
                    int storeSwap2 = piece.getPiecePosXYZ(swapAxis2);

                    if (piece.getPiecePosXYZ(swapAxis1) != 0) piece.setPiecePosXYZ(swapAxis1, 0);
                    else if (piece.getPiecePosXYZ(swapAxis2) != 0) piece.setPiecePosXYZ(swapAxis2, 0);

                    if (storeSwap1 != 0) piece.setPiecePosXYZ(swapAxis2, storeSwap1 * -1);
                    if (storeSwap2 != 0) piece.setPiecePosXYZ(swapAxis1, storeSwap2);

                    System.out.println("test");
                    //boy I sure hope this works

                }
            }
        }

    }

    public void printCube(Piece[] fullCube) {
        String[][] whiteFace = new String[3][3];
        String[][] yellowFace = new String[3][3];
        String[][] redFace = new String[3][3];
        String[][] orangeFace = new String[3][3];
        String[][] blueFace = new String[3][3];
        String[][] greenFace = new String[3][3];

        for (Piece piece : fullCube) {
            if (piece.getPiecePosXYZ(1) == -1) {
                whiteFace[piece.getPiecePosXYZ(2) + 1][piece.getPiecePosXYZ(0) + 1] = piece.getColorXYZ(1);
            }
            if (piece.getPiecePosXYZ(1) == 1) {
                yellowFace[piece.getPiecePosXYZ(2) + 1][piece.getPiecePosXYZ(0) + 1] = piece.getColorXYZ(1);
            }
            if (piece.getPiecePosXYZ(0) == -1) {
                redFace[piece.getPiecePosXYZ(1) + 1][piece.getPiecePosXYZ(2) + 1] = piece.getColorXYZ(0);
            }
            if (piece.getPiecePosXYZ(0) == 1) {
                orangeFace[piece.getPiecePosXYZ(1) + 1][piece.getPiecePosXYZ(2) + 1] = piece.getColorXYZ(0);
            }
            if (piece.getPiecePosXYZ(2) == -1) {
                greenFace[piece.getPiecePosXYZ(0) + 1][piece.getPiecePosXYZ(1) + 1] = piece.getColorXYZ(2);
            }
            if (piece.getPiecePosXYZ(2) == 1) {
                blueFace[piece.getPiecePosXYZ(0) + 1][piece.getPiecePosXYZ(1) + 1] = piece.getColorXYZ(2);
            }


        }

        String[][][] faces = new String[][][] {whiteFace,yellowFace,redFace,orangeFace,blueFace,greenFace};
        for (String[][] face : faces) {
            System.out.println(face[1][1] + " Face:");
            for (String[] row : face) {
                System.out.println(Arrays.toString(row));
            }
        }


    }

}


