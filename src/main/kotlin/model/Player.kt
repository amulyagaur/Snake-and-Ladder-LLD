package model

import game.Dice

class Player(val id: Int, val name: String) {
    private var currentLocation: Int = 0

    fun play(): Int {
        return Dice.rollDice() + currentLocation
    }

    fun updateLocation(newLocation: Int) {
        this.currentLocation = newLocation
    }

    fun getLocation(): Int {
        return this.currentLocation
    }
}