public class Cell{
    private final int row, col;
    private Type type;
    //set row and col upon first initiation
    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }
    //set cell type
    public void setType(Type type){
        this.type = type;
    }
    //get cell type
    public Type getType(){return type;}
    //get row
    public int getRow(){return row;}
    //get col
    public int getCol(){return col;}
}
