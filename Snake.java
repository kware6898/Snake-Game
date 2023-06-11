import java.util.LinkedList;

public class Snake{
    private LinkedList<Cell> snakePartList = new LinkedList<>();
    private Cell head;
    private int start=5;

    public Snake(Cell initPos, Board board){
        for(int i=0; i<start; i++){
            head = new Cell(initPos.getRow(), initPos.getCol()+1*i);
            snakePartList.addFirst(head);
            head.setType(Type.SNAKE);
            board.setCell(head.getRow(), head.getCol(), Type.SNAKE);
        }
    }

    public void grow(Cell nextCell, Board board){
        head = nextCell;
        head.setType(Type.SNAKE);
        board.setCell(head.getRow(), head.getCol(), Type.SNAKE);
        snakePartList.addFirst(head);
    }

    void move(Cell nextCell, Board board){
        Cell tail = snakePartList.removeLast();
        // tail.setType(Type.EMPTY);
        board.setCell(tail.getRow(), tail.getCol(), Type.EMPTY);

        head = nextCell;
        head.setType(Type.SNAKE);
        board.setCell(head.getRow(), head.getCol(), Type.SNAKE);
        snakePartList.addFirst(head);
    }

    public LinkedList<Cell> getSnakePartList(){
        return snakePartList;
    }

    public void setSnakePartList(LinkedList<Cell> snakePartList){
        this.snakePartList = snakePartList;
    }

    public Cell getHead(){
        return head;
    }

    public void setHead(Cell head){
        this.head = head;
    }
}
