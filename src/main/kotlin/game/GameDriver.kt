package game

import model.Board
import model.Ladder
import model.Player
import model.Snake

fun main(){
    val player1 = Player(1,"Player 1")
    val player2 = Player(2,"Player 2")

    val ladderList = listOf(
        Ladder(1,1,38),
        Ladder(2,21,42),
        Ladder(3,4,14),
        Ladder(4,9,31),
        Ladder(5,28,84),
        Ladder(6,51,67),
        Ladder(7,72,91),
        Ladder(8,80,99)
    )

    val snakeList = listOf(
        Snake(1,17,7),
        Snake(2,62,19),
        Snake(3,64,60),
        Snake(4,98,79),
        Snake(5,95,75),
        Snake(6,87,36),
        Snake(7,54,34),
        Snake(8,93,73)
    )

    val board = Board(100,snakeList+ladderList)

    val gameSession = GameSession(listOf(player1,player2),board)
    val winner = gameSession.playGame()
    println("Winner of the game is ${winner.name}")
}