public class EdgePiece extends Piece {

    private String colorX = "";
    private String colorY = "";




    public EdgePiece(String colorX, String colorY) {
        this.colorX = colorX;
        this.colorY = colorY;
    }

    public EdgePiece() {

    }






    public String getColorX() {
        return colorX;
    }

    public void setColorX(String colorX) {
        this.colorX = colorX;
    }

    public String getColorY() {
        return colorY;
    }

    public void setColorY(String colorY) {
        this.colorY = colorY;
    }

}
