package game

class Dice {

    companion object {
        fun rollDice() :Int {
            return (1..6).random()
        }
    }
}