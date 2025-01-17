package com.example.reversi

interface ReversiConnector {
    fun square(x: Int, y: Int): SquarePiece
    fun moveFromPlayer(moveFromPlayer: Square)
    fun returnPossibleMoves(): MutableMap<Square, Int>
    fun moveFromAI()
}