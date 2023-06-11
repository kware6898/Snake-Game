public class Board{
    final int rowC, colC;
    private Cell[][] cells;

    public Board(int rowC, int colC){
        this.rowC = rowC;
        this.colC = colC;
        cells = new Cell[rowC][colC];
        for(int r = 0; r < rowC; r++){
            for(int c = 0; c < colC; c++){
                cells[r][c] = new Cell(r, c);
                cells[r][c].setType(Type.EMPTY);
                if(r == 0 || c == 0 || r == rowC-1 || c == colC-1){
                    cells[r][c].setType(Type.WALL);
                }
            }
        }
    }

    public Cell[][] getCells(){
        return cells;
    }

    public void setCells(Cell[][] cells){
        this.cells = cells;
    }

    public void setCell(int row, int col, Type type){
        cells[row][col].setType(type);
    }

    public Type getCellType(int row, int col){
        return cells[row][col].getType();
    }

    public void generateFood(){
        int row;
        int col;
        while(true){
            row = (int)(Math.random()*rowC);
            col = (int)(Math.random()*colC);
            if(cells[row][col].getType() == Type.EMPTY){
                break;
            }
        }
        cells[row][col].setType(Type.FOOD);
    }
}
