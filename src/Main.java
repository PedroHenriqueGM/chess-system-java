import boardgame.*;
import chess.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Origem: ");
            ChessPosition src = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Destino: ");
            ChessPosition trg = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(src, trg);
        }
    }
}