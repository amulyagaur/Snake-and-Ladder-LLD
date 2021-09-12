package game

import model.Board
import model.Player

class GameSession(val players: List<Player>, val board: Board) {

    fun playGame(): Player {
        var isWinnerDecided = false
        var winner:Player? = null
        println("Starting Game")
        while (!isWinnerDecided) {
            players.forEach { player ->
                println("${player.name} chance to play at ${player.getLocation()}")
                val playerMove = player.play()
                println("${player.name} played $playerMove")
                player.updateLocation(board.determineFinalLocation(playerMove))
                println("New location of ${player.name} is ${player.getLocation()}")
                if (player.getLocation() == board.capacity){
                    isWinnerDecided = true
                    winner = player
                }
            }
        }
        return winner ?: throw RuntimeException("Cannot determine winner for the session")
    }
}