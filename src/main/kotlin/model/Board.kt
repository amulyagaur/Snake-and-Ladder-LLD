package model

class Board(val capacity: Int, val transporters: List<Transporter>) {

    fun determineFinalLocation(initialLocation: Int): Int {
        if(initialLocation > capacity)
            return capacity
        var finalLocation = initialLocation
        while (true) {
            val newLocation = getTransporterAtLocation(finalLocation)?.endPoint
            if(newLocation == null)
                break
            else
                finalLocation = newLocation
        }
        return finalLocation
    }

    private fun getTransporterAtLocation(location: Int): Transporter? {
        return transporters.find {
            it.startPoint == location
        }
    }
}