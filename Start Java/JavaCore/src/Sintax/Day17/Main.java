package Day17;

public class Main {
    public static void main(String[] arg){
        Chess [] arr = {Chess.PAWN_WHITE,Chess.PAWN_WHITE,Chess.PAWN_WHITE,Chess.PAWN_WHITE, Chess.ROOK_BLACK,Chess.ROOK_BLACK,Chess.ROOK_BLACK,Chess.ROOK_BLACK};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i].toString() + " ");
        }

        System.out.println("\n***");
        Chess[][] board = {
                {Chess.ROOK_BLACK, Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY, Chess.ROOK_BLACK,Chess.KING_BLACK, Chess.EMPTY},
                {Chess.EMPTY, Chess.ROOK_WHITE,Chess.EMPTY,Chess.EMPTY, Chess.PAWN_BLACK,Chess.PAWN_BLACK,Chess.EMPTY,Chess.PAWN_BLACK},
                {Chess.PAWN_BLACK, Chess.EMPTY,Chess.KNIGHT_BLACK, Chess.EMPTY, Chess.EMPTY, Chess.EMPTY, Chess.PAWN_BLACK, Chess.EMPTY},
                {Chess.QUEEN_BLACK,Chess.EMPTY,Chess.EMPTY,Chess.BISHOP_WHITE,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY},
                {Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.BISHOP_BLACK, Chess.PAWN_WHITE,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY},
                {Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY, Chess.BISHOP_WHITE, Chess.PAWN_WHITE, Chess.EMPTY,Chess.EMPTY},
                {Chess.PAWN_WHITE,Chess.EMPTY,Chess.EMPTY,Chess.QUEEN_WHITE, Chess.EMPTY,Chess.PAWN_WHITE,Chess.EMPTY,Chess.PAWN_WHITE},
                {Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.EMPTY,Chess.ROOK_WHITE, Chess.KING_WHITE,Chess.EMPTY,}
        };
        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.Print();
    }
    public static class ChessBoard{
        private Chess[][] board = new Chess[8][8];

        public ChessBoard(Chess[][] board) {
            this.board = board;
        }
        public void Print(){
            for (int i=0;i<8;i++){
                for (int j=0;j<8;j++){
                    System.out.print(board[i][j].toString() + " ");
                }
                System.out.println();
            }
        }
    }
}
