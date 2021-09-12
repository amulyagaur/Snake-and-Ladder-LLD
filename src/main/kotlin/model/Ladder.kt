package model

data class Ladder(
    override val id: Int,
    override val startPoint: Int,
    override val endPoint: Int,
) : Transporter