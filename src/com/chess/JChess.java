package com.chess;

import com.chess.engine.board.*;
import com.chess.engine.pieces.Pawn;
import com.chess.gui.Table;

public class JChess {
    public static void main(String[] args) {
        Board board = Board.createStandardBoard();

        System.out.println(board);

//        Pawn e2 = (Pawn) board.getTile(52).getPiece();
//        Move.PawnJump e2_e4 = new Move.PawnJump(board, e2, 36);
//        board = e2_e4.execute();
//        System.out.println(board);
//
//        Pawn e7 = (Pawn) board.getTile(12).getPiece();
//        Move.PawnMove e7_e5 = new Move.PawnMove(board, e7, 28);
//        board = e7_e5.execute();
//        System.out.println(board);

        Table table = new Table();
    }
}
