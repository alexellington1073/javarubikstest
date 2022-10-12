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

    public void setPieces(Piece[] fullPieceArr) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {

                }
            }
        }
    }

//TODO what is this
//    public void popColors(Piece[] pieceArr) {
//
//        for (Colors colorVal : Colors.values()) {
//            String color = String.valueOf(colorVal);
//            for (int i = 0; i < 4; i ++) {
//                int random = (int)Math.random();
//                pieceArr[random]
//            }
//
//            }
//
//        }
    }


