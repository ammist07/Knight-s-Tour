public class KnightTour {
    private int[][] board = new int[8][8];
    private int[]rows = { -2, -1, 1, 2,  2,  1, -1, -2};
    private int[] cols = { 1,  2, 2, 1, -1, -2, -2, -1};
    public static int count = 0;


    public Boolean kTour(int r, int c, int move){
       if(move == 64){
           return true;
       }
       if(move == 0){
           board[r][c] = move;
           move++;
       }
       for(int i = 0; i < board.length;i++){
           if(validMove(r + rows[i],c + cols[i])){
               count++;
               board[r + rows[i]][c + cols[i]] = move;
               if(kTour(r + rows[i],c + cols[i],move+1)){
                   return true;
               }
               else board[r + rows[i]][c + cols[i]] = 0;
       }
       }
       return false;
    }
    private Boolean validMove(int x, int y){
        if((x<board.length&& x >= 0)&& (y<board[0].length && y >= 0) && board[x][y] == 0 ){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        KnightTour tour = new KnightTour();
        tour.kTour(0,4,1);
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                System.out.print( " " + tour.board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("time it ran " + count);
    }


}
