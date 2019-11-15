public class Ktour{
    private int[][] board = new int[8][8];
    private int[] rows = {-2, -1, 1, 2,  2,  1, -1, -2};
    private int[] cols = { 1,  2, 2, 1, -1, -2, -2, -1};
    public static int counter = 0;

    public static void main(String[] args){
        Ktour tour = new Ktour();
        tour.kTour(7,7,1);
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                System.out.print( " " + tour.board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("time it ran " + counter);
    }
    public Boolean kTour(int r, int c, int move){
        counter++;
        if(move==65){
            return true;
        }
        if(move == 1)
        {
            board[r][c] = move;
            move++;
        }
        if(validMove(r-2,c+1)){
            board[r-2][c+1] = move;
            if(kTour(r-2,c+1,move+1)){
                return true;
            }
            else board[r-2][c+1] = 0;
        }
        if(validMove(r-1,c+2)){
            board[r-1][c+2] = move;
            if(kTour(r-1,c+2,move+1)){
                return true;
            }
            else board[r-1][c+2] = 0;
        }
        if(validMove(r+1,c+2)){
            board[r+1][c+2] = move;
            if(kTour(r+1,c+2,move+1)){
                return true;
            }
            else board[r+1][c+2] = 0;
        }
        if(validMove(r+2,c+1)){
            board[r+2][c+1] = move;
            if(kTour(r+2,c+1,move+1)){
                return true;
            }
            else board[r+2][c+1] = 0;
        }
        if(validMove(r+2,c-1)){
            board[r+2][c-1] = move;
            if(kTour(r+2,c-1,move+1)){
                return true;
            }
            else board[r+2][c-1] = 0;
        }
        if(validMove(r+1,c-2)){
            board[r+1][c-2] = move;
            if(kTour(r+1,c-2,move+1)){
                return true;
            }
            else board[r+1][c-2] = 0;
        }
        if(validMove(r-1,c-2)){
            board[r-1][c-2] = move;
            if(kTour(r-1,c-2,move+1)){
                return true;
            }
            else board[r-1][c-2] = 0;
        }
        if(validMove(r-2,c-1)){
            board[r-2][c-1] = move;
            if(kTour(r-2,c-1,move+1)){
                return true;
            }
            else board[r-2][c-1] = 0;
        }
        return false;

    }
    private Boolean validMove(int r, int c){
        if((r<board.length&& r >= 0)&& (c<board[0].length && c >= 0) && board[r][c] == 0 ){
            return true;
        }
        else return false;
    }


}
